package com.sist.collection;
import java.util.*;
public class MainClass_Set_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set1=new HashSet();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		set1.add("E");
		set1.add("F");
		set1.add("G");
		
		Set set2=new HashSet();
		set2.add("L");
		set2.add("M");
		set2.add("N");
		set2.add("D");
		set2.add("E");
		set2.add("O");
		set2.add("P");
		
		System.out.println("====set1원본=====");
		System.out.println(set1);
		System.out.println("=====set2원본====");
		System.out.println(set2);
		
		System.out.println("======교집합======");
		//set1.retainAll(set2);
		//System.out.println("set1 교집합 set2="+set1);
		
		System.out.println("======차집합======");
		//set1.removeAll(set2);
		//System.out.println("set1-set2:"+set1);
		
		System.out.println("=====합집합=====");
		set1.addAll(set2);
		System.out.println("set1+set2"+set1);
		/*Iterator it=set2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
	}

}
