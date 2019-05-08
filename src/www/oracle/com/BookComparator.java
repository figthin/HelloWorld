package www.oracle.com;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getPrice() != o2.getPrice()) {
			return (int) (o2.getPrice() - o1.getPrice());
		}else {
			return o1.getName().compareTo(o2.getName());
		}
	}

}
