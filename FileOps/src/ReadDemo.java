import java.io.*;



public class readDemo {
    public static void main(String [] args){
        try(BufferedReader reader = new BufferedReader(new FileReader("text"))){
            String line;
            while((line= reader.readLine()) != null){
            System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

}
}
