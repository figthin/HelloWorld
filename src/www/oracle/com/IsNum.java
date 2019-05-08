package www.oracle.com;

public class IsNum {

	public boolean a(String s) {
		/*int length = s.length();
		for(int i = 0; i < length; i++) {
			char charAt = s.charAt(i);
			if(charAt < 48 || charAt > 57) {
				return false;
			}
		}
		return true;*/
		
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	/*public void a1(String s) throws IllegalArgumentException{
		int length = s.length();
		for(int i = 0; i < length; i++) {
			char charAt = s.charAt(i);
			if(!(charAt >= '0' && charAt <= '9')) {
				throw new IllegalArgumentException("字符串不是由纯数字组成！");
			}
		}
	}*/
}
