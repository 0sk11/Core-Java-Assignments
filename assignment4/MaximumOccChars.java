package assignment4;

import java.util.Arrays;

public class MaximumOccChars {
	public static int maxOccChars(String str) {
		char s[] = str.toCharArray();
		int _max = 1;
		int count = 1;
		Arrays.sort(s);
		for(int i=1;i<s.length;i++) {
			if(s[i] == s[i-1]) {
				count++;
				_max = Math.max(_max, count);
			}else {
				count = 1;
			}
		}
		return _max;
	}
}
