package www.oracle.com;

import java.util.Scanner;

public class Demo1 {
	
	/*static char[] codes = new char[62];
	
	static {
		int i = 0;
		for(i = 0; i < 10; i++) {
			codes[i] = (char) (i + 48);
		}
		for(i = 10; i < 36; i++) {
			codes[i] = (char)(55 + i);
		}
		
		for(i = 36; i < 62; i++) {
			codes[i] = (char)(i + 61);
		}
	}*/
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*myClass<String> myClass = new myClass<>();
		myClass.setData("HelloWorld");
		String data = myClass.getData();
		int length = data.length();
		System.out.println(length);
		
		myClass<Double> data1 = new myClass<>();
		
		data1.setData(10.5);
		
		Double data2 = data1.getData();
		System.out.println(data2 * 2);
		
		
		myClass<Integer> data3 = new myClass<>();
		
		data3.setData(5);
		Integer data4 = data3.getData();
		System.out.println(data4);*/
		/*Student stu1 = new Student();
		 stu1.name = "张三"; 
		 stu1.stuNo = 1001;
		 stu1.gender = "男"; 
		 stu1.sleep(); 
		 stu1.eat(); 
		 stu1.show();*/
		 
		
		 /*Book b1 = new Book();
		 // Book b2 = new Book(); 
		 b1.author = "吴承恩"; 
		 b1.name = "西游记"; 
		 b1.price = 9.9; 
		 b1.author = "施耐庵"; 
		 b1.name = "水浒传"; 
		 b1.price = 19.9;*/
		 

		// Method method = new Method();
		
		 /*method.a();
		 method.b("Hello"); 
		 method.c(10);
		 
		
		 System.out.println(method.d()); 
		 System.out.println(method.f(2, 3));
		 System.out.println(method.g(1.0, 1.2));*/
		 
		// int[] a = new int[] { 78, 45, 96, 56, 78, 45, 23 };
		
		 /*int b = 78; 
		 int index = method.indexOf(a, b); 
		 int lastIndex = method.lastIndexOf(a, b); 
		 System.out.println(index);
		 System.out.println(lastIndex);
		 
		 int len = method.length(1000); 
		 System.out.println(len);*/
		 
		
		 /*int max = method.compare(a); 
		 System.out.println(max); 
		 String s = "HelloWorld"; 
		 int length = s.length(); 
		 System.out.println(length); 
		 char c = s.charAt(2); 
		 System.out.println(c); 
		 String concat = s.concat("xxx");
		 System.out.println(concat); 
		 System.out.println(s); 
		 boolean contains = s.contains("w"); 
		 System.out.println(contains);
		 System.out.println("a".compareTo("b"));*/
		 

		/*String[] s = { "fe", "bdb", "bze", "zf" };
		System.out.println(Arrays.toString(s));
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = 0; j < s.length - 1 - i; j++) {
				if (s[j].compareTo(s[j + 1]) > 0) {
					String str = s[j];
					s[j] = s[j + 1];
					s[j + 1] = str;
				}
			}
		}
		System.out.println(Arrays.toString(s));*/

		
		 /*String s = "fzsddzvrddrzfsrez"; 
		 int count = 0;
		 for(int i = 0; i < s.length(); i++) {
			 if(s.charAt(i) == 'z') {
				 count++;
			 }
		 }
		 System.out.println(count);*/
		 

		
		/*String s = "MLInionoinaiINI"; 
		String str = "";
		for(int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if(charAt >= 65 && charAt <= 90) {
				str += charAt;
			}
		}
		System.out.println(str);*/
		
		/*Book book1 = new Book("马尔克斯", 99.99, "生命从不曾离开孤独而独立存在！");
		Book book2 = new Book();
		
		book2.setAuthor("莎士比亚");
		book2.setName("To be, or not to be, this is a question!");
		book2.setPrice(99999.99);
		
		book1.show();
		book2.show();*/
		
		/*book1.setAuthor("马尔克斯");
		book1.setName("生命从不曾离开孤独而独立存在！");
		book1.setPrice(999.999);*/
		
//		System.out.println(book2.getAuthor() + "写了" + book2.getName() + "售价：" + book2.getPrice());
//		System.out.println(book1.getAuthor() + "写了" + book1.getName() + "售价：" + book1.getPrice());
//		book.show();
		/*Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();*/
		/*Book.author = "xxx";
		System.out.println(Book.author);*/
		/*Book b1 = Book.getInstance();
		Book b2 = Book.getInstance();
		System.out.println(b1 == b2);
		System.out.println(b1);
		System.out.println(b2);*/
		
		
		/*String s = "awdazscsz";
		char[] charArray = s.toCharArray();
		String string = new String(charArray);
		System.out.println(string);*/
		/*for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'z') {
				s.charAt(i);
			}
		}*/
		
