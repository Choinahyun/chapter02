package person;

public class Student extends Person {
    
	public Student() {
		System.out.println("Student() called");
	}
	
	public Student (String name) {
		// 명시하지 않으면 기본 생성자가 자동으로 호출
		// super();
		super(name);
		System.out.println("Student(String name) called");
		
		// error! 부모 생성자를 명시할 경우에는 반드시 맨 앞에 한다.
		// super();
	}
	
	public void test() {
		//
		name = "둘리";

		//
		height = 130;
		
		//
		age = 23;
		
		//
		//weight = 50;
    }
}


