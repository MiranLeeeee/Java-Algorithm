package ����;

import java.util.Scanner;

/*[10430] ������
1. ���� �� ��������
:	(A+B)%C�� ((A%C) + (B%C))%C �� ������?
	(A��B)%C�� ((A%C) �� (B%C))%C �� ������?
	�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
2. �Է�
:	ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
3. ���
:	ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
*/

public class P_10430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		sc.close();
	}

}
