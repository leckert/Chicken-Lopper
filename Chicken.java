import java.io.*;   
import java.util.*;

public class Chicken {

      private  InputStreamReader isr;
      private  BufferedReader in;

    public Chicken(){
	isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
    }
    
    public  void newGame() {
	System.out.println("Chicken appeared.");
	System.out.println("~~~~~~~~~~~~~~~~~");
	System.out.println("what you do boi");
	String action = "";
	try {
	    action = in.readLine();
            } catch ( IOException e ) { }
	System.out.println("Aight you " + action + ".");
	System.out.println("chicken resigned");
    }

    public static void main(String[] args) {
	Chicken dank = new Chicken();
    }

}
