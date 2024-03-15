//WAP to print Duplicates characters from the String.
public class Question2 {

	public static void main(String[] args) {
		String str = "helomnlklhne";
		String duplicates = "";
        for (int i = 0; i < str.length(); i++) {
        	int count = 0;
            char ch = str.charAt(i);
            if (str.indexOf(ch, i + 1) != -1 && duplicates.indexOf(ch) == -1) {
                duplicates += ch;
            }
        }
        System.out.println(duplicates);
	}

}
