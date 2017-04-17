package chapter_02;

public class SwapTest {

	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 20 ; 
		
		System.out.println(a+", "+b);
		Swap(a,b);
		System.out.println(a+", "+b);
		/*
		 값이 안 바뀐다. 
		 call by value, call by reference의 차이
		 */
		
		Value val1 = new Value();
		Value val2 = new Value();
		val1.v = 10;
		val2.v = 20;
		
		System.out.println(val1.v+", "+val2.v);
		Swap(val1,val2);
		System.out.println(val1.v+", "+val2.v);
		/*객체의 참조를 통해 값을 바꾸면 값이 바뀐다.
		*객체가 참조하고 있는 인스턴스 값은 stack에서 작업이 빠지더라도
		*heap영역의 값은 그대로 참조하기 때문에 객체를 통해 값을 바꾸면 유지가 된다.
		*/
	}
	
	public static void Swap(Value v1, Value v2){
		int temp = v1.v;
		v1.v = v2.v;
		v2.v = temp;
	}
	public static void Swap(int value1, int value2){
		int temp = value1;
		value1=value2;
		value2=temp;
	}
		
}


//package chapter_02;
//
//public class SwapTest {
//
//	public static void main(String[] args) {
//		
//		int a = 10 ;
//		int b = 20 ; 
//		
//		System.out.println(a+", "+b);
//		//Swap(a,b);
//		int temp = a;
//		a = b; 
//		b = temp;
//		System.out.println(a+", "+b);
//
//	}
//	
//	public static void Swap(int value1, int value2){
//		int temp = value1;
//		value1=value2;
//		value2=temp;
//	}
//
//}
