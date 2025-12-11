package p2;

public class P2_main {

	public static void main(String[] args) {
		System.out.println(shortenToLowerCase("RindfLeischetikETTierung" , 13));
	}
		// TODO Auto-generated method stub
		public static String shortenToLowerCase(String input, int shortenBy) {
			if (shortenBy >= input.length()) {
				return "String ()" ;
			}
		String shortened = input.substring(0, input.length() - shortenBy);
		return shortened.toLowerCase();
	}

}
