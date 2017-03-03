import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public static void main(String[] args) {
        try {
            doPost();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void doPost() throws IOException {

        Path music = Paths.get("C://Users/Liia/Downloads/speech.wav");
        byte[] byteArray = Files.readAllBytes(music);
        String uuid = "423a423a423a423a423a423a423a423a";
        String urlParameters = "uuid=" + uuid + "&key=" + apiKey + "&topic=numbers&lang=ru-RU";

        URL apiUrl = new URL("https://" + host + url + urlParameters);

        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Host", host);
        connection.setRequestProperty("Content-Type", "audio/x-speex");
        connection.setDoOutput(true);

        DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        wr.writeBytes(String.valueOf(byteArray));
        wr.flush();
        wr.close();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
