/*
 * 한 달의 다이어리를 관리하는 프로그램을 작성하라. 한 달은 30일로 정한다. 이 프로그램은 사용자로부터 날짜와 기억할 일을 간단히 정리하거나,
 * 검색하는 등의 기능을 수행하며, 실행 예시는 다음과 같다. 기억할 일은 빈칸 없이 4글자 이하의 문자열만 다룬다.
 * 
 * ***** 2024년 10월 다이어리 *****
 * 기록:1, 보기:2, 종료:3>>1
 * 날짜(1~30)와 텍스트(빈칸없이 4글자이하)>>3 영어시험
 * 기록:1, 보기:2, 종료:3>>1
 * 날짜(1~30)와 텍스트(빈칸없이 4글자이하)>>8 기태점심
 * 기록:1, 보기:2, 종료:3>>1
 * 날짜(1~30)와 텍스트(빈칸없이 4글자이하)>>17 아빠생일
 * 기록:1, 보기:2, 종료:3>>1
 * 날짜(1~30)와 텍스트(빈칸없이 4글자이하)>>29 축제
 * 기록:1, 보기:2, 종료:3>>2
 * ...		...	영어시험	...	...	...	...
 * 기태점심	...	...		...	...	...	...
 * ...		...	아빠생일	...	...	...	...
 * ...		...	...		...	...	...	...
 * 축제		...
 * 기록:1, 보기:2, 종료:3>>3
 * 프로그램을 종료합니다.
 */

package Chapter4;

import java.util.Scanner;

class DayDiary {
	String text;
	
	public DayDiary() {
		this.text = "...";
	}
	
	public DayDiary(String text) {
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}

public class Practice10 {
	static Scanner scn = new Scanner(System.in);
	int year, month;
	static int state, day;
	static DayDiary monthDiaries[] = new DayDiary[30];
	
	public Practice10(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	void run() {
		System.out.println("***** 2024년 10월 다이어리 *****");
		for(int i=0; i<30; i++) {
			monthDiaries[i] = new DayDiary();
		}
		
		while(true) {
			state = Practice10.getMenu();
			
			if(state == 1) {
				Practice10.write();		
			}
			else if(state == 2) {
				Practice10.show();
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
		
	}
	
	static void write() {
		System.out.print("날짜(1~30)와 텍스트(빈칸없이 4글자이하)>>");
		day = scn.nextInt();
		monthDiaries[day-1] = new DayDiary(scn.next());
	}
	
	static void show() {
		for(int i=0; i<30; i++) {
			if(i%7 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(monthDiaries[i].toString() + "	");
			if(i==29) {
				System.out.println();
			}
		}
	}

	static int getMenu() {
		System.out.print("기록:1, 보기:2, 종료:3>>");
		return scn.nextInt();
	}
	
	public static void main(String[] args) {
		Practice10 monthDiary = new Practice10(2024,10);
		monthDiary.run();
	}
}
