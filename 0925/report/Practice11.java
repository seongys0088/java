/*
 * 다음 2개의 static 속성을 가진 ArrayUtil 클래스를 만들어보자. 
 * 다음 코드와 실행 결과를 참고하여 concat()과 print()를 작성하여 ArryUtil 클래스를 완성하라.
 * 
 * [ 1 5 7 9 3 6 -1 100 77 ]
 */

package Chapter4;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b){
		/* 배열 a와 b를 연결한 새로운 배열 리턴 */
		int[] array = new int[a.length + b.length];
		
		for(int i=0; i<a.length + b.length; i++) {
			if(i < a.length) {
				array[i] = a[i];
			}
			else {
				array[i] = b[i - a.length];
			}
		}
		
		return array;
	}
	
	public static void print(int[] a) {
		/* 배열 a 출력 */
		System.out.print("[ ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
	}
}

public class Practice11 {
	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
