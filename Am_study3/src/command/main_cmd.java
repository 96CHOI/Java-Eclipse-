package command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import DAO.venture_DAO;
import VO.venture;

public class main_cmd {
	
	public static void main(String[] args) {
		venture_DAO vdao = new venture_DAO();
		List<venture> list = vdao.Select_all();
		
		//TreeSet - 이진트리 - 크냐 작냐로 구분 기준보다 크면 오른쪽 작으면 왼쪽 
		TreeSet<venture> sw = new TreeSet<>();
		TreeSet<venture> build = new TreeSet<>();
		
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			venture temp = it.next();
			if(temp.getCategory().contains("정보처리"))
				sw.add(temp);
			if(temp.getCategory().contains("건설"))
				build.add(temp);
		}
		
//		System.out.println(sw);
		
		// treeset 메서드 (검색용)
		// floor(객체) - 지정된 객체와 같은 객체를 찾아서 반환 하거나, 없으면 작은값중에서 가까운 객체 반환
		// headSet(객체) - 지정된 객체보다 작은 객체 모두 반환
		// tailSet(객체) - 지정된 객체보다 큰 객체 모두 반환
		// higher(객체) - 지정된 객체보다 큰 값을 가진 객체중에서 가장 가까운 객체, 없으면 null
		// lower(객체) - 지정된 객체보다 작은 값을 가진 객체중에서 가장 가까운 객체, 없으면 null
		// subSet(객체1, 객체2) - 범위 검색, 객체1부터 객체2전 까지 객체들 반환.
		
		List<venture> sw_list = new ArrayList<>(sw);
		System.out.println(sw.floor(sw_list.get(5)));
		
		System.out.println(sw.headSet(sw_list.get(3)));
		
		System.out.println(sw.lower(sw_list.get(10)));
		
		System.out.println(sw.subSet(sw_list.get(2), sw_list.get(4)));
		
		venture srh = new venture();
		srh.setCompany("(주)골나");
		
		System.out.println(sw.headSet(srh));
		// TreeSet 검색방법 - 이진트리 안에 저장되어 있는 값 기준으로 검색
		// 이진트리 안에 저장되어있는 값은 객체의 주소 값이 저장되어 있다.
		// 검색시에 저장되어있는 순서에 의해서 결과 값이 나온다.
		// 그러므로 위와 같이 검색하고자하는 회사이름을 따로 입력해서 객체를 생성하여 검색에 사용하는 방식은
		// treeset 안에 없는 값이기 때문에 검색이 이루어 지지않는다. 되는경우 있음 무조건 아님.
		
		
		
		// compareTo - Java에서 정렬 할 때 사용하는 것
		// java 에서는 양수가 나올때 오름차순, java에서는 기본 오름차순
		// 알파벳 사전적 순서 차이
//		String a = "hot";
//		String b = "apple";
//		// 앞쪽이 작을 때 양수
//		System.out.println( a.compareTo(b) );
//		
//		// 앞쪽이 클 때 음수
//		System.out.println( b.compareTo(a) );
		
		
		
		/*
		// 카테고리 중복 제거 분류 출력
		Set<String> category = new HashSet<>();
		//Set - 중복허용 X
		
		// 분류 출력 
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			category.add(it.next().getCategory());
		}
		
		Set<venture> retail = new HashSet<>(); // 도소매업
		Set<venture> sw = new HashSet<>(); // 정보처리, SW
		Set<venture> build = new HashSet<>(); // 건설, 운수
		
		it = list.iterator();
		while(it.hasNext()) {
			venture data = it.next(); //벤처데이터들을 하나씩 data에 저장하기
			if(data.getCategory().contains("도소매업") )
				retail.add(data);
			if(data.getCategory().contains("정보처리") )
				sw.add(data);
			if(data.getCategory().contains("건설") )
				build.add(data);
		}
		
		venture a = new venture(list.get(0).getNum(), list.get(0).getCompany(),
								list.get(0).getAddr(),list.get(0).getCategory(),
								list.get(0).getBusiness_name(), list.get(0).getProduct());
		
		venture b = new venture(list.get(0).getNum(), list.get(0).getCompany(),
								"박영주 어그",list.get(0).getCategory(),
								list.get(0).getBusiness_name(), list.get(0).getProduct());
		*/
		
		// equals : 같은 문자열, 클래스의 데이터들 끼리 비교할 때 사용. (객체끼리의 내용 비교)
		// 객체의 주소를 가지고 비교한다.
		// 객체 끼리 비교하려면 equals를 오버라이딩 해야한다.
		// 비교하는 것은 전부 equals가 동작한다.
		
//		if("김유신".equals("김유시")) {
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다.");
//		}

