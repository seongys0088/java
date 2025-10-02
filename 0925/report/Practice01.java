/*
 * 자바 클래스를 만들어보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
 * 
 * Samsung에서 만든 300만원짜리의 50인치 TV
 */

package Chapter4;

public class Practice01 {
	String brand;
	int inch, price;
	
	public Practice01(String brand, int inch, int price) {
		this.brand = brand;
		this.inch = inch;
		this.price = price;
	}
	
	void show() {
		System.out.println(brand + "에서 만든 " + price + "만원짜리의 " + inch + "인치 TV");
	}
	
	public static void main(String[] args) {
		Practice01 tv = new Practice01("Samsung", 50, 300);
		tv.show();
	}
}
