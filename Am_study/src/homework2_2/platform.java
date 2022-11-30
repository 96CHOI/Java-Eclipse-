package homework2_2;

public class platform {
//	public String types;
//	public int price;
	
	public String types;
	public int price;
		public platform() {
			
		};
		public platform (String types, int price) {
			this.types = types;
			this.price = price;
		}
		
		@Override
		public String toString() {
			return "BJ명 : " + types + " 파트너BJ 여부 : " ;
		}
		
		
		
}
