package person;

public class PersonTest {

	public static void main(String[] args) {
		Student s = new Student();
		Student s2 = new Student("둘리");

		
		Person p = s; 	  			// Up casting, Implicity
		Student s3 = (Student) p;   // Down casting, Explicity
		
		// 레퍼런스 p로 객체의 기능 사용하다가...
		// 자식의 메소드를 사용해야 하는 경우
		//(student)p.test(); -> 오류!
		((Student)p).test();
		
	}

}
