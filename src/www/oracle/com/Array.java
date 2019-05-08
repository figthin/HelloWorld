package www.oracle.com;

public class Array {
	private int[] data;
	protected int index;
	
	public Array(int length) {
		data = new int[length];
	}
	
	public boolean add(int num) {
		if(index < data.length) {
			data[index++] = num;
			return true;
		}else {
			return false;
		}
	}
	public int[] getData() {
		return data;
	}
	
	public int getLength() {
		return data.length;
	}
}
