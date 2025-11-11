/*
 * OpenChallenge
 * 텍스트를 키보드로 입력받아 알파벳이 아닌 문자는 제외하고 영문자 히스토그램을 만들어보자.
 * 대문자와 소문자는 모두 같은 것으로 간주하고, 세미콜론(;)만 있는 라인을 만나면 입력의 끝으로 해석한다.
 */

package Chapter6;

import java.util.Scanner;

public class HistogramApp {
	
    static String readString() {
    	StringBuffer sb = new StringBuffer();
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("영문 텍스트로 입력하고 세미콜론을 입력하세요.");
    	
    	while(true)
    	{
    		String line = scanner.nextLine();
    		if(line.equals(";")) {
    			break;
    		}
    		sb.append(line);
    	}
    	return sb.toString();
    }
	
	
	public static void main(String[] args) {
		
		int cnt[]= new int[26];
		
		String res = readString().toLowerCase();
		
		for(int i=0;i<res.length();i++)
		{
			if(res.charAt(i)>='a'&&res.charAt(i)<='z') {
				cnt[(int)(res.charAt(i)-'a')]++;
			}
		}
		
		for(int i=0;i<26;i++)
		{
			System.out.print((char)(i+'a'));
			for(int j=0;j<cnt[i];j++) {
				System.out.print("-");				
			}
			System.out.println();
		}
		
	}

}
