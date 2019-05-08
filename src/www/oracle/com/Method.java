package www.oracle.com;

public class Method {
	public void a() {
		System.out.println("执行了a方法");
	}

	public void b(String s) {
		System.out.println("参数是：" + s);
	}

	public void c(int i) {
		System.out.println("参数是：" + i);
	}

	public String d() {
		return "d方法的返回值";
	}

	public int f(int a, int b) {
		return a + b;
	}

	public double g(double a, double b) {
		return a - b;
	}

	public int indexOf(int[] a, int b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				return i;
			}
		}
		return -1;

	}

	public int lastIndexOf(int[] a, int b) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == b) {
				return i;
			}
		}
		return -1;
	}

	public int length(int a) {
		if (a < 0)
			a = -a;
		int b = 0;
		while (a > 0) {
			a /= 10;
			b++;
		}
		return b;
	}
	/*public int compare(int a, int b) {
		return a > b ? a : b;
	}*/
	
	/*public int compare(int a, int b, int c) {
//		int max = -1;
		max = a > b ? a : b;
		max = max > c ? max : c;
		max = compare(a, b);
		max = compare(max, c);
		return compare(compare(a, b), c);
	}*/
	
	/*public int compare(int a, int b, int c, int d) {
		int max = -1;
		max = a > b ? a : b;
		max = max > c ? max : c;
		max = max > d ? max : d;
		return compare(compare(a, b, c), d);
	}*/
	
//	public int compare(int[] arr) {
	public int compare(int ... arr) {	//可变参数
		int max = -1;
		for(int i = 0; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
		}
		return max;
	}
}
