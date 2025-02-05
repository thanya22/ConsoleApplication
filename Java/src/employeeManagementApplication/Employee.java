package employeemanagementapplication;

class Employee {

	private int id;
	private String name;
	private int age;
	private String address;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee Details \n Id = " + id + "\n Name = " + name + "\n Age = " + age + "\n Address=" + address
				+ "\n Salary=" + salary;
	}

	public Employee(int id, String name, int age, String address, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
	}
}
	
	
	
	
	


