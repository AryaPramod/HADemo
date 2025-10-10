package oops;

class Student{
	private String Name;
	private int Id;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	

}

public class Encapsulation {
	public static void main(String[] args) {
		Student st=new Student();
		st.setName("Arya");
		st.setId(101);
		System.out.println("The name"+ st.getName());
		System.out.println("the id "+st.getId());
	}
	

}
