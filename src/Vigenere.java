import java.util.Scanner;

public class Vigenere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Read in message
		
		//Read in shift word
		
		//Loop through message
			//if letter is alphabetic
				//apply shift from the current letter
				//move to the next shift letter, loop back to the beginning if necessary
				//if letter is past 'Z'
					//subtract 26
			//add letter to output
		
	
		System.out.println("What's your massage");
		String msg1 = in.nextLine();
	

		System.out.println("What's the shift word?");
		String str1 = in.nextLine();

		
		String output = "";
	
		for (int x = 0; x < msg1.length(); x++) {
			char letter = msg1.charAt(x);
				// apply shift
			
				int shift = (int)(letter + str1);
				
				
				

				output += str1;

				
			

		}
		System.out.println("Decode : " + msg1);
		System.out.println("Encode : " + output);
	}
}
