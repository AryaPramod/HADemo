package oops;

class Birds
{
	void eat() {
		System.out.println("Birds eat grains");
	}
}
class  Parrot extends Birds{
	void color() {
		System.out.println("Parrot is in green color");
	}
}
class Pigeon extends Birds{
	void sound() {
		System.out.println("Pigeon is murmuring");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		Pigeon p=new Pigeon();
		p.eat();
		p.sound();
		Parrot p1=new Parrot();
		p1.eat();
		p1.color();
	}

}
