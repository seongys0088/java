/*
 * Cube는 직육면체를 표현하는 클래스이다. 다음 main() 메소드와 실행 결과를 참고하여 Cube 클래스를 작성하라.
 * 
 * 큐브의 부피는 6
 * 큐브의 부피는 48
 * 큐브의 부피는 0이 아님
 */

package Chapter4;

public class Practice02 {
	int width, length, height;
	
	public Practice02() {
		
	}
	
	public Practice02(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	int getVolume() {
		int volume = width * length * height;
		return volume;
	}
	
	void increase(int width, int length, int height) {
		this.width += width;
		this.length += length;
		this.height += height;
	}
	
	boolean isZero() {
		if(getVolume() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Practice02 cube = new Practice02(1,2,3);
		System.out.println("큐브의 부피는 " + cube.getVolume());
		
		cube.increase(1,2,3);
		System.out.println("큐브의 부피는 " + cube.getVolume());
		
		if(cube.isZero()) {
			System.out.println("큐브의 부피는 0");
		}
		else {
			System.out.println("큐브의 부피는 0이 아님");
		}
	}
}
