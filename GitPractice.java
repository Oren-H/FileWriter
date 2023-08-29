import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
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

    public static String readFile(String fileName){
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            return str;
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static int countCharacters(String fileName) {
        String output = readFile(fileName);
        if (output == null) {
            return -1;
        }
        return output.length();
    }

    public static void main(String[]args){

        GitPractice.writeFile("Hello", "test.txt");
        System.out.println(GitPractice.readFile("test.txt"));
        System.out.println(GitPractice.countCharacters("test.text"));
    }
}



