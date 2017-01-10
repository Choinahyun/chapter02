package chapter02;

public class Goods {

	private String name;
	protected int price;
	public int countStock;
	
	// default 접근 제어 ( public, protected, private 로  접근 지시자를 명시하지 않은 경우) 같은 패키지에서만 접근 가능
	int countSold;
	
	String getName () {
		return name;
	}
	
	void discount ( int percentage ) {
		price = price - price * percentage ;
	}
	
}
