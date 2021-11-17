package core_java_exrcise;

public class PrimeNumber {


		public static void main(String[] args) {
			int n = 50, count;
			for (int i = 1; i <= n; i++) {
				count = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				} 
				if (count == 0) {
					System.out.print(i + " ");
				}
			}

		}

	}


