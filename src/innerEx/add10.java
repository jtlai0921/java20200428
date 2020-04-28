package innerEx;
class school6
{
	public static final String book1="java6";
	public static final String book2="java7";
	public static final String book3="java8";
}

enum school6_2// school6_2[]  ?={java6,java7,java8}--.public static final 
{
	java6,java7,java8
}
enum school6_3
{
	java6(700),java7(800),java8(900);
	private int x;
	private school6_3(int x)
	{
		this.x=x;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}	
}

public class add10 {

	public static void main(String[] args) {
		System.out.println(school6.book1);
		
		school6_2[] x=school6_2.values();
		
		System.out.println(x[0]);
		
		
		school6_3[] x2=school6_3.values();
		x2[1].setX(1000);
		System.out.println(x2[1].getX());

	}

}