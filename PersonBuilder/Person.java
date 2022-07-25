package PersonBuilder;

public class Person {
	private String name;
	private String address;
	private String department;
	private int age;
	private int experience;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", department=" + department + ", age=" + age
				+ ", experience=" + experience + "]";
	}

	public Person(String name, String address, String department, int age, int experience) {
		super();
		this.name = name;
		this.address = address;
		this.department = department;
		this.age = age;
		this.experience = experience;
	}

}
