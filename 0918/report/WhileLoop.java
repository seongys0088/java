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
 * (2) 위의 코드를 main() 메소드로 만들고 WhileLoop 클래스로 완성하라.
 */

package chapter3;

public class WhileLoop {
	public static void main(String[] args) {
		int sum=0, i=1;
		while (i < 50) {
		 	sum = sum + i;
		 	i += 3;
		}
		System.out.println(sum);
	}
}
