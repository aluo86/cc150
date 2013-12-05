package careercup.com.charpter1;

/* Implement string concatenation with String join, the time complexity is n^2
 * StringBuilder is the right one to use because it is faster although it is not thread safe. But in
 * reality we don't need threadsafe for string concatenation and StringBuffer is not really threadsafe 
 * as it claims. 
 */

public class StringConcatenation {
	public static String joinWords(String[] words) {
		String sentence = "";
		for (String w : words) {
			sentence = sentence + w;
		}
		String result = "Done";
		return result;
	}

	public static String joinWordsWithStringBuffer(String[] words) {
		StringBuffer sentence = new StringBuffer();
		String result = "Done";
		for (String w : words) {
			sentence.append(w);
		}
		return result;
	}

	public static String joinWordsWithStringBuilder(String[] words) {
		StringBuilder sentence = new StringBuilder();
		String result = "Done";
		for (String w : words) {
			sentence.append(w);
		}
		return result;
	}

	public static void main(String[] args) {
		String testWord1 = "hello ";
		String testWord2 = "our ";
		String testWord3 = "world";
		long times = 88888;

		String[] words = new String[(int) times];

		for (long i = 0; i < times; i++) {
			long index = i % 3;
			switch ((int) index) {
			case 0:
				words[(int) i] = testWord1;
				break;
			case 1:
				words[(int) i] = testWord2;
				break;
			case 2:
				words[(int) i] = testWord3;
				break;
			}
		}

		//System.out.println(Arrays.toString(words));

		long startTime = System.currentTimeMillis();
		joinWords(words);
		long finishTime = System.currentTimeMillis();
		System.out.println("\nThat took: " + (finishTime - startTime) + " ms");

		long startTime1 = System.currentTimeMillis();
		joinWordsWithStringBuffer(words);
		long finishTime1 = System.currentTimeMillis();
		System.out
				.println("\nThat took: " + (finishTime1 - startTime1) + " ms");

		long startTime2 = System.currentTimeMillis();
		joinWordsWithStringBuffer(words);
		long finishTime2 = System.currentTimeMillis();
		System.out
				.println("\nThat took: " + (finishTime2 - startTime2) + " ms");
	}
}
