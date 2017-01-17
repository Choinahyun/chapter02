package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) throws IOException {

		MyClass m = new MyClass();
		
		try {
			m.dangerousMethod();
		} catch (MyException e) {
			e.printStackTrace();
		}

		try {
			func();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	// 예외처리를 하지 않고 회피하는 방법
	public static void func() throws MyException {
		MyClass m = new MyClass();
		m.dangerousMethod();
	}

	public static void func2() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader ("hello.txt");
		int data = fr.read();
		fr.close();
	}
	
//	public static void func3 () {
//		try {
//			
//		} catch () {
//			
//		}
//	}
}
