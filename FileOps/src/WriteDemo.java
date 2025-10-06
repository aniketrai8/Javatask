import java.io.*;


public class writeDemo {
    public static void main(String [] args){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"))){
            writer.write("Info: Application started");
            writer.write("Error - Database connection Failed");
            writer.write("Info: Retrying connection");
            writer.write("Error: TimeOut while connecting");

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
