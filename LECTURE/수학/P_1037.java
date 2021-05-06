package 수학;

import java.util.Scanner;

/*[1037] 약수
1. 문제 및 제약조건
:	양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 
	어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
2. 입력
:	첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 
	둘째 줄에는 N의 진짜 약수가 주어진다. 
	1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.
3. 출력
:	첫째 줄에 N을 출력한다. N은 항상 32비트 부호있는 정수로 표현할 수 있다
4. 포인트
:	N은 √N을 기준으로 약수의 양쪽 곱이 N을 의미 -> 즉 최소약수와 최대약수의 곱이 N을 의미함
*/

public class P_1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//진짜 약수의  개수
		int[] divisorArr = new int[n];//약수 배열
		
		for(int i =0; i<n; i++) {
			divisorArr[i] = sc.nextInt();//약수 입력 
		}
		
		int min = divisorArr[0], max = divisorArr[0]; //최소, 최대 약수
		
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
