//WAP to count the number of consonants, vowels, special characters in a String.
public class Question4 {
	
	public static void main(String[] args) {
		String str = "aeghk%$^&69890";
		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int specialChars = 0;
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                // If character is neither a letter nor a digit, it's a special character
                specialChars++;
            }
        }
		
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits " + digits);
        System.out.println("Number of special characters: " + specialChars);
	}

}
