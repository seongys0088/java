/*
 * 실습문제 4.
 * 여행 경비를 계산하는 프로그램을 작성한다. 방 하나에는 2명까지 투숙 가능하며 1명만 투숙해도 1방의 비용을 지불한다.
 * 여행지 >> 태국 치앙마이
 * 인원수 >> 5
 * 숙박일 >> 4
 * 1인당 항공료 >> 250000
 * 1방 숙박비 >> 150000
 * 5명의 태국 치앙마이 4박 5일 여행에는 방이 3개 필요하며 경비는 3050000원입니다.
 */

package basic;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String travel;
		int people, day, airplane, roomPrice, sleepDay, room, allPrice;
		
		System.out.print("여행지 >> ");
		travel = scn.nextLine();
		
		System.out.print("인원수 >> ");
		people = scn.nextInt();
		
		System.out.print("숙박일 >> ");
		sleepDay = scn.nextInt();
		
		System.out.print("1인당 항공료 >> ");
		airplane = scn.nextInt();
		
		System.out.print("1방 숙박비 >> ");
		roomPrice = scn.nextInt();
		
		day = sleepDay + 1;
		
		if(people%2 == 1) {
			room = (people/2) + 1;
		}
		else {
			room = people/2;
		}
		
		allPrice = airplane*people + roomPrice*room*sleepDay;
		
		System.out.print(people + "명의 " + travel + " " + sleepDay + "박 " + day +"일 여행에는 방이 " + room + "개 필요하며 경비는 " + allPrice + "원입니다.");
		
		scn.close();
	}
}
