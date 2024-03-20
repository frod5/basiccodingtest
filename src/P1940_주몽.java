import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		int m = Integer.parseInt(bufferedReader.readLine());
		int[] arr = new int[n];
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stringTokenizer.nextToken());
		}

		//정렬
		Arrays.sort(arr);

		int count = 0;
		int startIndex = 0;
		int endIndex = n-1;

		while (startIndex < endIndex) {
			if(arr[startIndex] + arr[endIndex] < m) {
				startIndex++;
			} else if (arr[startIndex] + arr[endIndex] > m) {
				endIndex--;
			} else {
				count++;
				startIndex++;
				endIndex--;
			}
		}

		System.out.println("count = " + count);
	}
}
