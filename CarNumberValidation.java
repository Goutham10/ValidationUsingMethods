package usingMethods;

import java.util.Scanner;

class CarNumberValidation 
{
	String car;
	Scanner obj=new Scanner(System.in);
	public boolean isValidCarNumber(String car)
	{
	System.out.println(" You are in CarNo. Validation process.");	 
	System.out.print(" Enter your car number : ");
	car=obj.next();
	String upperCaseChars = "(.*[A-Z].*)";//need to understand why there is .* mandatory. without we cannot get accurate results.
 	String numbers = "(.*[0-9].*)";
 	String lowerCaseChars = "(.*[a-z].*)";

 	if (car.length()>=5 && car.length()<=10)
    {
 		if (car.matches(upperCaseChars))
 			{          
 				if (!car.matches(lowerCaseChars))
 				{
 					if (car.matches(numbers))
 					{ 
 						System.out.println(" valid car number ");
 					}
 					else
 					{
 						System.out.println(" invalid car number because you didn't entered numbers.");
 					}
 				}
 				else
 				{
 					System.out.println(" invalid car number because you entered lowercase alphabet ");
 				}
 			}
 		else
 		{
 			System.out.println(" invalid car number because you didn't entered uppercase alphabet ");
 		}
    }
 	else
 	{
 		System.out.println(" invalid car number because you entered wrong format.");
 	}
	  
	 /*if(car.length()<5)
	 {
		 System.out.println(" invalid car number. ");
	 }
	 
	 else
	 {
		 if((car.charAt(0)>=65 && car.charAt(0)<=97 ) && 
				 (car.charAt(1)>=65 && car.charAt(1)<=97) &&
				 	(car.charAt(4)>=65 && car.charAt(4)<=97) &&
				 		(car.charAt(5)>=65 && car.charAt(5)<=97))
		 {
			 System.out.println(" valid car number ");
		 }
		 else
			 System.out.println(" invalid car number ");
	 }*/
	return false;
}
}