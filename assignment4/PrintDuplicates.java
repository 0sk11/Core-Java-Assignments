package assignment4;

public class PrintDuplicates {
	public static void PrintDups(String str) {
		int charArray [] = new int[26];
		int x = -1;
		String unique = "";
		for(int i=0;i<str.length();i++) {
			x = str.charAt(i) - 'a';
			if(charArray[x] == 1) {
				System.out.print(str.charAt(i));
			}else {
				charArray[x]++;
				
			}
		}
		System.out.println();
	}
}
