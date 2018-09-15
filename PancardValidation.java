package usingMethods;

import java.util.Scanner;

class PancardValidation 
{
	String pan;
	Scanner obj=new Scanner(System.in);
	public boolean isValidPan(String pan)
	{
		System.out.println(" You Are in PanCard Validation process.");
		System.out.print(" Enter your Pan Number : ");
		pan=obj.next();
		String upperCaseChars = "(.*[A-Z].*)";
	 	String numbers = "(.*[0-9].*)";
	 	String lowerCaseChars = "(.*[a-z].*)";

	 	if (pan.length()==10)
	     {
	    	 if (pan.matches(upperCaseChars))
	    	 {      
	    		 if (!pan.matches(lowerCaseChars))
				  {
	    			 if (pan.matches(numbers))
	    			 {   
	    				System.out.println(" valid pan.");
	    			 }
	    			 else
	    			 {
	    				 System.out.println(" invalid pan because you didn't include any number in pan");
	    			 }
				  }
	    		 else
	    		 {
	    			 System.out.println(" invalid pan because you entered lowercase alphabet.");
	    		 }
	    	 }
	    	 else
	    	 {
	    		 System.out.println(" invalid pan because you didn't include any character in Uppercase.");
	    	 }
	     }
	 	else
	 	{
	 		System.out.println(" invalid pan because you entered wrong format.");
	 	}
	 		 	
		/*if(pan.length()<10)
		{
			System.out.println(" invalid pan number ");
		}
		else
		{
			if((pan.charAt(0)>=65 && pan.charAt(0)<=97) ||
					(pan.charAt(1)>=65 && pan.charAt(1)<=97) ||
						 (pan.charAt(2)>=65 && pan.charAt(2)<=97) || 
						 	  (pan.charAt(3)>=65 && pan.charAt(3)<=97) || 
						 	  		(pan.charAt(4)>=65 && pan.charAt(4)<=97) ||
						 	  			(pan.charAt(5)>=65 && pan.charAt(5)<=97) ||
						 	  				(pan.charAt(6)>=65 && pan.charAt(6)<=97) ||
						 	  					(pan.charAt(7)>=65 && pan.charAt(7)<=97) ||
						 	  						(pan.charAt(8)>=65 && pan.charAt(8)<=97) ||
						 	  							(pan.charAt(9)>=65 && pan.charAt(9)<=97) ||
						 	  								(pan.charAt(10)>=65 && pan.charAt(10)<=97))
			{
				System.out.println(" valid pan ");
			}
		 
			else
			{
				System.out.println(" invalid");
			}
		}*/
		return false;
	}
	
}