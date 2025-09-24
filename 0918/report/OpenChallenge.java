/*
 * 숨겨진 카드의 수를 맞추는 게임을 만들어 보자. 0에서 99까지의 임의의 수를 가진 카드를 한 장 숨기고 이 카드의 수를 맞추는 게임이다.
 * 아래의 화면과 같이 카드 속의 수가 77인 경우를 보자. 수를 맞추는 사람이 55라고 입력하면 "더 높게",
 * 다시 70을 입력하면 "더 높게"라는 식으로 범위를 좁혀가면서 수를 맞춘다.
 * 게임을 반복하기 위해 y/n을 묻고, n인 경우 종료한다.
 */

package chapter3;

import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scn = new Scanner(System.in);
		
		String text = "y";
		
		while(text.equals("y")) {
			int k = r.nextInt(100);
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			int answer = -1;
			int a = 0, b = 99, i = 1;
			
			while(k != answer) {
				System.out.println(a + "~" + b);
				System.out.print(i + ">>");
				answer = scn.nextInt();
				
				if(answer > k) {
					System.out.println("더 낮게");
					b = answer;
				}
				else if(answer < k) {
					System.out.println("더 높게");
					a = answer;
				}
				i++;
			}
			
			System.out.println("맞았습니다.");
			
			System.out.print("다시하시겠습니까(y/n)>>");
			text = scn.next();
			
			if(text.equals("n")) {
				System.exit(0);
			}
		}
		
		scn.close();
	}
}
