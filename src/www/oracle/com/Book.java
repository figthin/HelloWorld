package www.oracle.com;

public class Book /*implements Comparable<Book>*/{
	/*private String name;
	private double price;
	
	
	private String author;
	
	static String s;
	
	static {
		System.out.println("静态语句快");
	}
	public Book() {
		System.out.println("午餐构造方法");
	}
	public Book(String author, double price, String name) {
		this();
		this.name = name;
		this.price = price;
	}
	
	public Book(String author){
		this.author = author;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setAuthor(String author) {
		if(!author.equals("于祥可")) {
			author = "于祥可";
		}
		this.author = author;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	public String getAuthor() {
		return this.author;
	}
	
	
	public void show() {
		System.out.println("author: " + author + "\n"+ "name: " + name + "\n" + "price: " + price);
	}*/
	
	/*private Book() {
		
	}
	
	private static Book book = new Book();
	
	public static Book getInstance() {
		return book;
	}*/
	
	private String name;
	private double price;
	
	public Book() {
		super();
	}
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
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
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	/*@Override
	public int compareTo(Book o) {
		System.out.println("this.name：" + this.name);
		System.out.println("o.name" + o.name);
		System.out.println("--------------------");
		return 1;
	}*/
}
