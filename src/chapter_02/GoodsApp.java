package chapter_02;

import mypackage.Goods;

public class GoodsApp {

	public static void main(String[] args) { //mathod영역에 static으로 생성 GoodsApp의 객체정보 로딩
		Goods camera = new Goods(); //stack영역에 Goods객체 정보를 로딩 필드멤버들이 null로 초기화 그 후 heap영역에 할당
		camera.name = "nikon"; //heap영역에 camera 객체가 할당된다
		//camera.name = new String("nikon");
		
		//camera.price = 400000; //클래스 멤버변수들의 값을 할당
		
		//camera.countStock = 30; 
		
		//camera.countSold = 50;
		
		System.out.println(camera);
		
		camera.setCountSold(10);
		camera.showInfo();
		System.out.println(camera.getCountSold());
		camera.setPrice(-10000);
		camera.showInfo();
	}

}

//package chapter_02;
//
//import mypackage.Goods;
//
//public class GoodsApp {
//
//	public static void main(String[] args) { //mathod영역에 static으로 생성 GoodsApp의 객체정보 로딩
//		Goods camera = new Goods(); //stack영역에 Goods객체 정보를 로딩 필드멤버들이 null로 초기화 그 후 heap영역에 할당
//		camera.name = "nikon"; //heap영역에 camera 객체가 할당된다
//		//camera.name = new String("nikon");
//		
//		//camera.price = 400000; //클래스 멤버변수들의 값을 할당
//		
//		//camera.countStock = 30; 
//		
//		//camera.countSold = 50;
//		
//		System.out.println("이름 : "+camera.name);
//				//+" 가격 "+camera.price
//			//+" 재고량 "+camera.countStock
//			//+" 판매량 "+camera.countSold);
//		System.out.println(camera);
//		
//	}
//
//}


//package chapter_02;
//
//public class GoodsApp {
//
//	public static void main(String[] args) { //mathod영역에 static으로 생성 GoodsApp의 객체정보 로딩
//		Goods camera = new Goods(); //stack영역에 Goods객체 정보를 로딩 필드멤버들이 null로 초기화 그 후 heap영역에 할당
//		camera.name = "nikon"; //heap영역에 camera 객체가 할당된다
//		//camera.name = new String("nikon");
//		camera.price = 400000; //클래스 멤버변수들의 값을 할당
//		camera.countStock = 30;
//		camera.countSold = 50;
//		
//		System.out.println("이름 : "+camera.name+" 가격 "+camera.price
//			+" 재고량 "+camera.countStock+" 판매량 "+camera.countSold);
//		System.out.println(camera);
//		
//		
//	}
//
//}
