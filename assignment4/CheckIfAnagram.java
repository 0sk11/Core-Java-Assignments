package assignment4;

public class CheckIfAnagram {
	public static boolean checkIfAnaGram(String str,String str1) {
		int map[] = new int[26];
		for(char ch:str.toCharArray()) {
			int x = ch - 'a';
			map[x]++;
		}
		for(char ch:str1.toCharArray()) {
			int x = ch - 'a';
			map[x]--;
		}
		
		for(int i:map) {
			if(i!=0) return false;
		}
		return true;
	}
	
}
