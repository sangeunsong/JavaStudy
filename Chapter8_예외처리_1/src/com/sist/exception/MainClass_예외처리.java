package com.sist.exception;
/*
 *   오작동/비정상 종료 =>에러
 *   --------------
 *   에러
 *   ---
 *     1)수정이 불가능 에러 
 *     2)수정 에러 ========================>예외처리
 *       -------
 *       에러 =>사용자가 입력을 잘못함(유효성) 
 *                 or 계산기 ==>0으로 나눈다
 *             프로그래머 실수
 *             배열,캐스트,NULL
 *             
 *             int[] arr=new int[2];
 *             
 *             arr[2]=100; =>오류
 *             -----------------------
 *             String s;
 *             s.trim();
 *             
 *             ==>복구/회피 throws
 *                try~catch
 *     -----------------------------------------
 *     컴파일 에러:컴파일 시에 에러(문법 에러) javac
 *     런타임 에러:실행 시에 에러 java
 *     논리적 에러:실행은 되지만 프로그램 제작과 다르게 동작
 *     ------------------------------------------ 
 *     견고한 프로그램:에러 발생 시 종료하지 않고 정상 수행이 가능하게 만드는 것
 *     1)에러를 사전에 방지하는 프로그램을 고민
 *       --------------
 *       if =>고려
 *            if문으로 처리가 어려운 부분 =>예외처리
 *     2)예외처리:가벼운 에러,수정이 가능한 에러
 *              ------------------------
 *       웹:404,500,415,400
 *         ----------------
 *         404 =>파일이 없는 경우(웹 =>서버에 파일을 보여줘) =>파일명(파일명을 변경)
 *         500 =>문법에러
 *         415 =>한글변환(UTF-8)
 *         400 =>전송 데이터 =>받는 데이터의 데이터형 =>받는 데이터의 데이터형이 다른 경우
 *                "홍길동" ===>int
 *       ---------------------------------------------------------------------
 *       자바 =>Exception:NullPointException,ArrayIndexOutOfBoundsException
 *             ==>output창
 *     3)예외처리의 종류
 *       =예외 복구:예외가 발생하면 복구해서 다시 수행이 가능*****
 *         try{
 *              정상 수행문장
 *              =>에러가 발생할 수 있다
 *            }catch()
 *            {
 *               에러 발생 시 복구
 *            }
 *       =예외 회피:에러 부분을 제외하고 다음 문장으로 수행
 *          method() throws 예외처리 종류....
 *       =예외 임의 발생:테스팅 시 예외를 발생해서 견고한 프로그램인지 확인
 *         throw 예외처리;
 *       =사용자 정의 예외처리:자바에서 지원하지 않는 경우에 직접 제작
 *         class A extends Exception
 *     4)예외처리의 정의,목적
 *       정의:프로그램 실행 시 발생할 수 있는 에러에 대비한 코드를 작성한다
 *                                     --------------사전 방지
 *            회원가입: *필수입력(값이 없는 경우(null) 오라클에서 에러 발생) =>NOT NULL
 *       목적:프로그램의 비정상 종료를 방지하고 정상 상태 유지
 *     5)자바에서 지원하는 예외처리의 계층 구조
 *       Error:메모리가 부족,윈도우 작동을 안함,이클립스 문제 발생
 *       Exception:파일명이 틀리다,IP가 틀리가,웹사이트 조소가 틀리가...,SQL문장을 잘못 수행
 *                   Object
 *                     |
 *                 Throwable:예외처리하는 최상위 클래스
 *        ----------------------------------------------
 *        |                                           |
 *      Error                              Exception(수정이 가능한 에러)
 *                                                    |
 *                                        ---------------------------
 *                                       |                           |
 *                              IOException(파일)                   RuntimeException 
 *                              SQLException(데이터베이스)              |
 *                              MalformedURLException(URL,서버)     ArrayIndexOutOfBoundsException   
 *                              ClassNotFoundException(리플렉션)     NumberFormatException
 *                              InterruptedException(쓰레드)         NullPointerException
 *                                                                 ClassCastException
 *                                                                 ArithmeticException
 *                             -------------------------------     ---------------------------------
 *                             CheckException                        UnCheckException
 *                                    |                                      |
 *                             컴파일 시에 예외처리 여부를확인            예외처리 여부를 확인하지 않는다
 *                                                                  필요 시에 예외처리
 *                       
 *                   *상속을 내리는 클래스가 더 많은 에러를 받는다
 *     
 *     6)예외처리 형식
 *       ----------
 *    ***1.직접처리(예외 복구) =>프로그래머가 직접 처리를 한다
 *       2.간접처리(예외 회피=예외 떠넘기기) =>자바 시스템에 맡긴다
 *       3.예외 임의 발생(사용자가 예외처리)
 *       4.사용자 정의 예외처리
 *       
 *       1.직접처리(예외 복구):웹,데이터베이스는 CheckException
 *          1)변수  2)메소드  3)예외처리  4)SQL
 *       2.형식
 *         try
 *         {
 *            정상 수행이 가능한 소스
 *            =지금까지 코딩한 부분
 *         }catch(예외처리 종류)
 *         {
 *           에러발생 처리하는 영역 =>에러 확인 =>예상되는 예외처리 =>catch(여러번 사용이 가능)
 *         }
 *         finally
 *         {
 *            try,catch수행 상관없이 무조건 수행하는 문장
 *            에러 발생,정상 수행 상관없이 무조건 수행하는 문장이 존재
 *            ---------------------------------------------
 *            1)파일 닫기
 *            2)오라클 닫기
 *            3)서버 닫기
 *         }
 *         ***예외처리
 *         1.고민:예상되는 에러
 *         예)
 *            두개의 정수를 문자열을 받아서 정수배열에 저장 =>저장된 데이터를 나누기 하는 프로그램을 제작
 *                                    -----배열 인덱스             ----
 *                                    문자열 =>정수
 *         2.고민:예외처리의 위치
 */ 
public class MainClass_예외처리 {
   public static void main(String[] args) {
	  /* try
	   {
		   for(int i=1;i<=10;i++)
		   {
			   int r=(int)(Math.random()*3);
			   if(r==0)
			   {
				   i--;
				   continue;
			   }
			   System.out.println(i+"-"+(i/r));
		   }
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }*/
	   //try~catch는 전체  소스를 사용 =>부분적으로 사용이 가능
	   for(int i=1;i<=10;i++)
	   {
		   try
		   {
			   int r=(int)(Math.random()*3);
			   System.out.println(i+"-"+(i/r));
		   }catch(Exception ex)
		   {
			   i--;
		   }
	   }
   }
}
