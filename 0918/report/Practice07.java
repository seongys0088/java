/*
 * 정수를 10개 저장하는 배열을 만들고, 11~19 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 들어 있는 정수들과 평균을 출력하라.
 * 
 * 랜덤한 정수들...16 13 17 19 12 16 14 17 16
 * 평균은 15.1
 */

package chapter3;

import java.util.Random;

public class Practice07 {
	public static void main(String[] args) {
		Random r = new Random();
		int array[] = new int[10];
		int sum = 0;
		double averege;
		
		System.out.print("랜덤한 정수들...");
		for(int i=0; i<10; i++) {
			array[i]= r.nextInt(11, 20);
			System.out.print(array[i] + " ");
			sum += array[i];
		}
		System.out.println();
		
		averege = (double)sum/10;
		System.out.print("평균은 " + averege);
	}
}
