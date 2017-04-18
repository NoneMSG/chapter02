package person;

public class Student extends Person {
	private String major;
	
	public Student(){
		System.out.println("student() called");
	}
	public Student(String major){
		System.out.println("student(String major) called");
		this.major=major;
	}
	public Student(String name, String major){
		super(name);
		//setName(name);
		this.major= major;
		System.out.println("student(String name,String major) called");
		
	}
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}
