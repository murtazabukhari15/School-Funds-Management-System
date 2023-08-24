
public class Staff extends School {
	private String name;
	private int id;
	private int salary;
	
	public Staff(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
	}


}
