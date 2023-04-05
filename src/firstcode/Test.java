package firstcode;
class Tests{
	public Tests() {
		System.out.println("Hii from constructor");
		
				
	}
	public Tests(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
}
public class Test{
	public static void main(String[] args) {
		new Tests(13,14);
	}
}
