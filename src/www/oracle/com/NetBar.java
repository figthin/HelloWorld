package www.oracle.com;

public class NetBar {

	public /*static*/ void enter(int age) throws IsLessThanEighteenException{
		if(age < 18) {
			throw new IsLessThanEighteenException();
		}
		System.out.println("»¶Ó­¹âÁÙ£¡");
	}
}
