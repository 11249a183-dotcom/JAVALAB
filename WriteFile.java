import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt");

        fw.write("Hello Java!");
        fw.write("\nThis is file writing.");

        fw.close();

        System.out.println("Data written successfully.");
    }
}