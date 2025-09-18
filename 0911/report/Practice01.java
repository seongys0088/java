/*
 * 실습문제 1.
 * scanner 클래스를 이용하여 달러를 입력받아 실행 사례와 같이 원화로 바꾸는 프로그램을 작성하라. $1 = 1200원으로 가정한다.
 * $1 = 1200원입니다. 달러를 입력하세요 >> 253
 * $253는 303600원입니다.
 */

package basic;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("$1 = 1200원입니다. 달러를 입력하세요 >> ");
		int dollas = scn.nextInt();
		
		int won = dollas*1200;
		System.out.print("$" + dollas + "는 " + won + "원입니다.");
		
		scn.close();
	}
}