		/*Student student = new Student();
		student.setName("张三");
		student.setAge(18);
		student.setStuNo(1001);;
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getStuNo());*/
		/*Animal animal = new Animal();
		animal.eat();
		Cat cat = new Cat();
		cat.eat();
		Dog dog = new Dog();
		dog.eat();*/
//		Person person = new Person("哈哈", 21);
//		person.show();
		/*Student student = new Student("wait", 45);
//		person.show();
		student.show();
		
		Person person = new Person();
		person.show();*/
		
		/*SortArray array = new SortArray(5);
		array.add(30);
		array.add(10);
		array.add(20);
		array.add(40);
		boolean add1 = array.add(50);
		boolean add2 = array.add(60);
		System.out.println(add1);
		System.out.println(add2);
		int[] data = array.getData();
		System.out.println(Arrays.toString(data));*/
		
//		Person person = new Person();
//		Student student = new Student("haha");
//		System.out.println(student.getName());
//		System.out.println(person.getName());
		/*Book book = new Book();
		Book book2 = new Book();
		book.setName("西游记");
		book.setPrice(9.9);
		
		book2.setName("西游记");
		book2.setPrice(9.9);
		
		
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode());
		
		
		System.out.println(book.equals(book2));*/
		
		
//		Person person = new Person();
		/*Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		person.feed(cat);
		person.feed(dog);
		person.feed(animal);
		if(animal instanceof Cat) {
			System.out.println("zhuanghuan");
		}*/
		
//		School school = new School();
//		school.AnZhuang(new DaYinJi());
//		school.AnZhuang(new CaiSe());
//		school.AnZhuang(new DaYinJi());
//		DaYinJi daYinJi = new CaiSe();
//		DaYinJi caiSe = new CaiSe();
//		DaYinJi heiBai = new HeiBai();
//		caiSe.DaYinJiYa();
//		heiBai.DaYinJiYa();
//		DaYinJi daYinJi = caiSe;
		
//		daYinJi.daYinJiYa();
		
		/*DaYinJi daYinJi = new DaYinJi();
		if(daYinJi instanceof CaiSe) {
			CaiSe caiSe = (CaiSe)daYinJi;
			caiSe.daYinJiYa();
		}*/
		
		/*School school = new School();
		Printer colorPrinter = new ColorPrinter();
		Printer blackPrinter = new BlackPrinter();
		
		school.setPrinter(colorPrinter);
		school.setPrinter(blackPrinter);*/
		
		/*Employee employee = new Employee(1001, "张三", 5000, 450);
		System.out.println(employee);
		System.out.println("年薪：" + employee.yearSalary());
		System.out.println("月薪：" + employee.monthSalary());
		System.out.println("每日平均工资：" + employee.daySalary());*/
		
		/*Rectangle rectangle = new Rectangle(5);
		System.out.println(rectangle);
		System.out.println("面积：" + rectangle.area() + ",周长：" + rectangle.perimeter());
		
		Circle circle = new Circle(5);
		System.out.println(circle);
		System.out.println("面积：" + circle.area() + ",周长：" + circle.perimeter());*/
		
		
		/*Animal dog = new Dog();
		Animal cat = new Cat();
		dog.eat();
		cat.eat();*/
		
		
		/*Printer colorPrinter = new ColorPrinter();
		Printer blackPrinter = new BlackPrinter();
		colorPrinter.print();
		blackPrinter.print();*/
		
//		Animal dog = new Dog();
		/*Animal animal = new Animal();
		Cat cat = (Cat)animal;*/
		
		/*int[] a = new int[3];
		System.out.println(a[3]);*/
		
		/*List<String> arrayList = new ArrayList<>();
		arrayList.add("小沈阳");
		arrayList.add("宋小宝");
		arrayList.add("刘能");
		arrayList.add("赵四");
		
//		arrayList.add(1, "aaa");
		
//		System.out.println(arrayList.size());
//		System.out.println(arrayList);
		for (String string : arrayList) {
			System.out.println(string);
		}*/
		
		
		/*MyInt myInt = new MyInt(0);
		if(myInt != null) {
			System.out.println("赋值了");
		}*/
		
