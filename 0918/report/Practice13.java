/*
 * 과목과 학점이 들어 있는 다음 2개의 배열을 활용하여, 과목명을 입력받아 학점을 출력하는 프로그램을 작성하라.
 * "그만"이 입력되면 프로그램을종료한다.
 * 
 * String course[] = {"C", "C++", "Python", "Java", "HTML5"};
 * String grade[] = {"A", "B+", "B", "A+", "D"};
 * 
 * 과목>>Java
 * Java 학점은 A+
 * 과목>>C+
 * C+는 없는 과목입니다.
 * 과목>>C++
 * C++ 학점은 B+
 * 과목>>그만
 */

package chapter3;

import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String course[] = {"C", "C++", "Python", "Java", "HTML5"};
		String grade[] = {"A", "B+", "B", "A+", "D"};
		
		while(true) {
			boolean bool = false;
			int num = 0;
			
			System.out.print("과목>>");
			String answer = scn.next();
			
			if(answer.equals("그만")) {
				break;
			}
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(answer)) {
					bool = true;
					num = i;
				}
			}
			
			if(bool == true) {
				System.out.println(answer + " 학점은 " + grade[num]);
			}
			else {
				System.out.println(answer + "는 없는 과목입니다.");
			}
	
		}
		
		scn.close();
	}

}
