package ru.vladislav;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.GetFile;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendVoice;
import org.telegram.telegrambots.api.objects.*;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import ru.vladislav.models.Action;
import sun.plugin2.message.*;

import java.io.IOException;
import java.util.ArrayList;


public class ExampleBot extends TelegramLongPollingBot {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new ExampleBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if (message != null && message.hasText()) {
            initAndSendMessage(message,"This is my answer. I just repeat your phrases! You send: " + message.getText());
        }
        if (message != null && message.getVoice() != null) {
            Voice voice = message.getVoice();
            java.io.File voiceMessage = null;
            String xml = "";
            try {
                GetFile getFile = new GetFile();
                getFile.setFileId(voice.getFileId());
                String filepath = null;
                try {
                    // We execute the method using AbsSender::getFile method.
                    File file = getFile(getFile);
                    // We now have the file_path
                    filepath = file.getFilePath();
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                if (filepath != null) {
                    voiceMessage = downloadFile(filepath);
                    xml = "" + ApiProvider.doPost(voiceMessage);
                }
            } catch (TelegramApiException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            ArrayList<Action> actions = QueryParser.parseQuery(XMLParser.parseXML(xml));
            for (Action action:actions) {
                initAndSendMessage(message,action.getDescription()+ " " + action.getLink());
            }

        }

    }
    private void initAndSendMessage(Message message, String text){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());

        sendMessage.setText(text);

        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public String getBotUsername() {
        return "titovvladbot";
    }

    public String getBotToken() {
        return "331135341:AAH00JDwX0_M2HYWOseOBBN3rGVi-1qL_k8";
    }
}
