package com.sist.collection;
/*
 *   컬렉션 프레임워크
 *   -------------데이터를 모아서 관리하기 쉬운 라이브러리 제작(클래스의 모음)
 *                                        -------표준화
 *                Collection
 *                    |
 *           ----------------------
 *           |        |           |
 *         List      Set         Map
 *         
 *      ===============================
 *      요구사항 
 *         Java 가능,Oracle 가능,JSP 가능
 *         Spring 가능 ===================필수
 *     =================================
 *      1)List
 *        특징)
 *             =순서를 가지고 있다(인덱스)
 *             =중복 데이터를 허용
 *             =데이터베이스에서 주로 사용
 *             =구현된 클래스
 *           ***ArrayList
 *              데이터베이스에 있는 데이터 모아서 브라우저에 전송
 *              Vector
 *              동기화(네트워크에서 주로 사용) =>서버 개발자
 *              LinkedList
 *              C언어 호환      
 *              Stack
 *              이론(LIFO) =>메모리 구조
 *              Queue
 *              (FIFO) =>네트워크,운영체제 스케줄러
 *      2)Set
 *        특징)
 *            =순서가 없다
 *            =데이터 중복을 허용하지 않는다
 *            =Map의 데이터 읽기,데이터의 중복을 제거할 때 주로 사용
 *            =TreeSet/**HashSet
 *             -------검색
 *      3)Map
 *        특징) 
 *            =Key,Value으로 만들어진다(두개를 동시에 저장)
 *              =>Key는 중복이 불가,Value는 중복이 가능 
 *              =>Map<Key,Value>
 *            =사용처(일반 스프링,마이바티스 =>Map) =>id,value
 *                   --------클래스 등록(스프링 =>클래스 관리)
 *            =HashTable/HashMap(HashTble의 단점 보완) =>주로 사용
 *      ----------------------------------------------------------11장
 *      ArrayList/HashSet/HashMap
 *      -------------------------
 *      4)기타:Properties(파일처리=>데이터베이스(유저,PWD) =>Map
 *        id=aaa
 *        pwd=1234
 *            =>스프링에서 주로 사용(유효성 검사)
 *            =>마이바티스(데이터베이스 정보 저장)
 *     -------------------------------------------------------------
 *     12장 =>컬렉션 프레임워크를 쉽게 사용이 가능하게 제작
 *            ----------------------------------Object(형변환=>형변환 없이 사용 가능하게 만듦=>제네릭스)
 *            클래스<String>
 *         ***=어노테이션:스프링 기반
 *            =열거형
 *            
 *      1)주요 메소드(메모리에서 데이터를 제어=>추가,수정,삭제,검색)
 *        --------
 *        ArrayList(단점:메모리가 크다,메모리 누수 현상,가장 간단,속도)
 *        추가:add(Object o)
 *        수정:set(int index,Object o)
 *        삭제:remove(int index)
 *        검색:get(int index)
 *        개수:size()
 *        전체삭제:clear()
 *        확인:isEmpty()
 *        ------------------------>Vector,LinkedList
 *        HashSet:중복 데이터 제거
 *           add(),remove,clear,isEmpty
 *        HashMap:
 *           추가:push(key,값)
 *           값 읽기:get(key)
 *       ------------------------------------------------------------
 *       =>removeAll()=NINUS,addAll()=UNION,UNIONALL,retainAll()=INTERSECT =>JOIN
 *         ----------  -------  -----------
 *           차집합      합집합       교집합
 */
//Vector =>기존의 개발된 호환 =>보완(ArrayList)
import java.util.*;
public class MainClass_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vector생성
		Vector list=new Vector();
		//List인터페이스 구현,Vector만 가지고 있는 메소드
		/*
		 *   자료구조(데이터 관리) =>메모리
		 *     추가:add() ===============>addElement()
		 *     수정:set() ===============>set()
		 *     삭제:remove() ============>remove(),removeAll(),clear()
		 *     읽기:get() ===============>elementAt()
		 *     개수:size()
		 */
		//추가
		list.addElement("신진호"); //index =>0
		list.addElement("송상은"); //1
		list.addElement("한도희"); //2
		list.addElement("장혜린"); //3
		list.addElement("채솔하"); //4
		System.out.println("======일반for=====");
		//출력
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.elementAt(i);
			System.out.println(name);
		}
		System.out.println("======람다식======");
		//출력2
		list.forEach((name)->System.out.println(name));
		System.out.println("=====forEach====");
		//출력3
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		//ArrayList변경
		//방법1
		ArrayList list2=new ArrayList(list);
		System.out.println("===Vecotor=>ArrayList===");
		System.out.println(list2);
		//방법2
		ArrayList list3=new ArrayList();
		list3.addAll(list);
		System.out.println("===2.Vector=>ArrayList로 변경");
		System.out.println(list3);
		
		System.out.println("====Vector에서 데이터 수정====");
		list.setElementAt("김도영",3);
		/*
		 *   신진호(0)
		 *   송상은(1)
		 *   한도희(2)
		 *   장혜린(3) =>김도영
		 *   채솔하(4)
		 */
		System.out.println(list);
		
		System.out.println("====Vector에서 데이터 삭제====");
		list.removeElementAt(1);
		/*
		 *   신진호(0)
		 *   송상은(1) =>삭제
		 *   한도희(2)
		 *   김도영(3) 
		 *   채솔하(4)
		 *   
		 *   
		 *   신진호(0)
		 *   한도희(1)
		 *   김도영(2)
		 *   채솔하(3)
		 */
		 System.out.println(list);
		 System.out.println("====Vector에서 데이터 전체 삭제====");
		 list.removeAllElements();
		 System.out.println(list);
	}

}
