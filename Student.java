package classOnes;

public class Student {
	String name;
	int age;
	long rollNo;
	char sex;
	public Student(String name, int age, long rollNo, char sex) {
	
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.sex = sex;
	}
	public Student() {
		
	}
	public void display(){
		System.out.println("Name : "+ name +"\n Age : " +age+"\nRoll No : "+ rollNo+ "\nsex : " +sex);
	}
	public static void main(String[] args) {
	
	Student s1= new Student();
	Student s2= new Student("jeni", 29,25, 'f');
	s1.display();
	s2.display();

	}

}
