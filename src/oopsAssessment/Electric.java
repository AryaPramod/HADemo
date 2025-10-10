package oopsAssessment;

abstract class Appliance{
	abstract void turnOn();
	abstract void turnOff();
	
}
class Fan extends Appliance{

	@Override
	void turnOn() {
		System.out.println("turn on the fan");
		
	}

	@Override
	void turnOff() {
		System.out.println("turn off the fan");
		
	}
	
}
class Light extends Appliance{

	@Override
	void turnOn() {
		System.out.println("turn on the Light");
		
	}

	@Override
	void turnOff() {
		System.out.println("turn off the Light");
		
	}
	
}
public class Electric {
	public static void main(String[] args) {
		Appliance a=new Fan() ;
		Appliance b=new Light() ;
			a.turnOn();
			a.turnOff();
			b.turnOff();
			b.turnOn();
			
	}

}
