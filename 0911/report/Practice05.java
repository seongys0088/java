/*
 * 실습문제 5.
 * 출석 점수가 총 100점일 때, 지각하면 3점 감점, 결석하면 8점을 감점시킨다. 다음 실행 사례와 같이 이름, 지각횟수, 결석횟수 순으로 입력할 때,
 * 두 학생 중 누구의 출석 점수가 높은지 판단하는 프로그램을 작성하라. 점수가 같은 경우 "점수 동일"이라고 출력하라.
 * 학생1 >> 김유진 4 3
 * 학생2 >> 김경미 2 4
 * 김유진의 감점은 36, 김경미의 감점은 38
 * 김유진의 출석 점수가 더 높음, 김유진 출석 점수는 64
 */

package basic;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String studentO, studentT;
		int lateO, absenceO, minusO, pointO, lateT, absenceT, minusT, pointT;
		
		System.out.print("학생1 >> ");
		studentO = scn.next();
		lateO = scn.nextInt();
		absenceO = scn.nextInt();
		
		minusO = (lateO*3) + (absenceO*8);
		pointO = 100 - minusO;
		
		System.out.print("학생2 >> ");
		studentT = scn.next();
		lateT = scn.nextInt();
		absenceT = scn.nextInt();
		
		minusT = (lateT*3) + (absenceT*8);
		pointT = 100 - minusT;
		
		
		System.out.println(studentO + "의 감점은 " + minusO + ", " + studentT + "의 감점은 " + minusT);
		
		if(pointO > pointT) {
			System.out.print(studentO + "의 출석 점수가 더 높음, " + studentO + " 출석 점수는 " + pointO);
		}
		else if(pointO < pointT) {
			System.out.print(studentT + "의 출석 점수가 더 높음, " + studentT + " 출석 점수는 " + pointT);
		}
		else {
			System.out.print("점수 동일");
		}
		
		scn.close();
	}
}
