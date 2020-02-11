package Exam;

public class PrimeNumbers {
	 public static void main (String[] args)
	   {		
	      for(int i=3;i<=100;i++) {
	    	  int m =  0;
	    	  for ( int j=2; j<1; j++) {
	    		  if (i%j == 0)
	    			  m++;
	    			  
	    	  }
	    	  if (m == 0)
	    	  {
	    		  System.out.println(i+"");
	    		  
	    	  }
	      }
	   }

}
