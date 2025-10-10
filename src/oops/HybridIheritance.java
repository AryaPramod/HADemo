package oops;


class Person{
	void details() {
		System.out.println("Person has basic details");
	}
}
interface worker{
	void work();
}
interface learner{
	void Learn();
	
}
class Employee extends Person implements worker,learner{
public	void work() {
		System.out.println("Person works");
		
	}

	@Override
	public void Learn() {
		System.out.println("person learns");
		
	}
}
public class HybridIheritance {
	public static void main(String[] args) {
		Employee e =new Employee();
		e.details();
		e.work();
		e.Learn();
	}

}
