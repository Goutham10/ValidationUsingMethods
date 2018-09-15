package usingMethods;

import java.util.Scanner;

class PasswordValidation
{
	String pwd;
	Scanner obj=new Scanner(System.in);
	public boolean isValidPassword(String pwd)
	{
	 System.out.println(" You are in Bank password Validation process. ");
	 System.out.print(" Enter password : ");
	 pwd=obj.next();
	 String upperCaseChars = "(.*[A-Z].*)";//need to understand why there is .* mandatory. without we cannot get accurate results.
	 String lowerCaseChars = "(.*[a-z].*)";
	 String numbers = "(.*[0-9].*)";
	 String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";

    if (pwd.length()<15 && pwd.length()>8)
    {
   	 if (pwd.matches(upperCaseChars))
   	 {          
   		 if (pwd.matches(lowerCaseChars))
			  {
   			 if (pwd.matches(numbers))
   			 {             
   				 if (pwd.matches(specialChars))
   				 {
		               	System.out.println(" valid ");
   				 }              
					 else
					 {
		                System.out.println(" invalid password. please include atleast one special character. ");
		             }
	             }              
   			 else
	                {
	                	System.out.println(" invalid password. please include atleast one number to your password ");
	                }
               }               
			    else
			    {
               	System.out.println(" invalid password. your password should contain atleast one lowercase character. ");
               }           
	     }
   	 else
   	 {
           System.out.println(" invalid password. your password doesn't contain atleast one uppercase character. ");
        }              
    }
    else
    {
       System.out.println(" invalid password. password should be minimum 8 character and less than 15 characters. ");
    }
	return false;              
		 
}
}
