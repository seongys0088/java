/*
 * 10. 5~9개의 글자로 이루어진 여러 개의 단어를 프로그램 내 String 배열에 미리 저장하라.
 * 예를 들어 "happy", "morning", "package", "together" 등이며 단어의 개수는 독자들이 알아서 하라.
 * 이 단어 중에서 1개를 선택하여 단어의 글자 순서를 바꾸어 출력하면 사용자가 10초 내로 맞추는 문제이다.
 * 다음 2개의 문제를 각각 프로그램하라.
 * 
 * (1) 실행 결과가 (a)와 같도록 프로그램을 작성하라. 경과 시간은 시계로 측정한다.
 */

package Chapter6;

import java.util.Scanner;
import java.util.Random;

public class WordQuizA {
	Scanner scanner = new Scanner(System.in);
	Random r = new Random();

	private String[] words = {"happy", "morning", "package", "together"};
	
	public WordQuizA() {
	}
	
	private void mixWord(int no) {
		char[] arr = words[no].toCharArray();
		
		for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public void run() {
		System.out.println("10초 안에 단어를 맞추세요!!");
		for(int i=0; i<words.length; i++) {
			mixWord(i);
			double startTime = System.currentTimeMillis(); // 시작 시간
			System.out.print(">>");
			String answer = scanner.next();
			
			if(answer.equals("그만")) {
				System.exit(0); // 종료
			}
			
			double endTime = System.currentTimeMillis(); // 종료 시간
			double totalTime = (endTime-startTime)/1000; // 소요 시간
			
			if(totalTime>10) {
				System.out.println("실패!!! 10초 초과. ");
			}
			else if(words[i].equals(answer)) {
				System.out.println("성공!!! ");
			}
			else {
				System.out.println("실패!!! " + words[i] + " 입니다. ");
			}
			
		}
			
	}
	public static void main(String[] args) {
		WordQuizA quiz = new WordQuizA();
		quiz.run();
	}

}