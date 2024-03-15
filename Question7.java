//WAP to find if String contains all unique characters.
public class Question7 {

	public static void main(String[] args) {
		String str = "helomp";
		int count =0;
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch, i + 1) != -1 ) {
                count++;
                break;
            }
        }
		if(count == 0) {
			System.out.println("String contains all unique charaters");
		}
		else {
			System.out.println("String contains duplicate charaters");
		}
	}

}
