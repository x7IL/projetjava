import org.mp4parser.Box;
import org.mp4parser.IsoFile;
import org.mp4parser.boxes.iso14496.part12.*;
import java.io.*;
import java.nio.channels.FileChannel;


/**
 * Change metadata and make sure chunkoffsets are corrected.
 */
public class libtest3 {

    public static void main(String[] args) throws IOException {
        String f = ";";
        FileChannel fc = new FileInputStream("/Users/wx/IdeaProjects/projet java/1365070268951.mp4").getChannel();
        IsoFile isoFile = new IsoFile(fc);
        MovieBox moov = isoFile.getMovieBox();
        for(Box b : moov.getBoxes()) {
            String a = String.valueOf(b);
            for(int i = 0; i <a.length();i++){
                if(a.charAt(i) == f.charAt(0)){
                    System.out.println();
                }
                System.out.print(a.charAt(i));
            }

        }
    }
}