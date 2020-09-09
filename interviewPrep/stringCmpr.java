import java.util.Scanner;

class stringCmpr {
	public static void compare(String s1, String s2, boolean ignoreCase) {
		if(s1.length() != s2.length()) {
			System.out.println("The strings are not equal");
			return;
		}

		boolean flag = true;
		
		if(ignoreCase == true) {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
		}

		for(int i = 0; i < s1.length() ; i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				flag = false;
			}
		}

		if(flag == true) {
			System.out.println("The strings are equal");
			return;
		}

		System.out.println("The strings are not equal");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the strings");
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();

		System.out.println("Should the case be ignored? (true/false)");
		boolean ignoreCase = scanner.nextBoolean();

		compare(str1, str2, ignoreCase);
	}
}
