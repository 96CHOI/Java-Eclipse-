package snack;

public class main_emart {
	public static void main(String[] args) {
		emart_item[] s = new snack[] {
				new snack("썬칩",2000,30), new snack("새우깡",1200,20)
		};
		
		s[0].buy();
		
		snack s1 = new snack();
		s1.brand = "";
		s1.price = 11;
		s1.weight = 11;
		
	}
}
