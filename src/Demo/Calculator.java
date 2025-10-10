package Demo;

public class Calculator {
	
	public void Addition()
	{
		int a=10,b=20;
		int x=a+b;
		System.out.println("Addition is = "+x);

		
	}
	public void Substraction(){
		int c=16,d=6;
		int y=c-d;
		System.out.println("Substraction is ="+y);
	}
	static void Multiplication(){
		int v=5,w=6;
		int z=v*w;
		System.out.println("Multiplication is ="+z);
	}
	static void Division(int s,int t){
		//int s=30,t=6;
		int q=s/t;
		System.out.println("Division is = " +q);
	}
	public static void main(String[] args) {
//		Calculator a=new Calculator();
//		a.Addition();
//		a.Substraction();

		Calculator.Division(30,5);
	}

}

