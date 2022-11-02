/*
 *   1)startsWith
 *     boolean startsWith(String fs)
 *     메소드는 사용자가 요청값=>요청처리 결과값
 *   2)endsWith
 *       boolean endWith(String s)
 *   3)equals
 *       boolean equals(String fs)==>대소문자 비교
 *   4)indexOf
 *       int indexOf(char c)    indexOf('.')
 *       int indexOf(String s)  indexOf("java")
 *   5)lastIndexOf
 *       int lastIndexOf(char c)
 *       int lastIndexOf(String s)
 *       ---             --------
 *   6)length
 *       int length()
 *       
 *       
 *       boolean login(String id,String pwd)
 *       사칙연산==>
 *       
 *   7)replace
 *       String replace(char o,char n)
 *       String replace(String s1,String s2)
 *   8)replaceAll
 *     String replaceAll(String s,String s1)
 *   9)split
 *     String[] split(String s)
 *   10)substring
 *        String substring(int s)
 *        String substring(int s,int e)=>e-1(마지막은 제외)
 *   11)toLowerCase
 *        String toLowerCase()
 *   12)toUpperCase
 *        String toUpperCase()
 *        
 */
public class 문자열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello java";
		System.out.println(s.replace("java", "JSP"));
	}

}
