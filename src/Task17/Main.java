package Task17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void writeFile(String path, String data) throws IOException {
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(data);
        }
    }

    public static void readFile(String path) throws IOException {
        try (FileReader fileReader = new FileReader(path)) {
            int charInt;
            while ((charInt = fileReader.read()) != -1) {
                System.out.print((char) (charInt));
            }
        }
    }

    public static void appendWriteFile(String path, String data) throws IOException {
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write(data);
        }
    }

    public static void main(String[] args) throws IOException {
        writeFile(
                "D:\\Projects\\Java\\JavaFX\\src\\main\\java\\Practic17\\output.txt",
                "test\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\n"
        );
        readFile("D:\\Projects\\Java\\JavaFX\\src\\main\\java\\Practic17\\output.txt");
        appendWriteFile(
                "D:\\Projects\\Java\\JavaFX\\src\\main\\java\\Practic17\\output.txt",
                "test\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\n"
        );
    }
}
