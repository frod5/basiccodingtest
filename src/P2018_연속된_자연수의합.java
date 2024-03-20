import java.util.Scanner;

public class P2018_연속된_자연수의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int startIndex = 1;
		int endIndex = 1;
		int sum = 1;

		while (endIndex != n) {
			if(sum == n) { //같은거 찾아서 count++, endIndex 증가 sum 업데이트(+)
				count++;
				endIndex++;
				sum += endIndex;
			} else if (sum > n) { // sum이 더 큰 경우 sum 업데이트(-), startIndex ++
				sum -= startIndex;
				startIndex++;
			} else { // sum < n -> endIndex ++, sum 업데이트(+)
				endIndex++;
				sum += endIndex;
			}
		}
		System.out.println("count = " + count);
	}
}
