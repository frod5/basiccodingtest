import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {

	static int[] myArr;
	static int[] checkArr;
	static int checkSecret = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int s = Integer.parseInt(stringTokenizer.nextToken()); // 문자열의 길이
		int p = Integer.parseInt(stringTokenizer.nextToken()); // 부분문자열의 길이
		int result = 0;

		checkArr = new int[4];
		myArr = new int[4];
		char[] a = new char[s];
		checkSecret = 0;

		a = bufferedReader.readLine().toCharArray();

		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
			if(checkArr[i] == 0) checkSecret++;
		}

		for (int i=0; i<p; i++) { //부분문자열 처음 받을 때 세팅
			add(a[i]);
		}

		if(checkSecret == 4) result++;

		//슬라이딩윈도우
		for (int i = p; i < s ; i++) {
			int j = i-p;
			add(a[i]);
			remove(a[j]);
		}

		if(checkSecret == 4) result++;
		System.out.println(result);
		bufferedReader.close();
	}

	private static void add(char c) {
		switch (c) {
			case 'A' -> {
				myArr[0] ++;
				if(myArr[0] == checkArr[0]) checkSecret++;
			}
			case 'C' -> {
				myArr[1] ++;
				if(myArr[1] == checkArr[1]) checkSecret++;
			}
			case 'G' -> {
				myArr[2] ++;
				if(myArr[2] == checkArr[2]) checkSecret++;
			}
			case 'T' -> {
				myArr[3] ++;
				if(myArr[3] == checkArr[3]) checkSecret++;
			}
		}
	}

	private static void remove(char c) {
		switch (c) {
			case 'A' -> {
				if(myArr[0] == checkArr[0]) checkSecret--;
				myArr[0] --;
			}
			case 'C' -> {
				if(myArr[1] == checkArr[1]) checkSecret--;
				myArr[1] --;
			}
			case 'G' -> {
				if(myArr[2] == checkArr[2]) checkSecret--;
				myArr[2] --;
			}
			case 'T' -> {
				if(myArr[3] == checkArr[3]) checkSecret--;
				myArr[3] --;
			}
		}
	}
}
