package mypackage;

public class Goods {
	public final static float DISCOUNT_RATE = 0.2f;
	public static int countOfGoods;
	
	public String name; // public 제한 없음
	protected int price;  // protected 같은 패키지+ 자식
	int countStock; //같은 패키지
	private int countSold; //한 클래스 내부에서만
	
	public Goods(){
		Goods.countOfGoods++; //클래스 필드 내에서는 클래스 이름 생략 가능
		//countOfGoods++;
	}
	
	public void setCountSold(int countSold){
		this.countSold = countSold;
	}
	
	public void showInfo(){
		System.out.println("이름"+name+"가격"+price+"재고"+countStock+"판매량"+countSold);
	}
	
	public int calcDiscountPrice(int percentage){
		int discountPrice = price * percentage / 100 ;
		return discountPrice;
	}
	
	public int getCountSold(){
		return countSold;
	}
	public void setPrice(int price){
		if(price < 0){
			price = 0;
		}
		this.price = price;
	}
}

//package mypackage;
//
//public class Goods {
//	public final static float DISCOUNT_RATE = 0.2f;
//	public static int countOfGoods;
//	
//	public String name; // public 제한 없음
//	protected int price;  // protected 같은 패키지+ 자식
//	int countStock; //같은 패키지
//	private int countSold; //한 클래스 내부에서만
//	
//	public Goods(){
//		Goods.countOfGoods++; //클래스 필드 내에서는 클래스 이름 생략 가능
//		//countOfGoods++;
//	}
//	
//	public void setCountSold(int countSold){
//		this.countSold = countSold;
//	}
//}

//package mypackage;
//
//public class Goods {
//	
//	
//	public String name; // public 제한 없음
//	protected int price;  // protected 같은 패키지+ 자식
//	int countStock; //같은 패키지
//	private int countSold; //한 클래스 내부에서만
//	
//	public void setCountSold(int countSold){
//		this.countSold = countSold;
//	}
//}


//package chapter_02;
//
//public class Goods {
//	String name;
//	int price; 
//	int countStock;
//	int countSold;
//}
