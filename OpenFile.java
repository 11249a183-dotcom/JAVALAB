import java.io.File;
public class OpenFile {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        if (file.exists()) {
            System.out.println("File opened successfully.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}