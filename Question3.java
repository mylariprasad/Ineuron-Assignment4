//WAP to check if “2552” is palindrome or not.
public class Question3 {

	public static void main(String[] args) {
		int num= 2552;
		int dup_num = num;
		int new_num = 0;
		while(dup_num!=0) {
			new_num = (new_num*10)+ dup_num%10;
			dup_num /= 10;
		}
		if(new_num == num) {
			System.out.println(num +" is polindrome");
		}
		else {
			System.out.println(num +" is not a polindrome");
		}
	}

}
