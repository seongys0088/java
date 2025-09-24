package chapter3;

public class Practice02 {
	public static void main(String[] args) {
		int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
		for(int i=0; i<n.length; i++) {
			if(n[i] > 0 && n[i] % 4 == 0) {
				System.out.print(n[i] + " ");
			}
		}
	}
}

/*
 * (1) 무엇을 계산하는 코드인가? 배열 n 안에 0보다 큰 4의 배수를 찾는 코드
 * 	   실행 결과 출력되는 내용은? 20 72 256
 */
