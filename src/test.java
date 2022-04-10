
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;

public class test {

    public static void main(String[] args) {

        try {

            String filePath = "/Users/wx/IdeaProjects/projet java/test.mp4";

            // file to bytes[]
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));

            // bytes[] to file
            Path path = Paths.get("/Users/wx/IdeaProjects/projet java/test2.mp4");
            Files.write(path, bytes);
            // byte[] to string

            //System.out.println(bytes);

            String s = Base64.getEncoder().encodeToString(bytes);

            //System.out.println(s);

            // decode, convert base64 encoded string back to byte[]
            byte[] decode = Base64.getDecoder().decode(s);

            //String d = new String(bytes, StandardCharsets.UTF_8);
            //System.out.println("Output : " + d);

            //byte[] byteArray = new byte[]{1, 2, 3, 4, 0, 0, 5, 6};
            String str = Base64.getEncoder().encodeToString(decode);
            //System.out.println(str);
            byte[] result = Base64.getDecoder().decode(str);
            //System.out.println(Arrays.toString(result));

            String str1 = new String(result);

            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}