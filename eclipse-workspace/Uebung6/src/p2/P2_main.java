package p2;

public class P2_main {

	public static void main(String[] args) {

	}
	
public static boolean pairwiseDifferent(int [] someNumbers) {
	for (int i = 0; i < someNumbers.length; i++) {
		// bei i+1 anfangen, da sonst irgendwann i = j und dann würde
		// fälschlicherweise false zurückgegeben werden
		for (int j = i+1; j < someNumbers.length; j++) {
			if ( someNumbers[i] == someNumbers[j])
				return false;
		}
	}
	return true;

}

	
}