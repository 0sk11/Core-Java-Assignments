package assignment4;

import java.util.Arrays;

public class CheckIfUnique {
	public static boolean checkIfUnique(String str) {
		char s[] = str.toCharArray();
		Arrays.sort(s);
		for(int i=1;i<s.length;i++) {
			if(s[i] == s[i-1]) return false;
		}
		return true;
	}
}
