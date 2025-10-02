/*
 * Grade는 학 학생의 점수를 나타내는 클래스이다.
 * 이름과 3개의 과목 점수를 각각 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 main()과 실행 예시는 다음과 같다.
 * main()을 포함하는 Grade 클래스를 작성하라.
 * 
 * 이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>>박채원 99 85 95
 * 박채원의 평균은 93
 */

package Chapter4;

import java.util.Scanner;

public class Practice03 {
	String name;
	int java, web, os;
	
	public Practice03(String name, int java, int web, int os) {
		this.name = name;
		this.java = java;
		this.web = web;
		this.os = os;
	}
	
	String getName() {
		return name;
	}
	
	double getAverage() {
		return (java + web + os)/3;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.err.print("이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>>");
		String name = scn.next();
		int java = scn.nextInt();
		int web = scn.nextInt();
		int os = scn.nextInt();
		
		Practice03 st = new Practice03(name, java, web, os);
		System.out.print(st.getName() + "의 평균은 " + st.getAverage());
		
		scn.close();
		
	}
}
