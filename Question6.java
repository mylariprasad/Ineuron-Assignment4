//WAP to implement Pangram Checking with least inbuilt methods being used.
public class Question6 {

	public static void main(String[] args) {
		String sentence = "zxcvbnmlkjhgfdsaqwertyuiop";
		int count=0;
		boolean[] present = new boolean[26];

        // Convert the sentence to lowercase for case-insensitive comparison
        sentence = sentence.toLowerCase();

        // Iterate over each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Mark the letter as present
                present[ch - 97] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean letterPresent : present) {
            if (letterPresent) {
            	count++;
            }
        }
        
        if(count==26) {
        	System.out.println("It is a panagram");
        }
        else {
        	System.out.println("It is not a panagram");
        }
	}

}
