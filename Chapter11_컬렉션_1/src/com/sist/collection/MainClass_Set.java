package com.sist.collection;
/*
 *      Collection
 *          |
 *         Set
 *          |
 *   ----------------
 *   |              |
 *  HashSet      TreeSet
 *  -------      -------검색(X)
 *  특징)
 *      웹 접속 =>Set(WebSocket)
 *      순서가 없다
 *      데이터 중복을 허용하지 않는다
 *      중복 데이터 제거 ===========>DISTINCT
 *  기능)
 *      추가:add()
 *      삭제:remove()
 *      복사:addAll()
 *      전체 삭제:clear()
 *      존재 여부:isEmpty()
 *      크기(데이터 개수):size()
 *      두개의 Set이 있는 경우에 같은 데이터만 모아준다(교집합):retainAll()
 *      -------------631p
 */
import java.util.*;
public class MainClass_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"신진호","송상은","한도희","김도영","장혜린","채솔하","손흥민","메시","호날두","다나카"};
		Set set=new HashSet();
		/*for(String name:names)
		{
			set.add(name); //중복을 제거 =>중복 데이터가 있는 경우 추가 할 수 없다
		}
		System.out.println(set);*/
		List list=Arrays.asList(names); //배열 =>List로 변환
		set.addAll(list); //list에 있는 데이터 전체 복사
		System.out.println(set); //set에 저장된 데이터 출력
		
		System.out.println("=====삭제=====");
		set.remove("호날두");
		System.out.println(set);
		System.out.println("=====전체 삭제=====");
		set.clear();
		if(set.isEmpty())
			System.out.println("데이터가 없습니다:"+set.size());
	}

}











