import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadData {
    public void read(){
        try {
            Scanner in = new Scanner(new File("tsisbs.csv"));
            while(in.hasNext()){
                System.out.println(in.nextLine());
            }
            in.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}