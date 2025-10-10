package oops;

class Company{
	String name;
	int salary;
	
	Company(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	void displayinfo() {
		System.out.println("employee name :"+name);
		System.out.println("employee salary :"+salary);
	}
}
class Manager extends Company{
	String dept;
	Manager(String name,int salary,String dept){
		super(name,salary);
		this.dept=dept;
	}
	void displayinfo() {
		super.displayinfo();
		System.out.println("Department :"+dept);
	}
}
public class Superkeyword {
	public static void main(String[] args) {
		Manager m=new Manager("Arya",90000,"IT");
		m.displayinfo();
	}

}
