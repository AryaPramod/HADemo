package oops;

class Dog{
	void sound() {
		System.out.println("Dog is the parent");
	}
}
class Puppy extends Dog{
	void sound() {
		System.out.println("Puppy is the child");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		//Dog d=new Dog();
		Puppy p =new Puppy();
		p.sound();
	}

}
