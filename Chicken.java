import java.io.*;   
import java.util.*;

public class Chicken {

      private  InputStreamReader isr;
      private  BufferedReader in;
      private String chickenStatus;
      private int resignation;

    public Chicken(){
	isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    resignation = 0;
    chickenStatus = "unresigned";
    newGame();
    }
    
    public  void newGame() {
	System.out.println("Chicken appeared.");
	System.out.println("~~~~~~~~~~~~~~~~~");
	while(chickenStatus != "resigned") {
	System.out.println("what you do boi");
	String action = "";
	try {
	    action = in.readLine();
            } catch ( IOException e ) { }
	System.out.println("Aight you " + action + ".");
		resignation += Math.random() * 40;
	System.out.println("Chicken is now " + resignation + "% resigned \n");
	if(resignation >= 100) chickenStatus = "resigned";
        else {
		System.out.println("shit, chicken bouta " + action + " you!");
		resignation -= Math.random() * 14;
	System.out.println("Chicken is now " + resignation + "% resigned \n");
	}	
	}
	System.out.println("chicken resigned");
    }

    public static void main(String[] args) {
	Chicken dank = new Chicken();
    }

}
