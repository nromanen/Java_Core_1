import java.util.Arrays;

public class PoiskVid {

	public static void main (String[] args){
		int[] a = new int[]{-30, 2, 4, -7, -9};
		int[] k;
		k = new int[]{0};
		int j = 0;
		for (int i = 0; i<5; i++){
			if (a[i]<0){
				if (a[i]<k[j]){
				k[j] = a[i];
				
				}
				
			}
		}
		
		System.out.println(Arrays.toString(k));
	}
	
}
