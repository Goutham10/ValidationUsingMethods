package usingMethods;

import java.util.Scanner;

class EmailValidation 
{
	Scanner obj=new Scanner(System.in);
	String email;
	public boolean isValidEmail(String email)
	{

	 System.out.println(" you are in email validation process.");
	 System.out.print(" enter email : ");
	 email=obj.next();
	 String[] a=email.split("@");
	 String[] b=a[1].split("\\.");
	 
	 if(b.length==2)
	 {
		 
		 if(a[0].length()>=5 && b[0].length()>=5 && b[1].length()<=3)
		 {
			 System.out.println(" valid email");
		 }
		 
		 else
		 {
			 System.out.println(" invalid email");
		 }
	 }
	 else
	 {
		 System.out.println(" invalid length");
	 }
	return false;
	

}

	
		
	
	}
