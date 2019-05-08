package www.oracle.com;

public class Product implements Comparable<Product>{

	private String name;
	private double price;
	private int kuCun;
	private int sale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getKuCun() {
		return kuCun;
	}
	public void setKuCun(int kuCun) {
		this.kuCun = kuCun;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public Product(String name, double price, int kuCun, int sale) {
		super();
		this.name = name;
		this.price = price;
		this.kuCun = kuCun;
		this.sale = sale;
	}
	public Product() {
		super();
	}
	@Override
	public int compareTo(Product o) {
		if(this.price != o.price) {
			return (int) (this.price - o.price);
		}else if(this.sale != o.sale) {
			return o.sale - this.sale;
		}else {
			return o.kuCun - this.kuCun;
		}
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", kuCun=" + kuCun + ", sale=" + sale + "]";
	}
	
	
	
	
}
