/*
 * 	int sum=0, i=1;
 * 	while (true) {
 * 		if(i >50)
 * 			break;
 * 		sum = sum + i;
 * 		i += 3;
 * 	}
 * 	System.out.println(sum);
 * 
 * (4) do-while 문을 이용하여 동일하게 실행되는 DoWhileLoop 클래스를 작성하라.
 */

package chapter3;

public class DoWhileLoop {
	public static void main(String[] args) {
		int sum=0, i=1;
		do {
			sum = sum + i;
		 	i += 3;
		} while(i < 50);
		System.out.println(sum);
	}
}
