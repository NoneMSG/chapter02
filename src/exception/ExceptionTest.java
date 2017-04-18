package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a= 0;
		try{
			int b= 100/a;
		}catch(ArithmeticException ex){
			//ex.printStackTrace();
			//System.out.println("예외발생");
			
			//1. 사과
			System.out.println("죄송합니다.");
			//2. 로그남기기
			System.out.println("Log:"+ex);
			//3. 종료
			return; 
		}finally{
			System.out.println("자원정리");
		}
		
		System.out.println("somemorecode");
		
	}

}
