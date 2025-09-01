

import java.io.IOException;
import java.io.InputStreamReader;


 class FileHandling {
    public static void main(String[] args){
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Enter some Letters: ");
            int letters = isr.read();
            while(isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();
            }

            isr.close();
            System.out.println();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
