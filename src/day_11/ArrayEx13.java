/*
 * # 4의 배수만 저장
 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
 */


package day_11;

public class ArrayEx13 {
	public static void main(String[] args) {
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int count = 0;
		for(int i=0;i<5;i++)
		{
			if(arr[i]%4 == 0)
			{	
				count++;
			}
		}
		
		temp = new int[count];
		int check = 0;
		
		for(int i = 0; i<5; i++)
		{
			if(arr[i]%4 == 0)
			{
				temp[check] = arr[i];
				check++;
			}
		}
		
		System.out.print("[");
		for(int i = 0; i<count; i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println("]");
	}
}
