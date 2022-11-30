package homework2_2;

public class Livestreaming {
	public static void main(String[] args) {
//		afreecatv a = new afreecatv();
//		a.type = "아프리카TV";
//		a.types = "인터넷 방송 플랫폼";
//		a.price = 1100;
//		
//		DecimalFormat dc = new DecimalFormat("###,###,###,###");
//		String ch = dc.format(a.price);
//		
//		System.out.println(a.type + "은(는)" + a.types + "이며 별풍선은 10개에 " + ch + "원이다.");
		
		platform[] a = new afreecatv[] {new afreecatv("감스트", "파트너", 110),
				new afreecatv("삼성", "730000", 50)};
		
		platform[] y = new youtube[] {new youtube("뿌꾸", "파트너", 170),
				new youtube("휘센", "1587110", 30)};
		System.out.println(a[0]);
		
	}
}
