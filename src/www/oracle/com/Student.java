package www.oracle.com;

public class Student extends Person{
	public Student(String name) {
		super(name);
		System.out.println("子类的构造器");
		System.out.println(name);
	}

//	int stuNo;

	/*public Student(String name, int age) {
		super(name, age);
//		super.show();
//		this.name = "于";
//		this.age = 18;
	}*/
	
	/*public Student() {
//		super();
	}*/
	
	/*public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}*/
	
	
	/*String gender;

	public void sleep() {
		System.out.println("睡觉！");
	}

	public void eat() {
		System.out.println("吃饭！");
	}

	public void show() {
		// System.out.println("我是：" + name + ", " + gender + ", 我的学号是：" + stuNo);
	}*/
}
