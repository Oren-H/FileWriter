import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;


public class GitPractice {

    public static void writeFile(String str, String fileName){
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(str);
            fw.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String fileName){
        try {
            FileReader fr = new FileReader(fileName);
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void main(String[]args){

        GitPractice.writeFile("Hello", "test.txt");
        GitPractice.readFile("test.txt");
    }
}



