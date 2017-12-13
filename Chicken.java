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

	boolean canPappu = false;
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
	System.out.println("\nAight you " + action + ".");
		resignation += Math.random() * 40;
	System.out.println("Chicken is now " + resignation + "% resigned \n");
	
    }

	if (attack == 1) {
		System.out.println("\nChicken gets [[ GATES SHOCKED ]]");
        resignation += Math.random() * 15;
	}

	if (attack == 2) {
		if (canPappu) {
		System.out.println("\nChicken gets [[ PAPPU BLASTED ]]");
		resignation += Math.random() * 40;
		canPappu = false;
	    }
	    else {
	    System.out.println("\n[[ PAPPU BLAST ]] is attempted, but you are too weak! \nYou must rest first...");
	    }
	}

	if (attack == 3) {
			System.out.println("\nYou use [[ SON REST ]]\n Your power grows...");
			canPappu = true;
	}


	System.out.println("\nChicken is now " + resignation + "% resigned \n");

	System.out.println("shit, chicken bouta " + action + " you!");
	resignation -= Math.random() * 14;

	System.out.println("\nChicken is now " + resignation + "% resigned \n");
	if(resignation >= 100) chickenStatus = "resigned";
	
	}
	
	System.out.println("chicken resigned");
    }

    public static void main(String[] args) {
	Chicken dank = new Chicken();
    }

}
