package p3;
	import java.util.Arrays;
		public class P3_main {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int[] a = {1, 2, 3, 4};
		        int[] b = {4, 3, 2, 1};
		        System.out.println(Arrays.toString (elementwiseMultiply(a,b)));
			}
			public static int[] elementwiseMultiply(int[] arr1, int[] arr2){
				if(arr1.length != arr2.length){
				return new int [0];
				}
				int[] result = new int[arr1.length];
				for(int i = 0; i < arr1.length; i++){
				result[i] = arr1[i]*arr2[i];
				}
				return  result;
				}
		}
