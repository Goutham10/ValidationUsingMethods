package usingMethods;

import java.util.Scanner;

class NameValidation 	
{
	String Name;
	Scanner obj=new Scanner(System.in);
	public boolean isValidName(String Name)
	{
	System.out.println(" You are in Name Validation process.");
	 System.out.println(" Start your name with first letter capital ");
	 System.out.print(" enter Name : ");
	 Name= obj.next();
	 if(Name.length()>3)
	 {
		 if(Name.charAt(0)>=65 && Name.charAt(0)<=97)
		 {
			 if(Name.indexOf("a")==-1 || 
					Name.indexOf("e")==-1 || 
					 	Name.indexOf("i")==-1 || 
					 		Name.indexOf("o")==-1 || 
					 			Name.indexOf("u")==-1 ||
					 				Name.indexOf("y")==-1)
			 {
				 System.out.println(" valid name");
			 }
			 else
			 {
				 System.out.println(" invalid name ");
			 }
		 }
		 else
		 {
			 System.out.println(" invalid name because the name was started without capital");
		 }
	 }
	 else
	 {
		 System.out.println(" invalid name because length of was less than 3");
	 }
	return false;
	
	}
}
