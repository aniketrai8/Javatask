import java.io.*;

public class errorCount {
    public static void main(String [] args){
        int count =0;

        try(BufferedReader reader = new BufferedReader(new FileReader("Log.txt"))){
            String line;

            while((line = reader.readLine())!= null){
                if(line.contains("error")){
                    count++;
                }
            }

            System.out.println("Total no of error occurence: "+count);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
