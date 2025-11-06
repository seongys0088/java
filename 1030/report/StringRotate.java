/*
 * 6. 문자열을 입력받아 실행 예시와 같이 한 글자씩 회전시키는 프로그램을 작성하라.
 * 문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.
 * I love Java
 *  love JavaI
 * love JavaI 
 * ove JavaI l
 * ve JavaI lo
 * e JavaI lov
 *  JavaI love
 * JavaI love 
 * avaI love J
 * vaI love Ja
 * aI love Jav
 * I love Java

 */

package Chapter6;

import java.util.Scanner;


public class StringRotate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		String str = scanner.nextLine();

		for(int i=1; i<=str.length(); i++) {
			System.out.print(str.substring(i));
			System.out.println(str.substring(0,i));
		}
			
		scanner.close();
	}
}
