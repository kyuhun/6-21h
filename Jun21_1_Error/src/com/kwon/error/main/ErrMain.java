package com.kwon.error.main;

import java.util.Scanner;

public class ErrMain {
	public static void main(String[] args) {
		// �ܼ��Է�
		/*// �ҽ� => ������ => ����
		 * error: �ڹ� ������ ���� �ʰ� �ڵ带 �Ἥ ����� �ٲ��� ���ϴ� ����
		  			������ å��
		 * warning : ���࿡�� ���� ����. ���� ������ ǥ��.
		 * exception : ���� �� �߻��� �� �ִ� ����. 
		 * 	 ����� å��
		 *   �����ڰ� exception�� �߻����� �� ������ �� �ְ� ó���� �س��� 
		 * */
		
		/* exception ó��
		 * ����
		 * �н�
		 * 
		 * 
		 * */
		
		//���̾�� 
		// ������
		int x=0,y=0;
		int [] ar = {10,20,30};
		
		Scanner scanner = new Scanner(System.in);
		Ironman i = new Ironman();
		System.out.println(i.divide1(10, 0));
		try {
			System.out.println(i.divide2(10, 0));
		} catch (Exception e) {
			System.out.println("0���� ������ ����.");
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
			
			System.out.print("���� ���� ��ȣ :");
			int no = scanner.nextInt();
			System.out.println(ar[no]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ ����.");
		} finally {
			System.out.println("exception  �߻� ������ ������� ó���Ǵ� �κ�");
		}
		*/
		/*try {
			System.out.println("x+y = "+(x+y));
			System.out.println("x-y ="+(x-y));
			System.out.println("x*y =" +(x*y));
			System.out.println("x/y = "+(x/y));
			
			System.out.print("���� ���� ��ȣ :");
			int no = scanner.nextInt();
			System.out.println(ar[no]);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ����.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �׷��Ŵ� ����");
		}*/
		
		scanner.close();
	}
}
