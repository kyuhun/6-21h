package com.kwon.error.main;

import java.util.Scanner;

public class ErrMain {
	public static void main(String[] args) {
		// 콘솔입력
		/*// 소스 => 컴파일 => 실행
		 * error: 자바 문법에 맞지 않게 코드를 써서 기계어로 바꾸지 못하는 상태
		  			개발자 책임
		 * warning : 실행에는 지장 없음. 정리 차원의 표시.
		 * exception : 실행 때 발생할 수 있는 문제. 
		 * 	 사용자 책임
		 *   개발자가 exception에 발생했을 때 대응할 수 있게 처리를 해놔야 
		 * */
		
		/* exception 처리
		 * 직접
		 * 패스
		 * 
		 * 
		 * */
		
		//아이언맨 
		// 나누기
		int x=0,y=0;
		int [] ar = {10,20,30};
		
		Scanner scanner = new Scanner(System.in);
		Ironman i = new Ironman();
		System.out.println(i.divide1(10, 0));
		try {
			System.out.println(i.divide2(10, 0));
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없음.");
		}
		/*System.out.print("x :");
		x= scanner.nextInt();
		System.out.println("");
		System.out.print("y :");
		y= scanner.nextInt();
		System.out.println("");
		
		try {
			System.out.println("x+y = "+(x+y));
			System.out.println("x-y ="+(x-y));
			System.out.println("x*y =" +(x*y));
			System.out.println("x/y = "+(x/y));
			
			System.out.print("보고 싶은 번호 :");
			int no = scanner.nextInt();
			System.out.println(ar[no]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("문제가 있음.");
		} finally {
			System.out.println("exception  발생 유무와 관계없이 처리되는 부분");
		}
		*/
		/*try {
			System.out.println("x+y = "+(x+y));
			System.out.println("x-y ="+(x-y));
			System.out.println("x*y =" +(x*y));
			System.out.println("x/y = "+(x/y));
			
			System.out.print("보고 싶은 번호 :");
			int no = scanner.nextInt();
			System.out.println(ar[no]);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 못함.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열에 그런거는 없음");
		}*/
		
		scanner.close();
	}
}
