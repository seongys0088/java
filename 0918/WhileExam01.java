package control;

public class WhileExam01 {
	public static void main(String[] args) {
		int i = 1, sum = 0, number = 10;
		while (i <= number) {
			sum += i;
			i++;
		}
		System.out.print(sum);
	}
}
