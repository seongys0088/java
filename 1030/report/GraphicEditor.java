/*
 * 4. 다음 코드를 수정하여 Shape 클래스는 graphic 패키지에, Circle 클래스는 component 패키지에, GraphicEditor 클래스는 app 패키지에 분리 작성하라.
 */

package Chapter6;

import graphic.Shape;
import component.Circle;

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
	}
}
