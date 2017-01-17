package Exception;


public class MyClass {

	public void dangerousMethod() throws MyException {
		System.out.println("some code1");
		System.out.println("some code1");
		
		if (true) {
			// 예외상황이 발생해서 예외를 발생 시킴
			throw new MyException();
		}
		
		System.out.println("some code3");
	}

}
