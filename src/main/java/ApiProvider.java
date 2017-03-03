import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Ruslan on 03.03.2017.
 */
public class ApiProvider {
    private static String url = "/asr_xml?";
    private static String charset = "UTF-8";
    private static String apiKey = "8b2415ac-5b77-4b6e-b0e1-3496a8ffbf3c";
    private static String host = "asr.yandex.net";

    static String doPost(File voiceMessage) throws IOException {

        Path music = Paths.get(voiceMessage.getAbsolutePath());
        byte[] byteArray = Files.readAllBytes(music);
        String uuid = "423a423a423a423a423a423a423a423a";
        String urlParameters = "uuid=" + uuid + "&key=" + apiKey + "&topic=queries&lang=ru-RU";

        URL apiUrl = new URL("https://" + host + url + urlParameters);

        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Host", host);
        connection.setRequestProperty("Content-Type", "audio/ogg;codecs=opus");
        connection.setDoOutput(true);

        DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        wr.write(byteArray);
        wr.flush();
        wr.close();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                connection.getInputStream()));
        String inputLine;
        StringBuilder builder = new StringBuilder();
        while ((inputLine = in.readLine()) != null)
            builder.append(inputLine);
        in.close();
        return builder.toString();
    }
}
