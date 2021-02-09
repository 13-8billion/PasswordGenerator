/* app class to display the generated a password from the instantiable class
author @Amy Percival */

//import Scanner class to take input from user
import java.util.Scanner;

public class PasswordGeneratorApp{
	public static void main(String args[]){ //main method

		Scanner input = new Scanner(System.in); // declare variable and create object of type Scanner
		String n;

		PasswordGenerator myGen = new PasswordGenerator(); // delcare variable and create object of type PasswordGenerator

//input
		System.out.println("Enter full name and pin (forename surname pin): ");
		n = input.nextLine();
		myGen.setName(n); //calling setter method to set name(n) input from user

//processing
		myGen.generatePassword(); //calling main method that generates the password

//output
		String password = myGen.getPassword(); // delcare variable password and call getter method to retrieve password from instantiable class
		System.out.print("Password: ");// display the generated password
		System.out.println(password.replaceAll(" ", "")); // removes spaces from password
		
	}
}