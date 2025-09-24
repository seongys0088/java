/* int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
		for(int i=0; i<n.length; i++) {
			if(n[i] > 0 && n[i] % 4 == 0) {
				System.out.print(n[i] + " ");
			}
		}
 * 
 * (2) 위의 코드를 main() 메소드로 만들고 ForLoopArray 클래스를 완성하라
 */

package chapter3;

public class ForLoopArray {
	public static void main(String[] args) {
		int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
		for(int i=0; i<n.length; i++) {
			if(n[i] > 0 && n[i] % 4 == 0) {
				System.out.print(n[i] + " ");
			}
		}
	}
}
