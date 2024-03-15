//WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
public class Question1 {

	public static void main(String[] args) {
		String str = "Helomnlne";
		String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println(result);
	}

}
