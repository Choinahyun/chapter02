package kr.ac.smu.paint.main;

import kr.ac.smu.paint.i.Drawable;
import kr.ac.smu.paint.i.Resizable;
import kr.ac.smu.paint.shape.Circle;
import kr.ac.smu.paint.shape.Rectangle;
import kr.ac.smu.paint.shape.Shape;

public class InstanceOfTest {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);

		// error!
		//System.out.println(c instanceof Rectangle);
		
		Shape s = new Rectangle();
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Rectangle);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Resizable);
	
		// error!
		//System.out.println(s instanceof String);
		
		Drawable drawable = new Circle();
		System.out.println(drawable instanceof Drawable);
		System.out.println(drawable instanceof Shape);
		System.out.println(drawable instanceof Rectangle);
		
		// error!
		//System.out.println(drawable instanceof String);
		
	}

}
