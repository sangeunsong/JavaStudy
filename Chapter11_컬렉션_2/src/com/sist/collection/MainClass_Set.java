package com.sist.collection;
/*
 *        Collection
 *            |
 *           Set
 *    ------------------interface(오버라이딩 가능)
 *            |
 *    ------------------
 *    |                |
 *   HashSet        TreeSet
 *   ----------------------
 *   특징)
 *       =순서가 없다
 *       =데이터 중복을 허용하지 않는다
 *       =중복 없는 데이터를 처리(접속자 정보,장르 읽기,상품)
 *   주요메서드)
 *       HashSet
 *        =add():추가
 *        =remove(Object o):삭제
 *        =clear():메모리 전체 삭제
 *        =isEmpty():빈 공백 여부 확인
 *        =retainAll():교집합 
 *        =size():저장 개수 
 *        =iterator():데이터 모아서 한번에 관리
 *         ----------List,Set,Properties,Map
 *       TreeSet =>검색용으로 주로 사용 =>LIKE,REGEXP_LIKE
 *        =headSet
 *        =tailSet 
 */
import java.util.*;
class Person implements Cloneable
{
	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		//System.out.println(this);
	}
	// =>toString() =>객체의 메모리 주소
	public String toString()
	{
		return name+":"+age;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class MainClass_Set {
	//객체를 저장했을 경우에는 객체의 주소로 비교 =>값이 같아도 제거되지 않을 수 있음
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add("ABC");
		set.add("ABC");
		Person p1=new Person("홍길동", 25);
		Person p2=new Person("홍길동",25);
		Person p3=p1;
		Person p4=(Person)p1.clone(); //새로운 메모리를 만든다(p1이 가지고 있는 데이터를 그대로 복사)
		//System.out.println("p1="+p1);
		//System.out.println("p2="+p2);
		set.add(p1); //1
		set.add(p2); //2
		set.add(p3); //p1과 동일 =>제거
		set.add(p4); //3
		System.out.println(set);
	}

}









