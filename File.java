import java.io.IOException;
import java.io.FileWriter;


public class File {

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

        File.writeFile("Hello", "test.txt");
    }
}



