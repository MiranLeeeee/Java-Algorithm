package ����;
import java.util.Scanner;

/*[4375] 1
1. ���� �� ��������
:	2�� 5�� ������ �������� �ʴ� ���� n(1 �� n �� 10000)�� �־����� ��, 1�θ� �̷���� n�� ����� ã�� ���α׷��� �ۼ��Ͻÿ�.
2. �Է�
:	�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, n�� �־�����.
3. ���
:	1�� �̷���� n�� ��� �� ���� ���� ���� �ڸ����� ����Ѵ�.

*/

public class P_4375 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			int num = 0;
			for(int i=1;; i++) {
				num = num*10+1;
				num%=n;
				if(num==0) {
					System.out.printf("%d",i);
					break;
				}
			}
		}
		
	}

}
