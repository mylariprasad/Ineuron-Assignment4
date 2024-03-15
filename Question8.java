//WAP to find the maximum occurring character in a String.
public class Question8 {

	public static void main(String[] args) {
		String str = "numnunn";
		int[] charCount = new int[256];
        
        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        
        // Find the maximum occurring character
        char maxChar = '\0'; // Null character
        int maxCount = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }
        
        System.out.println(maxChar);
	}

}
