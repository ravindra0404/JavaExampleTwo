package springExample;

public class SpringBean {
	
	private String Name;
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public void display(){
		System.out.println("Welcome mr. "+ Name);
	}
	
}
