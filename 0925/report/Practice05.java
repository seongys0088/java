/*
 * 노래 한 곡을 나타내는 Song 클래스를 작성하라. Song 클래스의 필드들은 다음과 같다.
 * 노래의 제목 title
 * 가수 이름 singer
 * 발표 년도 year
 * 가수 나라 lang
 * 
 * 또한 Song 클래스에는 다음 메소드들이 있고, main()의 실행 결과는 다음과 같다.
 * 노래 제목, 가수 이름, 발표 년도, 가수 나라 등 4개의 매개변수를 받아, 객체의 각 필드를 초기화하는 생성자
 * 노래 정보를 출력하는 show() 메소드
 * main() 메소드는 "가로수 그늘 아래 서면", "이문세", 1988, "한국"을 매개변수로 하여 Song 객체로 생성하고, 이 객체의 show()를 호출하여
 * 노래 정보를 다음과 같이 출력한다.
 * 1988년 한국의 이문세가 부른 가로수 그늘 아래 서면
 */

package Chapter4;

public class Practice05 {
	String title, singer, lang;
	int year;
	
	public Practice05(String title, String singer, int year, String lang) {
		this.title = title;
		this.singer = singer;
		this.year = year;
		this.lang = lang;
	}
	
	void show() {
		System.out.print(year + "년 " + lang + "의 " + singer + "가 부른 " + title);
	}
	
	public static void main(String[] args) {
		Practice05 song = new Practice05("가로수 그늘 아래 서면", "이문세", 1988, "한국");
		song.show();
	}
}
