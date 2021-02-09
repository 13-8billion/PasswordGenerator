/* instantiable class to generate a password using characters input by the user
 replacing all consonants with the second last character input
author @Amy Percival */

public class PasswordGenerator{

//declare instance variables
	private String name;
	private String password;

//setter method to set name and pin for user input
	public void setName(String name){
		this.name = name;
	}

//getter method to return the value of the password
	public String getPassword(){
		return password;
	}

// main method to generate the password based on the stipulation in the question
	public void generatePassword(){

//declare StringBuffer variable and create object of type StringBuffer		
		StringBuffer sb = new StringBuffer(); 

//traverse name from the beginning
	for (int i=0; i < name.length(); i++){// i++ increments to the next character		
			char c = name.charAt(i); // retrieves the current character 
			char n = name.charAt(name.length()-2); // -2 retrieves the second last character in the index

// if character is a noun, number or space add "c" (current character) to the sequence			
			if (c =='a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' 
				|| c == 'u' || c == 'U'|| c == '0'|| c == '1'|| c == '2'|| c == '3'|| c == '4'|| c == '5'|| 
				c == '6'|| c == '7'|| c == '8'|| c == '9' || c == ' '){
				sb.append(c); 
			} else { // if character is NOT a noun, number or space add "n" (second last character from index) to the sequence
				sb.append(n); 
			}
		}
		password = sb.toString(); // StringBuffer object converted to a String and stored in password variable
	}
}
