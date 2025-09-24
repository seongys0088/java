package chapter3;

public class Practice01 {
	public static void main(String[] args) {
		int sum=0, i=1;
		while (true) {
			if(i > 50)
				break;
		 	sum = sum + i;
		 	i += 3;
		}
		System.out.println(sum);
	}
}

/*
 * (1) 무엇을 계산하는 코드인가? 1부터 50까지 3씩 증가하는 수를 모두 더한 값을 계산하는 코드
 * 	   실행 결과 출력되는 내용은? 425
 */
