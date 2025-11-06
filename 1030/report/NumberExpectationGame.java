/*
 * 12. 점심 내기 게임을 만들어보자. 게임에 참여하는 선수 수는 고정되어 있지 않다.
 * 프로그램은 처음에 선수들의 이름을 한 줄로 입력받는다. 입력되는 이름 개수가 곧 선수의 수이다.
 * 그 다음 각 선수로부터 1~10 사이에 좋아하는 정수를 하나 입력받는다.
 * 그리고 사용자가 <Enter>키를 입력하면, 프로그램은 15개의 정수를 랜덤하게 결정하고
 * 이 중에서 좋아하는 정수가 가장 적게 등장한 선수 1명이 패자가 되어 점심을 산다.
 * 패자가 1명이 아니면, 패자들끼리 다시 게임이 진행되고 1명의 패자가 생길 때까지 계속된다.
 * 실행 예시와 같이 실행하도록 프로그램을 작성하라.
 * 선수는 PlayerTwo 클래스로 구현하고, 게임은 NumberExpectationGame 클래스로 구현하라.
 */

package Chapter6;

import java.util.*;

public class NumberExpectationGame {
	private List<PlayerTwo> players;
	private int[] numbers;
	Scanner scanner = new Scanner(System.in);
	Random r = new Random();
	
	public NumberExpectationGame() {
		System.out.print("게임에 참여할 선수들 이름>>");
		String names = scanner.nextLine();
		
        StringTokenizer st = new StringTokenizer(names, " ");
        players = new ArrayList<>();
		numbers = new int[15];
        
        int i = 0;
        while(st.hasMoreTokens()) {
            String playerName = st.nextToken();
            players.add(new PlayerTwo(playerName));
            i++;
        }
	}
		
	// 난수 생성 후 출력
	public void randomNumbers() {
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = r.nextInt(10) + 1;
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	
	public void getEnterKey() {
		System.out.print("Enter키 입력>>");
		scanner.nextLine();
	} 
	
    // 맞춘 개수 count 후 출력
    public void countMatchNumber() {
        for(PlayerTwo p : players) {
            int count = 0;
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] == p.getNumber())
                    count++;
            }
            p.setMatchCount(count);
            System.out.println("[" + p.getName() + "] 맞춘 개수: " + p.getMatchCount()); 
        }
    }
	
    public void checkWinner() {
        final int maxCount = findMaxCount();
        
        players.removeIf(p -> p.getMatchCount() == maxCount);
        
        if(players.size() == 1) {
            System.out.println("최종 패자는 " + players.get(0).getName() + "입니다.");
            System.exit(0);
        } else {
            System.out.print("현재 패자들: ");
            for(int i = 0; i < players.size(); i++) {
                System.out.print(players.get(i).getName());
                if(i < players.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private int findMaxCount() {
        int max = 0;
        for(PlayerTwo p : players) {
            if(p.getMatchCount() > max) {
                max = p.getMatchCount();
            }
        }
        return max;
    }
	
	public void run() {
        for(PlayerTwo p : players) {
            p.selectNum();
        }
        
        while(true) { 
            getEnterKey();
            randomNumbers();
            countMatchNumber();
            checkWinner();
        }
	}
	
	public static void main(String[] args) {
		NumberExpectationGame game = new NumberExpectationGame();
		game.run();
	}

}