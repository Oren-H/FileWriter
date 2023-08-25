import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {
    
    public void writeFile (String str, String fileName){
       BufferedWriter writer = null;
    try
    {
        writer = new BufferedWriter( new FileWriter(fileName));
        writer.write(str);

    }
    catch ( IOException e)
    {
    }
    finally
    {
        try
        {
            if ( writer != null)
            writer.close( );
        }
        catch ( IOException e)
        {
        }
    }
        }
}
