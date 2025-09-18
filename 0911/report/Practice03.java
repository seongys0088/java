/*
 * 실습문제 3.
 * 분식점 가격 계산 프로그램을 작성해보자. 떡볶이 1인분은 2000원, 김말이 1인분은 1000원, 쫄면 1인분은 3000원이다.
 * **** 자바 분식입니다. 주문하면 금액을 알려드립니다.. ****
 * 떡볶이 몇 인분 >> 3
 * 김말이 몇 인분 >> 4
 * 쫄면 몇 인분 >> 2
 * 전체 금액은 16000원입니다.
 */

package basic;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tteokbokki, gimmali, jjolmyeon, allPrice;
		
		System.out.print("떡볶이 몇 인분 >> ");
		tteokbokki = scn.nextInt();
		
		System.out.print("김말이 몇 인분 >> ");
		gimmali = scn.nextInt();
		
		System.out.print("쫄면 몇 인분 >> ");
		jjolmyeon = scn.nextInt();
		
		allPrice = (tteokbokki*2000) + (gimmali*1000) + (jjolmyeon*3000);
		
		System.out.print("전체 금액은 " + allPrice + "원입니다.");
		
		scn.close();
	}
}
