package oopsAssessment;

interface Vehicle{
	void start();
	void Stop();
	
	
}
class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car is starting");
		
	}

	@Override
	public void Stop() {
		System.out.println("car is stopping");
		
	}
	
}
class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bike is started");
		
	}

	@Override
	public void Stop() {
		System.out.println("Bike is stopped");
		
	}
	
}
public class Transport {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.start();
		b.Stop();
	}

}
