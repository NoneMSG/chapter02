package person;

public class PersonTest {
	public static void main(String[] args){
		
		Person p0 = new Student();
		Person p2 = new Student("CS");
		Person p3 = new Student("무ㄴ성훈","CS");
		
		Student s = new Student();

		Person p = s; //암시적 캐스딩 (업캐스팅)
		p.setName("둘리");
		
		Student s2 = (Student)p; //다운 캐스팅은 명시적으로 해주어야 한다. 
		s.setMajor("CS");
		
		((Student)p).setMajor("p");
	}
}
