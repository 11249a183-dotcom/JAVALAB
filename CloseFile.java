import java.io.FileWriter;
import java.io.IOException;
public class CloseFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("File is open.");
        fw.close();
        System.out.println("File closed successfully.");
    }
}