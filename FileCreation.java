import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main (String[] args){

        File textFile = new File("main.txt");
        try{
            if (textFile.createNewFile()) {

            System.out.println("file created successfully!");
            } else {
            System.out.println("file Creation unsuccessful");
            }
        } catch (IOException e ) {
            System.out.println("Error still continuing");
            //System.out.println(e.printStackTrace(););
        }
    }
}
