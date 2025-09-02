import java.io.*;

public class Checked {
    public static void main(String[] args) {
        try {
            readFile("Sample.txt");

        } catch (IOException e) {
            System.out.println("I/O Exception observed :" + e.getMessage());
        }
    }


    public static void readFile(String Sample) throws IOException {
        FileReader file = new FileReader(Sample);
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }
}

