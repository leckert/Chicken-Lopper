import java.io.*;   
import java.util.*;

public class Chicken {

      private  InputStreamReader isr;
      private  BufferedReader in;
      private String chickenStatus;
      private int resignation;
      private int attack;
	private String action;

    public Chicken(){
	isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    resignation = 0;
    chickenStatus = "unresigned";
	action = "pecc";
    newGame();
    }
    
    public  void newGame() {
	System.out.println("Chicken appeared.");
	System.out.println("~~~~~~~~~~~~~~~~~");
	while(chickenStatus != "resigned") {

	String s = "";
	s += "\nChoose your attack: \n";
   	 s += "\t1: Gates Shock\n";
   	 s += "\t2: Pappu Blast\n";
	s += "\t3: Son Rest\n";
   	 s += "\t4: Freestyle\n";
  	  s += "Selection: ";
    	System.out.print( s );

	try {
	    attack = Integer.parseInt( in.readLine() );
    } catch ( IOException e ) { }
	
	if (attack == 4) {



	System.out.println("what you do boi");
	
	try {
	    action = in.readLine();
            } catch ( IOException e ) { }
	System.out.println("Aight you " + action + ".");
		resignation += Math.random() * 40;
	System.out.println("Chicken is now " + resignation + "% resigned \n");
	if(resignation >= 100) chickenStatus = "resigned";
        
		
	
      }

	if (attack == 1) {
		System.out.println("Chicken gets [[ GATES SHOCKED ]]");
                resignation += Math.random() * 15;
		}
	if (attack == 2) {
				System.out.println("Chicken gets [[ PAPPU BLASTED ]]");
resignation += Math.random() * 40 - 40;
}
	if (attack == 3) {
			System.out.println("You use [[ SON REST ]]\n You do nothing");
}
			
			System.out.println("Chicken is now " + resignation + "% resigned \n");




	System.out.println("shit, chicken bouta " + action + " you!");
		resignation -= Math.random() * 14;
	System.out.println("Chicken is now " + resignation + "% resigned \n");
	}
	System.out.println("chicken resigned");
    }

    public static void main(String[] args) {
	Chicken dank = new Chicken();
    }

}
