package superClass;

public class Person {
	
	String name;
	int age;
	String address;
	Person(int age,String name,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
		
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	public void displayInfo() {
		System.out.println("Name:"+name+",age:"+age+" "+",address:"+address);
		
		
	}
	public static void main(String[] args) {
		Person details = new Person(25,"Anjali","Deoria");
		details.setName("Anjali");
		details.setAge(25);
		details.setAddress("Deoria");
		details.displayInfo();
	}


}

