/*
 * 다음 main() 메소드는 Average 클래스를 이용하여 정수를 저장하고 평균을 구하여 출력한다. 이 코드와 실행 결과를 참고하여 Average 클래스를 작성하라.
 * Average 클래스는 최대 10개까지만 정수를 저장할 수 있다.
 * 
 * ***** 저장된 데이터 모두 출력 *****
 * 10 15 100
 * 평균은 41.666666666666664
 */

package Chapter4;

public class Practice04 {
	int array[] = new int[10];
	int nextIndex = 0;
	double sum;
	
	void put(int Num) {
		array[nextIndex] = Num;
		nextIndex++;
	}
	
	void showAll() {
		System.out.println("***** 저장된 데이터 모두 출력 *****");
		for(int i=0; i<nextIndex; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	double getAvg() {
		for(int i=0; i<nextIndex; i++) {
			sum += array[i];
		}
		return sum/nextIndex;
		
	}
	
	public static void main(String[] args) {
		Practice04 avg = new Practice04();
		avg.put(10);
		avg.put(15);
		avg.put(100);
		
		avg.showAll();
		System.out.print("평균은 " + avg.getAvg());
	}
}
