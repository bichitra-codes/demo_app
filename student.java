
public class student {
      
	String name;
	int rollno;
	student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	void displaystudent() {
		System.out.println("name = " + name);
		System.out.println("rollno ="+ rollno);
	}
	public static void main(String[] args) {
		student s1=new student("Bichitra",101);
		s1.displaystudent();
		student s2=new student("jaga",102);
		s2.displaystudent();

	}

}
 