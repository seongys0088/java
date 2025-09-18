package basic;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		int height, width, area;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("높이 입력 : ");
		height = scn.nextInt();
		
		System.out.print("너비 입력 : ");
		width = scn.nextInt();
		
		area = height * width;
		
		System.out.println("높이 = " + height + ", 너비 = " + width + "인 사각형의 넓이 = " + area);
		
		scn.close();
	}
}