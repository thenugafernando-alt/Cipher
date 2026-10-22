import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println("What's your massage?");
		String msg = in.nextLine();
		
		System.out.println("How many columns?");
		int col = in.nextInt();
		
		//Read in String
		//Read in how many columns
		//break the String into columns
		//Rewrite the message by reading the columns vertically
		//Print out the message
		int count = 0;
		String output = "";
		// Loop through message
		int lenth = msg.length();
		int width = Math.ceilDiv(lenth,col);
		
		
		for (int x = 0; x < msg.length(); x++) {
			char letter = msg.charAt(x);
			
			if (Character.isAlphabetic(letter)) {
				 
				 col +=(char) letter;
				
				System.out.println(col);	
		        
				while (col > lenth) {
				
				char next = (char)( letter/col);
				next += letter;
				System.out.println();	
				}
				
			}
	
			}
		//System.out.println();	
	}
}





