import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class stringbyte {

    public static void main(String[] args)
    {
        File file = new File("/Users/wx/IdeaProjects/projet java/test.mp4");

        byte[] b = new byte[(int) file.length()];
        try
        {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(b);
            for (int i = 0; i < b.length; i++) {
                System.out.print((char)b[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            e.printStackTrace();
        }
        catch (IOException e1)
        {
            System.out.println("Error Reading The File.");
            e1.printStackTrace();
        }
    }
}
    /*

    chercher l'entete,
    magic code ==> donne l'extension, en quoi c'est codé
    public static void main(String[] args) {
        byte[] byteArray = { 'P', 'A', 'N', 'K', 'A', 'J' };
        byte[] byteArray1 = { 80, 65, 78, 75, 65, 74 };

        String str = new String(byteArray);
        String str1 = new String(byteArray1);

        System.out.println(str);
        System.out.println(str1);
    }*/
