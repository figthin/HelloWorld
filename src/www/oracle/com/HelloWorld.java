package www.oracle.com;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*Book book1 = new Book("西游记", 19.9);
		Book book2 = new Book("红楼梦", 29.9);	
		Book book3 = new Book("水浒传", 59.9);
		
		Set<Book> hashSet = new HashSet<>();
		hashSet.add(book1);
		hashSet.add(book2);
		hashSet.add(book3);
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		Book book = new Book("红楼梦", 29.9);
		System.out.println(hashSet.add(book));
		System.out.println(book.equals(book2));*/

		/*Set<Book> treeSet = new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				if(o1.getPrice() != o2.getPrice()) {
					return (int) (o2.getPrice() - o1.getPrice());
				}else {
					return o1.getName().compareTo(o2.getName());
				}
			}
		});*/
		/*Set<Book> treeSet = new TreeSet<>(new BookComparator());
		
		Book book3 = new Book("水浒传", 59.9);
		Book book2 = new Book("红楼梦", 29.9);	
		Book book1 = new Book("西游记", 19.9);
		Book book4 = new Book("三国演义", 9.9);
		
		treeSet.add(book4);
		treeSet.add(book3);
		treeSet.add(book2);
		treeSet.add(book1);
		
//		System.out.println(treeSet);
		for (Book book : treeSet) {
			System.out.println(book);
		}*/
		
		
		/*Product p1 = new Product("产品1", 19.9, 100, 50);
		Product p2 = new Product("产品2", 97.9, 190, 60);
		Product p3 = new Product("产品3", 59.9, 150, 40);
		Product p4 = new Product("产品4", 97.9, 170, 20);
		Product p5 = new Product("产品4", 97.9, 160, 20);
		
		Set<Product> treeSet = new TreeSet<>();
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		treeSet.add(p4);
		treeSet.add(p5);
		for (Product product : treeSet) {
			System.out.println(product);
		}*/
		
		
		/*String s1 = "cSDvSDS";
		String s2 = "bSDvSDS";
		String s3 = "czfScx";
		String s4 = "czfSASASCv";
		String s5 = "cz";
		
		Set<String> treeSet = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() != o2.length()) {
					return o2.length() - o1.length();
				}else {
					return o1.compareTo(o2);
				}
			}
		});*/
		
		//Set<String> treeSet = new TreeSet<>(Comparator.comparing(String::length).thenComparing(String::compareTo));
		
		/*treeSet.add(s5);
		treeSet.add(s4);
		treeSet.add(s3);
		treeSet.add(s2);
		treeSet.add(s1);
	
		for (String string : treeSet) {
			System.out.println(string);
		}*/
		
//		Map<String, String> hashMap = new HashMap<>();

		
		
		/*List<Integer> arrayList = new ArrayList<>();
		Random random = new Random();
		for(int i = 0; i < 50; i++) {
			int nextInt = random.nextInt(21);
			int temp = nextInt + 30;
			arrayList.add(temp);
		}*/
		/*Map<Integer, Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o2 - o1;
			}
		});
//		int count = 0;
		for(int i = 0; i < 50; i++) {
			Integer integer = arrayList.get(i);
			Integer integer2 = treeMap.get(integer);
			if(integer2 != null) {
				integer2++;
//				count++;
			}else {
				integer2 = 1;
//				count++;
			}
			treeMap.put(integer, integer2);
		}*/
		

		/*Map<Integer, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
		for (Integer integer : arrayList) {
			if(!treeMap.containsKey(integer)) {
				treeMap.put(integer, 1);
			}else {
				Integer integer2 = treeMap.get(integer) + 1;
				treeMap.put(integer, integer2);
			}
		}
		
//		System.out.println(treeMap);
		for (Integer integer : treeMap.keySet()) {
			System.out.println(integer + "->" + treeMap.get(integer));
		}*/
