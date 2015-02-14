public final class problem3 {
	public static void main(String[] args) {
		System.out.println(new problem3().run());
	}
	public String run() {
		long n = 600851475143L;
		while (true) {
			long p = smallestFactor(n);
			if (p < n)
				n /= p;
			else
				return Long.toString(n);
		}
	}

	private static long smallestFactor(long n) {
		for (long i = 2, end = Library.sqrt(n); i <= end; i++) {
			if (n % i == 0)
				return i;
		}
		return n; // Prime
	}
}
