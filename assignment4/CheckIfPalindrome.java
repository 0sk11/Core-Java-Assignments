package assignment4;

public class CheckIfPalindrome {
	public static void swap(String str,int i,int j) {
		StringBuilder builder = new StringBuilder(str);
		char temp = builder.charAt(i);
		builder.setCharAt(i, builder.charAt(j));
		builder.setCharAt(j, temp);
		str = builder.toString();		
	}
	public static String reverse(String str) {
		int s = 0;
		int e = str.length()-1;
		while(s<e) {
			swap(str,s++,e--);
		}
		return str;
	}
	public static boolean ifPalindrome(String str) {
		String original = new String(str);
		boolean flag = original.equals(reverse(str));
		return flag;
	}
}