//		System.out.println(count);
//		System.out.println(treeMap.keySet());
		
		/*List<String> arrayList = new ArrayList<>();
		arrayList.add("zsdzc");
		arrayList.add("xdn");
		arrayList.add("xfgnxgd");
		arrayList.add("xdf");
		arrayList.add("d");
//		Collections.sort(arrayList);
		Collections.sort(arrayList, Comparator.comparing(String::length).thenComparing(String::compareTo));
		System.out.println(arrayList);
		System.out.println(Collections.binarySearch(arrayList, "xdn"));
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
		Collections.swap(arrayList, 0, 2);
		System.out.println(arrayList);
		
		Collections.fill(arrayList, "AAA");
		System.out.println(arrayList);*/
		
		
		/*StringBuffer stringBuffer = new StringBuffer();
		Random random = new Random();
		for(int i = 0; i < 50; i++) {
			int nextInt = random.nextInt(4) + 65;
			char c = (char) nextInt;
			stringBuffer.append(c);
		}
		Map<Character, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
		for(int i = 0; i < stringBuffer.length(); i++) {
			char charAt = stringBuffer.charAt(i);
			if(!treeMap.containsKey(charAt)) {
				treeMap.put(charAt, 1);
			}else {
				Integer integer = treeMap.get(charAt) + 1;
				treeMap.put(charAt, integer);
			}
		}
		
		Set<Character> keySet = treeMap.keySet();
		for (Character character : keySet) {
			System.out.println(character + "出现了" + treeMap.get(character) + "次");
		}*/
		/*Map<String, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
		for(int i = 0; i < stringBuffer.length(); i++) {
			String substring = stringBuffer.substring(i, i + 1);
			if(treeMap.containsKey(substring)) {
				Integer integer = treeMap.get(substring) + 1;
				treeMap.put(substring, integer);
			}else {
				treeMap.put(substring, 1);
			}
		}
		for (String string : treeMap.keySet()) {
			System.out.println(string + "出现了" + treeMap.get(string) + "次");
		}*/
		
		/*Random random = new Random();
		List<Integer> arrayList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			int nextInt = random.nextInt(41);
			if(!arrayList.contains(nextInt)) {
				arrayList.add(nextInt);
			}else {
				i--;
			}
		}
		int i = 0;
		while(i < 10) {
			int nextInt = random.nextInt(41);
			if(!arrayList.contains(nextInt)) {
				arrayList.add(nextInt);
				i++;
			}
		}
		System.out.println(arrayList);*/
		/*List<Integer> arrayList = new ArrayList<>();
		for(int i = 1; i <= 40; i++) {
			arrayList.add(i);
		}
		Set<Integer> hashSet = new HashSet<>();
		Random random = new Random();
		while(hashSet.size() < 10) {
			Integer integer = arrayList.get(random.nextInt(arrayList.size()));
			hashSet.add(integer);
		}
		System.out.println(hashSet);*/
		
		/*String s = "1999-03-29";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date parse = simpleDateFormat.parse(s);
			System.out.println(parse);
		} catch (ParseException e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("这是finally");
		}*/
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		while(true) {
			try {
				int nextInt = scanner.nextInt();
				System.out.println(nextInt);
				break;
			} catch (InputMismatchException e) {
				scanner.next();
				System.out.println("输入有误，请重新输入：");
			}
		}
		scanner.close();*/

		/*NetBar netBar = new NetBar();
		System.out.println("开始");
		try {
			netBar.enter(17);
		} catch (IsLessThanEighteenException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("结束");*/
		
		
		/*IsNum isNum = new IsNum();
		System.out.println("165".matches("\\d+"));*/
		
		
		/*BankAccount bankAccount = new BankAccount();
		
		bankAccount.setAccount(101);
		bankAccount.setBalance(5000);
		
		try {
			double drawMoney = bankAccount.drawMoney(10000);
			System.out.println("成功取款！");
			System.out.println(bankAccount.getAccount() + "账户余额" + drawMoney);
		} catch (AccountNotEnoughException e) {
			e.printStackTrace();
		}*/
		/*List<String> arrayList = new ArrayList<>(4);
		arrayList.add("a");
		arrayList.add("as");
		arrayList.add("a");
		arrayList.add("as");
		arrayList.add("yxk");
		arrayList.add("sa");
		arrayList.add("ca");
		arrayList.add("sa");
		arrayList.add("ca");
		arrayList.add("sa");
		arrayList.add("ca");
		arrayList.add("sa");
		arrayList.add("ca");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		HashSet<String> hashSet = new HashSet<>(3);
		hashSet.add("a");
		hashSet.add("h");
		hashSet.add("s");
		hashSet.add("g");
		hashSet.add("r");
		hashSet.add("j");
		hashSet.add("l");
		System.out.println(hashSet.size());*/
		
		/*LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime localDateTime2 = LocalDateTime.now();
		
		System.out.println(localDateTime);
		System.out.println(localDateTime2);
		
		Calendar instance = Calendar.getInstance();
		System.out.println(instance);
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());*/
		
		/*LocalDate now = LocalDate.now();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss");
		String format = now.format(ofPattern);
		System.out.println(format);*/
		
		
		/*LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		// 格式化时间
		String format = now.format(pattern);
		System.out.println(format);*/
		
		/*Date date = new Date();
		System.out.println(date);*/
		
		/*DecimalFormat decimalFormat = new DecimalFormat("#.00");
		double d = 9.659684;
		System.out.println(decimalFormat.format(d));*/
		
		
		/*Scanner scanner = new Scanner(System.in);
		int nextInt;
		while(true) {
			try {
				nextInt = scanner.nextInt();
				System.out.println(nextInt);
				break;
			} catch (Exception e) {
				scanner.next();
				System.out.println("你输入了非法字符，请重新输入：");
			}
			System.out.println("hhhhhhhhhhhhhhhh");
		}*/
		
		
		/*DecimalFormat decimalFormat = new DecimalFormat("0.00");
		double d = 8.0000000000000000000002;
		System.out.println(decimalFormat.format(d));
		System.out.println(8.00 + 107.0000000000000000002);*/
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("请输入编号：");
		int nextInt = scanner.nextInt();
		
		System.out.println("请输入评价：");
		StringBuilder str = new StringBuilder();
		while(scanner.hasNext()) {
			String next = scanner.next();
			System.out.println(next.equals("\n"));
			str.append(next);
		}
		System.out.println(str);
		String nextLine = scanner.nextLine();
		System.out.println(nextLine);
		
		System.out.println("hhhhhhhhhhhhhhhhh");*/
		
		/*String s = "";
		Random random = new Random();
		for(int i = 0; i < 4; i++) {
			int nextInt = random.nextInt(26);
			int r = nextInt + 65;
			char c = (char) (r);
			String s.valueOf(c);
			System.out.println(c);
			s = s.concat(c)
		}*/
		
		
		/*int i = 65;
		char c = (char)i;
		System.out.println(c);*/
		Integer a = 128;
		Integer b = 128;
		System.out.println(a == b);	
	}
}