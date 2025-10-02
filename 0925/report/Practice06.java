/*
 * 다음 멤버를 가지고 사각형을 표현하는 Rectangle 클래스를 작성하라.
 * int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보
 * x, y, width, height를 매개변수로 전달받아 필드들을 초기화하는 생성자
 * boolean isSquare(): 정사각형이면 true, 아니면 false 리턴
 * boolean contains(Rectangle r): 현재 사각형 내부에 매개변수로 받은 사각형 r이 있으면 true, 아니면 false 리턴
 * main() 메소드와 실행 결과는 다음과 같다.
 * 
 * (3,3)에서 크기가 6x6인 사각형
 * a는 정사각형입니다.
 * a는 b를 포함합니다.
 */

package Chapter4;

public class Practice06 {
	int x, y, width, height;
	
	public Practice06(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	boolean isSquare() {
		if(width == height) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean contains(Practice06 r) {
		if(r.x >= x && r.y >= y && r.x+r.width <= x+width && r.y+r.height <= y+height) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Practice06 a = new Practice06(3, 3, 6, 6);
		Practice06 b = new Practice06(4, 4, 2, 3);
		
		a.show();
		
		if(a.isSquare()) {
			System.out.println("a는 정사각형입니다.");
		}
		else {
			System.out.println("a는 직사각형입니다.");
		}
		
		if(a.contains(b)) {
			System.out.println("a는 b를 포함합니다.");
		}
		else {
			System.out.println("a는 b를 포함하지 않습니다.");
		}
	}
}
