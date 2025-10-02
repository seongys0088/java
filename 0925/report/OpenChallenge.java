/*
 * n명이 참가하는 끝말잇기 게임을 만들어보자. 처음 단어는 "아버지"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면 된다.
 * 끝말잇기에서 끝말이 틀린 경우 게임을 끝내고 게임에서 진 참가자를 화면에 출력된다. 프로그램에서는 시간 지연을 구현하지 않아도 된다.
 * 그렇지만 참가자들이 스스로 시간을 재어보는 것도 좋겠다. 이 문제의 핵심은 여러 개의 객체와 배열 사용을 연습하기 위한 것으로, 
 * main()을 포함하는 WordGameApp 클래스와 각 선수를 나타내는 Player 클래스를 작성하고, 실행 중에는 WordGameApp 객체 하나와
 * 선수 숫자만큼의 Player 객체를 생성하는데 있다. 문제에 충실하게 프로그램을 작성하여야 실력이 늘게 됨을 알기 바란다.
 * 
 * 끝말잇기 게임을 시작합니다...
 * 게임에 참가하는 인원은 몇명입니까>>3
 * 참가자의 이름을 입력하세요>>황기태
 * 참가자의 이름을 입력하세요>>이재문
 * 참가자의 이름을 입력하세요>>한원선
 * 시작하는 단어는 아버지입니다.
 * 황기태>>지우게
 * 이재문>>게다리
 * 한원선>>리본
 * 황기태>>본죽
 * 이재문>>족발
 * 이재문이 졌습니다.
 */

package Chapter4;

import java.util.Scanner;

class Player1{
    String name;
}


public class OpenChallenge {
    public static void main(String[] args) {
        int count = 0;
        String word = "아버지";
        String text = "";
        System.out.println("끝말잇기 게임을 시작합니다...");
        Scanner sc = new Scanner(System.in);
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int n = sc.nextInt();
        Player1[] p1 = new Player1[n];

        for(int i = 0; i < n; i++){
            System.out.print("참가자의 이름을 입력하세요>>");
            p1[i] = new Player1();
            p1[i].name = sc.next();
        }
        System.out.println("시작하는 단어는 아버지입니다.");
        while(true){
            System.out.print(p1[count].name + ">>");
            text = sc.next();
            if(word.charAt(word.length() - 1) != text.charAt(0)){
                System.out.print(p1[count].name +"이 졌습니다.");
                break;
            }
            word = text;
            count++;
            if(count == p1.length) count = 0;
        }
    }
}
