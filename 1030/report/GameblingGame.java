/*
 * 11. n명이 함께하는 갬블링 게임을 만들어 보자. 
 * 실행 예시와 같이 게임에 참여하는 선수를 입력받고 각 선수의 이름을 입력받는다.
 * 그리고 순서대로 각 선수가 <Enter> 키를 입력하면 1~3 사이의 랜덤한 정수 3개를 출력하고 모두 일치하면 승자가 된다.
 * 각 선수는 Player 클래스로 구현하고 게임 전체는 GameblingGame 클래스로 구현하라.
 * 
 * 갬블링 게임에 참여할 선수 숫자>>2
 * 1번째 선수 이름>>홍길동
 * 2번째 선수 이름>>이순신
 * [홍길동]:<Enter>
 * 	1  1  2  아쉽군요!
 * [이순신]:<Enter>
 * 	3  2  3  아쉽군요!
 * [홍길동]:<Enter>
 * 	2  1  1  아쉽군요!
 * [이순신]:<Enter>
 * 	2  3  3  아쉽군요!
 * [홍길동]:<Enter>
 * 	2  3  3  아쉽군요!
 * [이순신]:<Enter>
 * 	3  2  2  아쉽군요!
 * [홍길동]:<Enter>
 * 	1  1  1  홍길동님이 이겼습니다!
 */

package Chapter6;

import java.util.Scanner;

public class GameblingGame {
	private Player [] players;
	Scanner scanner = new Scanner(System.in);
	
	public GameblingGame() {
		System.out.print("갬블링 게임에 참여할 선수 숫자>>");
		 
		int nPlayers = scanner.nextInt();
		scanner.nextLine(); 
		 
		players = new Player[nPlayers];
		for(int i=0; i<players.length; i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			players[i] = new Player(scanner.nextLine());
		}
	}
	
	public void run() {
		int i=0; 
		
		while (true) {
			if (players[i].turn()) {
				System.out.println(players[i].getName()+"님이 이겼습니다!");
				break;
			}
			else {
				System.out.println("아쉽군요!");
				i++;
				i = i%players.length;
			}
		}
	}
	
	public static void main(String[] args) {
		GameblingGame game = new GameblingGame();
		game.run();
	}
}