package kr.ac.smu.paint.main;

import kr.ac.smu.paint.i.Drawable;
import kr.ac.smu.paint.point.ColorPoint;
import kr.ac.smu.paint.point.Point;
import kr.ac.smu.paint.shape.Circle;
import kr.ac.smu.paint.shape.Rectangle;
import kr.ac.smu.paint.shape.Triangle;

public class paintApp {

	public static void main(String[] args) {
		
		Point pt1 = new Point();
		pt1.setX(100);
		pt1.setY(200);
		
		Point pt2 = new Point(50, 100);
		


		pt1.show(false);
		pt2.show(false);
		pt2.show(true);
		
		Point pt3 = new ColorPoint(500, 500, "red");
		
		
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		draw (pt1);
		draw (pt2);		
		draw (pt3);
		
//		drawRectangle(rectangle);
//		drawCircle(circle);
		draw(rectangle);
		draw(circle);
		draw(triangle);
		
	}
	
	public static void draw (Drawable drawable) {
		drawable.draw();
	}
	
//	public static void drawPoint (Point point) {
//		point.show();
//	}
//	
//	public static void drawShape (Shape shape) {
//		shape.draw();
//	}
	

//	public static void drawRectangle (Rectangle rect) {
//		Rectangle.draw();
//	}
//	
//	public static void DrawCircle (Circle cir) {
//		Circle.draw();
//	}
}
