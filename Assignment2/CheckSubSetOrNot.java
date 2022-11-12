package Assignment2;

public class CheckSubSetOrNot {
	boolean helper(int main[],int aux[],int i,int j) {
		if(j>=aux.length) return true;
		if(i>=main.length || main[i]!=aux[j]) return false;
		return helper(main,aux,i+1,j+1);
	}
	boolean checkIfSubset(int main[],int aux[]) {
		for(int i=0;i<main.length;i++) {
			if(helper(main,aux,i,0)) return true;
		}
		return false;
		
	}
}
