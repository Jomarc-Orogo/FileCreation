import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String []args){
        
    //writing text to a file 

    //   try{  
        
    //     File main = new File("main.txt");
    //     FileWriter writer = new FileWriter(main);

    //     writer.write("HEloo madlang people.\n");
    //     writer.write("Mabuhayy!!.\n");
    //     writer.write("Mini miss U, balik kaba plsss");
    //     writer.close();

    //     System.out.println("Nisulod na judd siya");

    //   }catch (Exception e ) {
    //     System.out.println("Naurerr");
    //   }

// reading text in file

            try{
                File main = new File("main.txt");
                Scanner scan = new Scanner(main);

                while(scan.hasNextLine()){
                    System.out.println(scan.nextLine());
                }

            }catch (Exception e){
                System.out.println("Naurerr");
            }
    }
    
}