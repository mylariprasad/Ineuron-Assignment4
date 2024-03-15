//WAP to implement Anagram Checking least inbuilt methods being used.
public class Question5 {

	public static void main(String[] args) {
		String str1 = "happy";
		String str2 = "yapph";
		int freq = 0;
		int[] charCount = new int[256];

        // Count occurrences of each character in str1
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

        // Subtract occurrences of each character in str2
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }

        // If any count is not zero, the strings are not anagrams
        for (int count : charCount) {
            if (count == 0) {
                freq++;
            }
        }
        
        if(freq == 256) {
        	System.out.println("It is a anagram");
        }
        else {
        	System.out.println("It is not a anagram");
        }

	}

}
