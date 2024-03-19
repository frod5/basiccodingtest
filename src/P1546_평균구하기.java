import java.util.Scanner;

public class P1546_평균구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		// for(int i=0; i < a.length; i++) {
		// 	a[i] = sc.nextInt();
		// }

		long max = 0;
		long sum = 0;

		for (int i : a) {
			int temp = sc.nextInt();
			if(max < temp) max = temp;
			sum += temp;
		}

		//포인트는 평균을 구할 수 있는 식을 간소화한 식으로 먼저 바꾼후 로직짜기!
		System.out.println(sum * 100.0 / max / n );
	}
}
