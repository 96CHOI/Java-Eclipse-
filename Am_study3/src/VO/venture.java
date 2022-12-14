package VO;

public class venture implements Comparable {
	private int num;
	private String company;
	private String addr;
	private String category;
	private String business_name;
	private String product;
	
	public venture() {}
	public venture(int num, String company, String addr,
			String category, String name, String product) {
		this.num = num;
		this.company = company;
		this.addr = addr;
		this.category = category;
		this.business_name = name;
		this.product = product;
	}
	// equals는 Object의 기능이기 때문에 똑같이 작성해야한다.
	// 생성하지 않고 equals만 사용하면 정상적 비교 불가능.
	@Override
	public boolean equals(Object obj) {
		// 사용자정의 클래스에서 equals를 구현할 때 어떤 대상을비교할것인지 정해야 한다.
		// 그냥 equals 메서드가 동작안하는 이유는 비교대상이 없기 때문에 동작 못하는 것
		// 그래서 클래스에 equals를 구현해서 비교대상을 정해줘야한다.
		venture tmp = (venture)obj;
		if(this.company.equals(tmp.company))
			return true;
		return false;
	}
	@Override
	public int compareTo(Object o ) {
		
		return this.company.compareTo( ((venture)o).company );
	}
	
	@Override
	public int hashCode() {
		return this.company.hashCode();
	}
	
	@Override
	public String toString() {
		return num + " " + company + " " + addr + " " + category + " " + business_name + " " + product; 
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	
}
