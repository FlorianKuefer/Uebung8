package h2;

public class H2_main {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {1,2,4};
		int[] c = {1,3,2};
		int[] d = {1,2};
		int[] e = {1,2,3};
		
		System.out.println(compareArrays(a,b));
		System.out.println(compareArrays(a,c));
		System.out.println(compareArrays(a,d));
		System.out.println(compareArrays(a,e));
		System.out.println(compareArrays(e,a));
	}
	public static boolean compareArrays(int[] a1, int [] a2) {
		
		if (a1 == null && a2 == null) return true;
		if (a1 == null || a2 == null) return false;
		if (a1.length != a2.length) return false;
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) return false;
			}
	return true;
	}
}
