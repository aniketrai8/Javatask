import java.io.File;


public class Basic {
    public static void main(String [] args){
        File file = new File("text.txt");

        System.out.println("Does the file exists: "+file.exists());
        System.out.println("Absoulete of the Path: "+file.getAbsolutePath());
    }
}
