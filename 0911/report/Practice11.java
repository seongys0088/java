/*
 * 실습문제 11.
 * 임베디드 컴퓨터에서는 변수의 각 비트를 장치의 상태를 나타내기 위해 사용한다.
 * 예를 들어 냉장고의 상태를 나타내기 위해 8비트 정수 중 하위 4비트가 다음과 같이 사용된다고 하자.
 * 비트 0(최하위 비트) : 값이 0이면 전원이 꺼져 있고, 1이면 켜져 있음.
 * 비트1 : 값이 0이면 문이 열려 있고, 1이면 닫혀 있음.
 * 비트2 : 값이 0이면 냉장고 전구가 손상된 상태이고, 1이면 정상 작동
 * 비트3 : 값이 0이면 냉장고 온도가 3도 이상이고, 1이면 3도 미만
 * 비트4이상 : 아무 의미 없음
 * 
 * 이때 다음 실행 예시와 같이 냉장고 상태를 나타내는 8비트를 입력받고 하위 4비트를 분석하여 냉장고의 상태를 출력하는 프로그램을 작성하라.
 * 실행 사례는 다음과 같다.
 * 냉장고 상태 >> 00001101
 * 전원 켜져 있음. 문 열려 있음. 전구 정상 작동. 냉장고 온도 3도 미만.
 * 냉장고 상태 >> 00000110
 * 전원 꺼져 있음. 문 닫혀 있음. 전구 정상 작동. 냉장고 온도 3도 이상.
 */

package basic;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str;
		byte status;
		
		System.out.print("냉장고 상태 >> ");
		str = scn.next();
		
		status = Byte.parseByte(str, 2);
		
		//냉장고 전원
		if((status & 0b000001) != 0) {
			System.out.print("전원 켜져 있음. ");
		}
		else {
			System.out.print("전원 꺼져 있음. ");
		}
		
		//냉장고 문
		if((status & 0b000010) != 0) {
			System.out.print("문 닫혀 있음. ");
		}
		else {
			System.out.print("문 열려 있음. ");
		}
		
		//냉장고 전구
		if((status & 0b000100) != 0) {
			System.out.print("전구 정상 작동. ");
		}
		else {
			System.out.print("전구 손상된 상태. ");
		}
		
		//냉장고 온도
		if((status & 0b001000) != 0) {
			System.out.print("냉장고 온도 3도 미만. ");
		}
		else {
			System.out.print("냉장고 온도 3도 이상. ");
		}
		
		scn.close();
	}
}
