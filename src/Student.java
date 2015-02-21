
public class Student {
	String name;
	double grade;
	int age;
	String address;
	double height;
	double weight;
	
	public Student() {
		super();
	}

	public Student(String name, double grade, int age, String address,
			double height, double weight) {
		super();
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double averageValue(){
		double result;
		result = (grade + age + height + weight) /4.0;
		return result;
	}
	
	
}
