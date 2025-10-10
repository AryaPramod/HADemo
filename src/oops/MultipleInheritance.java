package oops;

interface College{
	void marks();
}
interface Teacher{
	void dept();
}
class School implements College,Teacher{

	@Override
	public void dept() {
		System.out.println("the dept is CSE");
		
	}

	@Override
	public void marks() {
		System.out.println("highest score in ISE dept");
		
	}
	
	
	
}
public class MultipleInheritance {
	public static void main(String[] args) {
		School sc=new School();
		sc.dept();
		sc.marks();
	}

}
