package assignment4;

public class CheckIfPanagram {
	public static boolean checkIfPanangram(String str) {
		int map[] = new int [26];
		for(char ch:str.toCharArray()) {
			if(ch == ' ') continue;
			int x = Character.toLowerCase(ch) - 'a';
			map[x]++;
		}
		
		for(int i:map) {
			if(i==0) return false;
		}
		return true;
	}
}
