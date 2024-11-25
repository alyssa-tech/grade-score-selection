package LAB4;

import java.util.Scanner;

public class Grade {
	public static void main (String [] args) {
	      double score, fscore, percentage; //declare variables
	      Scanner scanner = new Scanner (System.in);
	      
	      //read input
	      System.out.print ("Enter full score = ");
	      fscore = scanner.nextDouble (); 
	      
          System.out.print ("Enter score = ");
	      score = scanner.nextDouble (); 

          percentage = (score/fscore) * 100;
      
	      if (percentage >= 80)
	    	 System.out.println ("GOOD");
	    
	      else if (percentage >= 60)
	    	 System.out.println ("FAIR");
	      
	      else if (percentage >= 40)
	    	 System.out.println ("WEAK");
        
          if (percentage < 40)
	    	 System.out.println ("FAIL");
            
          else
              System.out.println ("INVALID PERCENTAGE");    
         
  }      
}
