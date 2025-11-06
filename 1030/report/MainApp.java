/*
 * 3. 다음 코드르르 Calc 클래스는 util 패키지에 MainApp 클래스는 main 패키로 분리 작성하라.
 */

package Chapter6;

import util.Calc;

public class MainApp {
	public static void main(String[] args) {
		Calc c = new Calc(10, 20);
		
		System.out.println(c.sum());
	}
}
