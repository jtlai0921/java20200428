package innerEx;
class Company
{
	enum Product
	{
		lcd(10000),ram(700),mouse(850);
		private int x;
		private Product(int x)
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
	
	enum Month
	{
		一月,二月,三月
	}
}

public class add11 {

	public static void main(String[] args) {
		Company.Product[] x=Company.Product.values();
		Company.Month[] m=Company.Month.values();
	}

}