package assignment4;

public class RemoveDups {
	public static String removeDups(String str) {
		int charArray [] = new int[26];
		int x = -1;
		String unique = "";
		for(int i=0;i<str.length();i++) {
			x = str.charAt(i) - 'a';
			if(charArray[x] == 1) {
				continue;
			}else {
				charArray[x]++;
				unique += str.charAt(i); 
			}
		}
		return unique;
	}
	
	
	
}
