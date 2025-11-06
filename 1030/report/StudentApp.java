/*
 * 1. 다음 main()이 실행되면 예시와 같이 출력되도록, 학생 1명의 정보를 담은 Student 클래스를 작성하고, main()을 포함하는 StudentApp 클래스를 작성하라.
 */


package Chapter6;

class Student {
	String name;
	int id;
	
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "학번이 " + this.id + "인 " + this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		if(s.name.equals(name) && s.id == id) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class StudentApp {
	public static void main(String[] args) {
		Student a = new Student("황기태", 23);
		Student b = new Student("황기태", 77);
		
		System.out.println(a);

		if(a.equals(b)) {
			System.out.println("같은 학생입니다.");
		}
		else {
			System.out.println("다른 학생입니다.");
		}
	}
}
