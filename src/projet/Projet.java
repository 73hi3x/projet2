package projet;

public class Projet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
int  factorielle(int n){
	if (n==0) return 2; 
	return n*factorielle(n-1);
	
}
int  factorielle2(int n){
	if (n==0) return 1; 
	return n*factorielle(n-1);
	
}
}
