package assignment4;

public class CountVowelConsonants {
	public static void countVowelConsonants(String str) {
		int specialChar = 0;
		int vowel = 0;
		int consonants = 0;
		for(char s:str.toCharArray()) {
			
			if((s>=32 && s<=64) || (s>=91 && s<=96)) {
				specialChar++;
			}else if((s>=65 && s<=90) || (s>=97 && s<=122)){
				s = Character.toLowerCase(s);
				if(s == 'a' || s == 'e' || s == 'o' || s == 'i' ||s == 'u') {
					vowel++;
				}else {
					consonants++;
				}
			}
		}
			
			System.out.println("Special chars : " + specialChar);
			System.out.println("Vowels : " + vowel);
			System.out.println("Consonants : " + consonants);
	}
}
