package Exception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	// 기본 예외 메시지
	public MyException() {
		super("테스트 에외입니다.");
	}
	
	// 메시지를 세팅해야 하는 경우
	public MyException (String message) {
		super(message);
	}
}
