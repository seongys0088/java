/*
 * 실습문제 8-2. switch문을 이용하여 프로그램을 작성하라.
 * 실행 사례와 같이 실수(double)에 대한 사칙 연산을 수행하는 프로그램을 작성하라. 연산은 "더하기", "빼기", "곱하기", "나누기"로 하고,
 * 계산식은 "2.3 더하기 3.6"과 같이 빈 칸으로 분리하여 입력한다. 0으로 나누기가 입력되면, "0으로 나눌 수 없습니다."를 출력하고,
 * 연산 명령이 "더하기", "빼기", "곱하기", "나누기"가 아닌 경우, "사칙연산이 아닙니다."를 출력하고 종료한다.
 * 연산 입력 >> 25 곱하기 2.7
 * 25.0 곱하기 2.7의 계산 결과는 67.5
 */

package basic;

import java.util.Scanner;

public class Practice08_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double number1, number2;
		double answer = 0;
		String operation;
		
		System.out.print("연산 입력 >> ");
		number1 = scn.nextDouble();
		operation = scn.next();
		number2 = scn.nextDouble();
		
		switch(operation) {
		case "더하기" :
			answer = number1 + number2;
			break;
		case "빼기" :
			answer = number1 - number2;
			break;
		case "곱하기" :
			answer = number1 * number2;
			break;
		case "나누기" :
			if(number1 == 0 || number2 == 0) {
				System.out.print("0으로 나눌 수 없습니다.");
				System.exit(0);
			}
			answer = number1 / number2;
			break;
		default :
			System.out.print("사칙연산이 아닙니다.");
			System.exit(0);
		}
		
		System.out.print(number1 + " " + operation + " " + number2 + "의 계산 결과는 " + answer);
		
		scn.close();
	}
}
