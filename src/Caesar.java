import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// Read in message
		System.out.println("What's your massage");
		String msg1 = in.nextLine();

		// Read in shift

		System.out.println("What's the shift by?");
		int str1 = in.nextInt();

		String output = "";
		// Loop through message
		for (int x = 0; x < msg1.length(); x++) {
			char letter = msg1.charAt(x);
			// if letter is alphabetic
			if (Character.isAlphabetic(letter)) {
				// apply shift
				char shifted = (char) ('A' + (letter - 'A' + str1 + 26) % 26);

				output += shifted;

//				if (letter > 'Z') {
//
//					char Sub = (char) ('Z' + (letter - 'Z' + str1 - 26) % 26);
//					output += Sub;
//
//					System.out.println(Sub);
				}
			else {
				output+=letter;
			} // if letter is past 'Z'
			// subtract 26
			// add letter to output

			// print output

		}
		System.out.println("Decode : " + msg1);
		System.out.println("Encode : " + output);
	}
}
