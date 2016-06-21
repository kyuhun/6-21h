package com.kwon.error.main;

public class Ironman {
	// 나눗셈 성공 유무와 관계없이 ㅋ출력
	public int divide1(int i, int j) {
		try {
			int k = i / j;
			return k;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없음.");
			return 0;
		} finally {
			// exception 발생 유무와 관계없이 처리되는 부분
			// return보다 먼저 
			System.out.println("ㅋ");
		}

	}
	// 이 메소드를 호출한 쪽에서 처리하도록 
	public int divide2(int i , int j) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int k = i/j;
		return k;
		
	}
}
