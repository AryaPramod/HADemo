package polymorphism;



class Clac{
	int  add(int a,int b) {
		return a+b;
		
	}
	double add(double c,double d) {
		return c+d;
	}
}
public class CompileTimePolymorphism {
	public static void main(String[] args) {
		Clac c=new Clac();
		c.add(12.5, 23.98);
		c.add(78,33);
		
	}

}