		// 정보처리 집합과 도소매 집합의 차집합 구하기 (주소 - addr 기준으로)
		// 정보처리 집합과 도소매 집합의 교집합 구하기 (주소 - addr 기준으로)
		/*
		//내가 푼 것
		Set<String> cha = new HashSet<>();
		Set<String> gyo = new HashSet<>();

		Iterator<venture> s = sw.iterator();
		Iterator<venture> r = retail.iterator();
		
		//차집합
		int i = 0;
		while(s.hasNext()) {
			String name = s.next().getAddr();
			if(retail.equals(name))
				return;
			cha.add(name);
			i++;
		}
		System.out.println("차집합 : " + cha + i + "개");
		
		Set<Venture> cha = new HashSet<>();
      	Set<Venture> gyo = new HashSet<>();
      
      	Iterator<Venture> SW = sw.iterator();
      	Iterator<Venture> st = retail.iterator();
      	while(SW.hasNext()) {
         	Venture a = SW.next();
         	if(retail.contains(a)) 
            	continue;
         	cha.add(a);
      	}
      	System.out.println(cha);
      
      	List<Venture> cha_list = new ArrayList<>(cha);
      	for(Venture tmp : cha_list) {
         	System.out.println(tmp);
      	}
      
      	SW = sw.iterator();
      	while(SW.hasNext()) {
         	Venture a = SW.next();
         	if(retail.contains(a)) 
            	gyo.add(a);
      	}
      	System.out.println(gyo);

		
		//교집합 (중복인 것만)
		int count = 0;
		while(r.hasNext()) {
			String name = r.next().getAddr();
			if(sw.equals(name))
				continue;
			gyo.add(name);
			count++;
		}
		System.out.println("교집합 : " + gyo + count + "개");
		*/
		
		
//		if (list.contains(b))
//			System.out.println("있다.");
//		else
//			System.out.println("없다.");
//		
//		if (list.contains(a))
//			System.out.println("있다.");
//		else
//			System.out.println("없다.");
		
//		if(a.equals(b))
//			System.out.println("같다.");
//		else
//			System.out.println("다르다.");
		
//		System.out.println( sw.size() );
		
//		System.out.println(retail);
		
		// 차집합, 교집합, 합집합
		// 주소를 기준으로 ....
		/*
		HashSet<String> name1 = new HashSet<>();
		HashSet<String> name2 = new HashSet<>();
		
		name1.add("김유신");	name1.add("이순신");	name1.add("김춘추");
		name1.add("장영주");	name1.add("김기원");	name1.add("윤재영");
		name1.add("이지현");	name1.add("미지연");	name1.add("최윤도");
		
		name2.add("김민정");	name2.add("김민서");	name2.add("김춘추");
		name2.add("장영주");	name2.add("이종빈");	name2.add("윤재영");
		name2.add("이지현");	name2.add("변크리스탈");	name2.add("리정수");
		
		Set<String> hab = new HashSet<>();
		Set<String> cha = new HashSet<>();
		Set<String> gyo = new HashSet<>();
		
		//name1과 name2를 비교하여 출력한다.
		//name1번을 다 출력하고 name2와 비교해서 중복은 빼고 출력함.
		
		// 합집합 (중복 제외한 둘의 합 전체)
		int i = 0;
		Iterator<String> test = name1.iterator();
		while(test.hasNext()) { // name1의 데이터를 hab에 저장
			hab.add(test.next());
			i++;
		}
		test = name2.iterator();
		while(test.hasNext()) { // name2의 데이터를 hab에 있는지를 비교하여 없으면 저장
			String name=test.next();
			if(hab.contains(name)) // hab내부에 name 값이 있는가??
				continue;
			hab.add(name);
			i++;
		}
		System.out.println("합집합 : " + hab);
		
		// 교집합 (중복인 것만)
		test = name2.iterator();
		while(test.hasNext()) {
			String name = test.next();
			if(name1.contains(name))
				gyo.add(name);
		}
		System.out.println("교집합 : " + gyo);
		
		// 차집합
		test = name2.iterator();
		while(test.hasNext()) { // name2와 name1의 차집합, name2에만 있는 이름 찾기
			String name = test.next();
			if(name1.contains(name))
				continue;
			cha.add(name);
		}
		System.out.println("차집합 : " + cha);
		*/
		// 출력
//		for(venture v : list) {
//			System.out.println("번호 : " + v.getNum()+"\n회사이름 : "+v.getCompany()+"\n회사주소 : "+v.getAddr()+
//					"\n사업종류 : "+v.getCategory()+"\n기술종류 : "+v.getBusiness_name()+"\n프로덕트 : "+v.getProduct()+"\n");
//		}
	}
}
