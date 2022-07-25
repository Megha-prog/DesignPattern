package PersonBuilder;



public class PersonBuilder {
	private String name;
	private String address;
	private String department;
	private int age;
	private int experience;
	
	
	public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
	
	public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
	
	public PersonBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }
	
	
	public PersonBuilder setAge(int age) {
        this.age= age;
        return this;
    }
	
	public PersonBuilder setExperience(int experience) {
        this.experience= experience;
        return this;
    }
	public Person getPerson() {
        return new Person(name, address, department, age, experience);
    }
	
}