		/*Object a = 100;
		System.out.println(a.hashCode());*/
		
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的生日[yyyy-MM-dd]：");
		String next = scanner.next();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = simpleDateFormat.parse(next);
		long time = parse.getTime();
		
		Date date = new Date();
		long time2 = date.getTime();
		
		System.out.println("你活了：" + (time2 - time) / 1000 / 60 / 60 / 24 + "天");
		scanner.close();*/
		
//		Demo1 demo1 = new Demo1();
//		System.out.println(demo1.randomCode1(4));
//		System.out.println(demo1.randomCode(4));
//		System.out.println(demo1.randomCode1(4));
		/*Date date = new Date();
		long time = date.getTime();
		System.out.println(time / 1000 / 60 / 60 / 24 / 365);
		System.out.println(time);
		long time2 = date.getTime();
		System.out.println(time2);*/
		/*long currentTimeMillis = System.currentTimeMillis();
		
		System.out.println(demo1.randomCode1(4));
		
		long currentTimeMillis2 = System.currentTimeMillis();
		System.out.println("共花费：" + (currentTimeMillis2 - currentTimeMillis) + "毫秒");*/
		
		
		
		/*Collections.sort(arrayList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.compareTo(o2) > 0) {
					
				}
				return 0;
			}
		});*/
		
		//对String类型的List数组升序排序
		/*for(int j = 0; j < arrayList.size() - 1; j++) {
			for(int i = 0; i < arrayList.size() - 1 - j; i++) {
				String string = arrayList.get(i);
				String string2 = arrayList.get(i + 1);
				int compareTo = string.compareTo(string2);
				
				if(compareTo > 0) {
					arrayList.set(i, string2);
					arrayList.set(i + 1, string);
				}
			}
		}*/
		
		/*ArrayList<String> arraryList = new ArrayList<>();
		arraryList.add("张三");
		arraryList.add("李四");
		arraryList.add("王五");
		arraryList.add("刘浏");
		
		ArrayList<String> arraryList1 = new ArrayList<>(arraryList);*/
		
//		System.out.println(arraryList1);
		/*for(int i = 0; i < arrayList.size(); i++) {
			for(int j = i + 1; j < arrayList.size(); j++) {
				if(arrayList.get(i).equals(arrayList.get(j))) {
					arrayList.remove(j);
					j--;
				}
			}
		}*/
		
		
		/*String a = "ab";
		String b = "ba";
		int compareTo = a.compareTo(b);
		System.out.println(compareTo);*/
		
	
	
	/*public String randomCode(int legth) {
		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int length = str.length();
		char[] c = new char[legth];
		Random random = new Random();
		for(int i = 0; i < legth; i++) {
			int nextInt = random.nextInt(length);
			char charAt = str.charAt(nextInt);
			c[i] = charAt;
		}
		String result = String.valueOf(c);
		return result;
	}*/
	
	/*public StringBuilder randomCode1(int legth) {
		
		
		
		Random random = new Random();
		
		StringBuilder result = new StringBuilder("");
		
		while(result.length() < legth) {
			int nextInt = random.nextInt(62);
			char c = codes[nextInt];
			if(result.indexOf(c + "") == -1) {
				result += c;
			}
			if(result.indexOf(c + "") == -1) {
				result.append(c);
			}
		}
		return result;
		char[] results = new char[legth];
		for(i = 0; i < legth; i++) {
			int nextInt = random.nextInt(62);
			if(codes[nextInt] != '*') {
				results[i] = codes[nextInt];
				codes[nextInt] = '*';
			}else {
				i--;
			}
			
		}
		
	}*/
	
	/*public String randomCode3(int legth) {
		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] split = str.split("");
		String result = "";
		Random random = new Random();
		for(int i = 0; i < legth; i++) {
			int nextInt = random.nextInt(61);
			if(result.contains(split[nextInt])) {
				i--;
				continue;
			}
			result += split[nextInt];
		}
		return result;
	}*/
	
	


/*class myClass<T>{
	
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
}*/



		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入编号：");
		int nextInt = scanner.nextInt();
		System.out.println(nextInt);
		
		System.out.println("请输入内容：");
		String next = scanner.nextLine();
//		System.out.print(next);
		String s= scanner.nextLine();
		
		
		System.out.println(s + "hhhhhhhhhhhhhhhhhhh");
//		System.out.println("555555555555555555555");

	}
}