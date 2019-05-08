package www.oracle.com;

public class Person {
	String name;
	int age;
	
	public Person() {
		
	}
	
	public  Person(String name) {
		this.name = name;
		System.out.println("父类的构造器");
		System.out.println(name);
	}
	
	public void show() {
		System.out.println("name：" + name + "age：" + age);
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
	
	public void feed(Animal animal) {
		animal.eat();
	}
	
}
