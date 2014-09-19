package careercup.com.charpter9;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public static int fibonacci(int i) {
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}
		return fibonacci(i - 1) + fibonacci(i - 2);
	}
	
	// with cache
	private static List<Integer> fibCache = new ArrayList<Integer>();
	public static int fibnoacii1(int i) {
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}
		if (fibCache.get(i) != 0) {
			return fibCache.get(i);
		}
		fibCache.add(i, fibonacci(i - 1) + fibonacci(i - 2));
		return fibCache.get(i);
	}
	
	// iterative
	public static int fib(int n) {
		int pre1 = 0;
		int pre2 = 1;
		for (int i = 0; i < n; i++) {
			int temp = pre1;
			pre1 = pre2;
			pre2 = pre1 + temp;
		}
		return pre1;
	}
	
	public static void main (String[] args) {
		System.out.println(fib(12));
	}

}