package oops;

class Animal{
	void Sound() {
		System.out.println("Animal makes sound");
	}
}
class Elephant extends Animal{
	void sounds() {
		System.out.println("Elephant roars");
	}
}
class Cat extends Elephant{
	void sound() {
		System.out.println("cat meows");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.sound();
		c.Sound();
		c.sounds();
	}

}
