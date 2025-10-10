package polymorphism;

class Animal{
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Ddog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}
class Ccat extends Animal{
	@Override
	void sound() {
		System.out.println("cat meows");
	}
}
public class RunTimePolymorphism {
	public static void main(String[] args) {
		Animal a=new Ddog();
		a.sound();
		Animal b=new Ccat();
		b.sound();
	}

}
