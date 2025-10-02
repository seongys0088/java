/*
 * 1개의 메모 정보를 담는 Memo 클래스를 작성하라. Memo는 생성자를 비롯하여 다음과 같은 필드와 메소드를 가진다.
 * String 타입의 name, time, content 필드 // 메모 작성자, 메모 시점, 메모 텍스트
 * boolean isSameName() // 메모 작성자가 같으면 true 리턴, 아니면 false 리턴
 * String getName() // 메모 작성자 이름 리턴
 * void show() // 메모 출력
 * int length() // 메모 텍스트의 길이 리턴
 * 
 * Memo 객체를 생성하고 다루는 main 함수와 실행 예시는 다음과 같다.
 * 유송연, 10:10 자바 과제 있음
 * 다른 사람입니다.
 * 김경미가 작성한 메모의 길이는 14
 */

package Chapter4;

public class Practice07 {
	String name, time, content;
	
	public Practice07(String name, String time, String content) {
		this.name = name;
		this.time = time;
		this.content = content;
	}
	
	void show() {
		System.out.println(name + ", " + time + " " + content);
	}
	
	boolean isSameName(Practice07 m) {
		if(m.name == name) {
			return true;
		}
		else {
			return false;
		}
	}
	
	String getName() {
		return name;
	}
	
	int length() {
		int index = content.length();
		return index;
	}
	
	public static void main(String[] args) {
		Practice07 a = new Practice07("유송연", "10:10", "자바 과제 있음");
		Practice07 b = new Practice07("박채원", "10:15", "시카고로 어학 연수가요!");
		Practice07 c = new Practice07("김경미", "11:30", "사랑하는 사람이 생겼어요.");
		
		a.show();
		if(a.isSameName(b)) {
			System.out.println("동일한 사람입니다.");
		}
		else {
			System.out.println("다른 사람입니다.");
		}
		
		System.out.println(c.getName() + "가 작성한 메모의 길이는 " + c.length());
	}
}
