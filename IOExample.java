import java.io.*;
public class IOExample {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Java");
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Java I/O Operations");
        fw.close();
        System.out.println("Data written successfully.");
    }
}