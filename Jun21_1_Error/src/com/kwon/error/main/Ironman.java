package com.kwon.error.main;

public class Ironman {
	// ������ ���� ������ ������� �����
	public int divide1(int i, int j) {
		try {
			int k = i / j;
			return k;
		} catch (Exception e) {
			System.out.println("0���� ���� �� ����.");
			return 0;
		} finally {
			// exception �߻� ������ ������� ó���Ǵ� �κ�
			// return���� ���� 
			System.out.println("��");
		}

	}
	// �� �޼ҵ带 ȣ���� �ʿ��� ó���ϵ��� 
	public int divide2(int i , int j) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int k = i/j;
		return k;
		
	}
}
