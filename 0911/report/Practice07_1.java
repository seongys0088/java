/*
 * 실습문제 7-1. if-else문을 이용하여 프로그램을 작성하라
 * 숫자를 입력받아 3~5는 "따듯한 봄",
 * 6~8은 "바다가 즐거운 여름",
 * 9~11은 "낙엽이 지는 아름다운 가을",
 * 12,1,2의 경우 "눈 내리는 하얀 겨울"을,
 * 그 외의 숫자(문자를 입력하여 발생하는 오류를 처리하는것은 3장 7절 예외처리에서 다룹니다)를 입력한 경우 
 * "1~12만 입력하세요."를 출력하는 프로그램을 작성하라
 * 월을 입력하세요(1~12) >> 12
 * 눈 내리는 하얀 겨울
 */

package basic;

import java.util.Scanner;

public class Practice07_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int month;
		
		System.out.print("월을 입력하세요(1~12) >> ");
		month = scn.nextInt();
		
		if(month >= 3 && month <= 5) {
			System.out.print("따듯한 봄");
		}
		else if(month >= 6 && month <= 8) {
			System.out.print("바다가 즐거운 여름");
		}
		else if(month >= 9 && month <= 11) {
			System.out.print("낙엽이 지는 아름다운 가을");
		}
		else if(month == 12 || month == 1 || month == 2) {
			System.out.print("눈 내리는 하얀 겨울");
		}
		else if(month > 12 || month <= 0) {
			System.out.print("1~12만 입력하세요.");
		}
			
		scn.close();
	}
}
