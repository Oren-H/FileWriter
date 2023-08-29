import java.io.IOException;
import java.io.FileWriter;


public class FileWriting {

    public static void writeFile(String str, String fileName){
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(str);
            fw.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[]args){

        FileWriting.writeFile("Hello", "test.txt");
    }
}



