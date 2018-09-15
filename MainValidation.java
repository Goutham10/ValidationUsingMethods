package usingMethods;

public class MainValidation 
{
	public static void main(String[] args) 
	{
		EmailValidation email=new EmailValidation();
		email.isValidEmail(null);
		System.out.println();
		NameValidation name=new NameValidation();
		name.isValidName(null);
		System.out.println();
		PancardValidation pan=new PancardValidation();
		pan.isValidPan(null);
		System.out.println();
		CarNumberValidation car=new CarNumberValidation();
		car.isValidCarNumber(null);
		System.out.println();
		PasswordValidation pwd=new PasswordValidation();
		pwd.isValidPassword(null);
		
	}
}


