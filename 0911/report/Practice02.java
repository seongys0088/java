/*
 * 실습문제 2.
 * 사용자가 입력하는 8자리의 정수는 생일을 나타낸다. 예를 들어 20010316은 2001년 3월 16일을 뜻한다.
 * Scanner 클래스의 nextInt() 메소드를 이용하여 8자리 정수를 입력받고 년도/월/일을 나누어 출력하라.
 * 8자리 정수가 입력되지 않는 경우는 고려하지 않아도 된다.
 * 생일 입력 하세요 >> 20010316
 * 2001년 3월 16일
 */

package basic;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int birth, year, month, day;
		
		System.out.print("생일 입력 하세요 >> ");
		birth = scn.nextInt();
		
		year = birth / 10000;
		month = (birth % 10000) / 100;
		day = (birth % 10000) % 100;
		
		System.out.print(year + "년 " + month + "월 " + day + "일");
		
		scn.close();
	}
}
