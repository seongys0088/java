/* int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
		for(int i=0; i<n.length; i++) {
			if(n[i] > 0 && n[i] % 4 == 0) {
				System.out.print(n[i] + " ");
			}
		}
 * 
 * (3) while 문을 이용하여 동잃게 실행되는 WhileLoopArray 클래스를 작성하라
 */

package chapter3;

public class WhileLoopArray {
	public static void main(String[] args) {
		int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
		int i=0;
		
		while(i<n.length) {
			if(n[i] > 0 && n[i] % 4 == 0) {
				System.out.print(n[i] + " ");
			}
			i++;
		}
	}
}
