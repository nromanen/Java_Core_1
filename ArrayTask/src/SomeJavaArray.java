import java.util.Arrays;

public class SomeJavaArray {

	public static void main(String[] args) {
		
		int [] onearray = new int [5];
		int A = 0;
		int S = 0;
		int Z = 0;
		int count = 0;
		int[] min = new int[]{0};
		int[] max = new int[]{0};
			for (count = 0; count < onearray.length; count++) {onearray[count] = (int)(Math.random()*50-25);
			}
			
		System.out.println("�������� �����");
		
			for (count = 0; count < onearray.length; count++) {
				
		System.out.println("onearray [" + count + "] =" + onearray[count]);
		}
			
			for (count = 0; count < onearray.length; count++) {
				
				// Can't make it work
			if (onearray[count] < 0) {
				A = A * onearray[count];
				}
				//!!!!!!!!!!!!!!!!!!!!! omg, I don't know why
			if (onearray[count] > 0){
				S = S + onearray[count];
				}
			if (onearray[count] == 0){
				Z++;
				}
			}
			for (int count1 = 0; count1<onearray.length; count1++){
				if (onearray[count1] < 0 && onearray[count1] < min[0]){
					min[0] = onearray[count1];
					
					}
					
				}
			for (int count2 = 0; count2 < onearray.length; count2++){
				if (onearray[count2] > 0 && onearray[count2] > max[0]){
					max[0] = onearray[count2];
					
					}
					
				}
			// Can't make it work 
		System.out.println("������� ��'����� ������� = " + A);
			// !!!!!!!!!!!!!!!!!!!!!! omg, I don't know why
		System.out.println("���� �������� ������� ������� = " + S);
		System.out.println("Game over " + Z + " times");
		System.out.println(Arrays.toString(min));
		System.out.println(Arrays.toString(max));
	}

}