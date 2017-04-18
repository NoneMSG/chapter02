package com.jx372.paint.main;

import com.jx372.paint.i.*;
import com.jx372.paint.point.ColorPoint;
import com.jx372.paint.point.Point;
import com.jx372.paint.shape.Circle;
import com.jx372.paint.shape.Rect;
import com.jx372.paint.shape.Shape;
import com.jx372.paint.shape.Triangle;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		
		point1.setX(10);
		point1.setY(20);
		
		point1.show();
		
		Point point2 = new Point(30,100);
		
		point2.setX(30);
		point2.setY(50);
		//point1.show(false);
		draw(point2);
		
		Point point3 = new ColorPoint(50,80,"red");
		//point3.show();
		draw(point3);
		draw(new Rect());
		draw(new Circle());
		draw(new Triangle());
		
	}
	public static void draw(Drawable drawable){
		drawable.draw();
		instanceofTest(drawable);
	}
	public static void resize(Drawable drawable, double rate){
		if(drawable instanceof Resizable){
			Resizable resizable = (Resizable)drawable;
			resizable.resize(rate);
		}
	}
	public static void instanceofTest(Drawable drawable){
		
		Shape s = new Circle();
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Triangle);
		Rect r= new Rect();
		//클래스 경우에는 상속관계만 질의 가능
		//System.out.println( r instanceof Circle);
		System.out.println(r instanceof Shape);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Rect);
		
		ColorPoint pt = new ColorPoint(10,20,"yello");
		System.out.println(pt instanceof Resizable);
		System.out.println(pt instanceof Drawable);
		System.out.println(pt instanceof Point);
		System.out.println(pt instanceof ColorPoint);
	}
//	public static void draw(Shape s){
//		s.draw();
//	}

}

//package paint;
//
//public class PaintApp {
//
//	public static void main(String[] args) {
//		Point point1 = new Point();
//		
//		point1.setX(10);
//		point1.setY(20);
//		
//		point1.show();
//		
//		Point point2 = new Point(30,100);
//		
//		point2.setX(30);
//		point2.setY(50);
//		point1.show(false);
//		
//		Point point3 = new ColorPoint(50,80,"red");
//		
//		point3.show();
//		
//		Shape s= new Rect();
//		s.draw();
//	}
//
//}


//package paint;
//
//public class PaintApp {
//
//	public static void main(String[] args) {
//		Point point1 = new Point();
//		
//		point1.setX(10);
//		point1.setY(20);
//		
//		point1.show();
//		
//		Point point2 = new Point(30,100);
//		
//		//point2.setX(30);
//		//point2.setY(50);
//		point1.show(false);
//		
//		
//	}
//
//}
