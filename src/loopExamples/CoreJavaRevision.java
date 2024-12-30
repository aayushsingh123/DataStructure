package loopExamples;

public class CoreJavaRevision {
	
	String email;
	String name;
	int studentId;
	
	
	//constructor--object ke sate ko initialize karega
	//automatocally--new keyword
	//method--Constructor name must be equal/same  class name
	//no return type
	public CoreJavaRevision(String email, String name, int studentId) {
		
		this.email = email;
		this.name = name;
		this.studentId = studentId;
		System.out.println("Student object created..");
	}
	
	
	
	
	
	
	public void showName() {
		System.out.println("Name =" +name);
	}
	
	
	public void showName(String lastName) {
		System.out.println(lastName);
	}
	
	
	public void showAll() {
		System.out.println("Name =" +name);
		System.out.println("email =" +email);
		System.out.println("studentId =" +studentId);
	}



}
