package ����;

import java.util.Scanner;

/*[1037] ���
1. ���� �� ��������
:	��� A�� N�� ��¥ ����� �Ƿ���, N�� A�� ����̰�, A�� 1�� N�� �ƴϾ�� �Ѵ�. 
	� �� N�� ��¥ ����� ��� �־��� ��, N�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
2. �Է�
:	ù° �ٿ� N�� ��¥ ����� ������ �־�����. �� ������ 50���� �۰ų� ���� �ڿ����̴�. 
	��° �ٿ��� N�� ��¥ ����� �־�����. 
	1,000,000���� �۰ų� ����, 2���� ũ�ų� ���� �ڿ����̰�, �ߺ����� �ʴ´�.
3. ���
:	ù° �ٿ� N�� ����Ѵ�. N�� �׻� 32��Ʈ ��ȣ�ִ� ������ ǥ���� �� �ִ�
4. ����Ʈ
:	N�� ��N�� �������� ����� ���� ���� N�� �ǹ� -> �� �ּҾ���� �ִ����� ���� N�� �ǹ���
*/

public class P_1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//��¥ �����  ����
		int[] divisorArr = new int[n];//��� �迭
		
		for(int i =0; i<n; i++) {
			divisorArr[i] = sc.nextInt();//��� �Է� 
		}
		
		int min = divisorArr[0], max = divisorArr[0]; //�ּ�, �ִ� ���
		
		for(int j = 1; j<n; j++) {
			if(min > divisorArr[j]) {
				min = divisorArr[j];
			}
			if(max < divisorArr[j]) {
				max = divisorArr[j];
			}
		}
		
		System.out.println("N: " + min*max);

	}

}
