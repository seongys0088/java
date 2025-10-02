/*
 * 다음가 같은 Dictionary 클래스가 있다. 실행 결과와 같이 작동하도록 Dictionary 클래스에 kor2Eng() 메소드를 작성하고,
 * 실행 결과와 같이 출력하는 DicApp 클래스를 작성하라.
 * 
 * 한영 단어 검색 프로그램입니다.
 * 한글 단어?미래
 * 미래는 future
 * 한글 단어?동
 * 동은 저의 사전에 없습니다.
 * 한글 단어?돈
 * 돈은 money
 * 한글 단어?그만
 */

package Chapter4;

import java.util.Scanner;

class Dictionary {
	static String word;
	
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	
	public static String kor2Eng(String word) {
		/* 검색 코드 작성 */
		for(int i=0; i<kor.length; i++) {
			if(word.equals("그만")) {
				return "그만";	
			}
			else if(word.equals(kor[i])){
				word = eng[i].toString();
				return word;
			}
		}
		return null;
	}
	
	public String toString() {
		return word;
	}
}

public class Practice12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean state = true;
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		while(state) {
			String kWord, eWord;
			System.out.print("한글 단어?");
			kWord = scn.next();
			eWord = Dictionary.kor2Eng(kWord);
			
			if(eWord == null) {
				System.out.println(kWord + "은(는) 저의 사전에 없습니다.");
			}
			else if(eWord.equals("그만")) {
				break;
			}
			else {
				System.out.println(kWord + "은(는) " + eWord);
			}
		}
	}
}
