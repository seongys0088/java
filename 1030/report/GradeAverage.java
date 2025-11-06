/*
 * 5. 실행 사례와 같이 개수가 정해지지 않은 여러 과목의 학점을 빈 칸으로 분리하여 입력받고,
 * A는 100점, B는 90점, C는 80점, D는 70점, F는 0점으로 계산하여 평균을 출력하는 프로그램을 작성하라.
 * 대소문자는 구분하지 않는다.
 * (1) 문자열 분리를 위해, String 클래스의 split() 메소드를 이용하라.
 * (2) 문자열 분리를 위해, StringTokenizer 클래스를 이용하라.
 */

package Chapter6;

import java.util.Scanner;

public class GradeAverage {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str1;
		
		while(true) {
			System.out.print("여러 과목의 학점을 빈 칸으로 분리 입력>>");
			str1 = scn.nextLine();
			
			if(str1.equals("그만")) {
				break;
			}
			
			String [] gradeArray = str1.split(" ");
			
			boolean isError = false;
			String errorInput = new String();
			double sum = 0;
			
			for (int i = 0; i < gradeArray.length; i++) {
				String grade = gradeArray[i].toUpperCase();
				switch (grade) {
					case "A": 
						sum += 100;
						break;
					case "B": 
						sum += 90;
						break;
					case "C": 
						sum += 80;
						break;
					case "D": 
						sum += 70;
						break;
					case "F": 
						sum += 0;
						break;
					default:
						isError = true;
						errorInput = grade;
						break;
				}
			}	
			if(isError == false) {
				System.out.println("평균은 " + (sum/gradeArray.length));
			}
			else {
				System.out.println("입력 오류 : " + errorInput);				
			}
		}
		scn.close();
	}
}
