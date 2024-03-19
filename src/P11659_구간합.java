import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11659_구간합 {
	public static void main(String[] args) throws IOException {
		//합배열 구하는 방법
		// int[] a = {5,4,3,2,1}
		// int[] s = new int[a.length] 합배열은 첫째항은 기본배열 첫째항과 같음 s[0] = a[0]
		// s[1] = s[0] + a[1] --> s[i] = s[i-1] + a[i];

		//구간합 구하는 방법
		// s = {5,9,12,14,15}
		// a[1] ~ a[3] -> s[3] - s[1]
		// a[i] ~ a[j] -> s[j] ~ s[i-1]

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//데이터가 10만개인경우 숫자형으로 받기 힘들어서 StringTokenizer 사용
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 갯수
		int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 질의 갯수
		long[] s = new long[suNo+1]; //배열은 0부터 시작해서 +1 로 1부터 시작하도록!
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 1; i <= suNo; i++) {
			s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}

		for (int q = 0; q < quizNo; q++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(s[j] - s[i-1]);
		}
	}
}
