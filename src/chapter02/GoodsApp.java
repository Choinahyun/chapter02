package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		// private은 외부에서 접근 X
		//camera.name = "nikon";
		
		// protected는 같은 패키지에서 접근 가능 + 다른 패키지의 자식 클래스도 접근 가능
		camera.price = 4000000;
		
		// public은 외부에서도 가능
		camera.countStock = 50;
		
		// default로 같은 패키지에서 접근 가능
		camera.countSold = 100;
	}

}
