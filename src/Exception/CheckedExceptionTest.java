package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {
	
	public static void main(String[] args) {
//		FileReader fr = new FileReader ("hello.txt");
//		int data = fr.read();
//		fr.close();
		
		FileReader fr = null;
			try {
				fr = new FileReader ("hello.txt");
				int data = fr.read();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				// 자원 정리
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

	}

}
