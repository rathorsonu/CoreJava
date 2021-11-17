package core_java_exrcise;


	public class HarmonicSeries {
		public static void main(String[] args) {
			int number = 5;
			double result = 0.0;
			while (number > 0) {

				result = result + (double) 1 / number;

				number--;
				System.out.print(result + ",");

			}
		}

	}


