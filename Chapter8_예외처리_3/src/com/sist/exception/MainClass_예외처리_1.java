package com.sist.exception;
/*
 *    1.try~catch
 *    2.throws
 *      ------
 *      예외선언(예외회피) =>시스템에 예외를 알려준다
 *      형식)
 *           public void display() throws NumberFormatException,RuntimeException,Exception
 *                                        ------------------------------------------------
 *                                                 catch:순서,throws:순서가 없다
 *           =>라이브러리는 예상된 예외를 throws를 이용해서 등록
 *              ==>                 -------------------처리하면서 사용을 해야 된다
 *           =>사용법 2가지
 *           1) try~catch:직접 처리하는 방법
 *           2) throws:선언만 처리 
 *           
 *           public void display() throws Exception =>display를 호출 할 때는 Exception을 처리한 후에 한다
 *           {
 *           }
 *           
 *           public void aaa()
 *           {
 *              display(); //오류코드
 *           }
 *           
 *           1)
 *              public void aaa()
 *              {
 *                 try
 *                 {
 *                    display();
 *                 }catch(Exception e){}
 *              }
 *              
 *           2)  
 *              public void aaa() throws Exception
 *              {
 *                 display();
 *              }
 *         ----------------------------------------------
 *         public void aaa() throws NumberFormatException,ArrayIndexOutOfBoundsException
 *         {
 *         }
 *         
 *         main()
 *         {
 *            aaa(); //정상 수행
 *         }   
 *          
 *         //Exception /Throwable
 *           => 모든 예외를 처리할 수 있음
 *          
 *          void aaa() throws IOException,ClassNotFoundException
 *          
 *          void bbb() throws IOException,ClassNotFoundException
 *          void bbb() throws Exception =>확대
 *          void bbb() throws Throwable
 *          
 *          void aaa() throws Throwable =>축소
 *          
 *          void bbb() throws Exception(X)
 *          
 *                   Throwable
 *                       |
 *                ---------------
 *                |             |
 *              Error       Exception
 *                             RuntimeException =>예외처리를 생략할 수 있다
 *                                   |
 *                             NumberFormatException,NullPointerException
 */
public class MainClass_예외처리_1 {
	//CheckException =>컴파일러가 예외처리 되었는지 확인 =>반드시 예외처리 해서 사용
	public static void aaa() throws Exception
	{
		
	}
	//UnCheckException =>컴파일러가 예외처리를 확인하지 않는다 =>예외처리를 생략할 수 있다
	public static void bbb() throws NumberFormatException,NullPointerException
	{
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*bbb();
		try
		{
		aaa();
		}catch(Exception ex) {}*/
		aaa();
	}

}
