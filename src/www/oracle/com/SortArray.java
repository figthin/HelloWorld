package www.oracle.com;

import java.util.Arrays;

public class SortArray extends Array {

	public SortArray(int length) {
		super(length);
	}
	
	@Override
	public boolean add(int num) {
		boolean add = super.add(num);
		if(add) {
			Arrays.sort(getData(), 0, index);
		}
		return add;
	}
}
