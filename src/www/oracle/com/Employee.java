package www.oracle.com;

public class Employee {

	private int empno;
	private String name;
	private double salary;
	private double bonus;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empno, String name, double salary, double bonus) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	public double yearSalary() {
		return monthSalary() * 12;
	}
	
	public double monthSalary() {
		return (salary + bonus);
	}
	
	public double daySalary() {
		return monthSalary() / 30;
	}
}
