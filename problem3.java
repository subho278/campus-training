public final class problem3 {
	public static void main(String[] args) {
		System.out.println(new problem3().run());
	}
	public String run() {
		long N = 600851475143L;
		double n = (double)N;
		while (true) {
			double p = smallestFactor(n);
			if (p < n)
				n /= p;
			else
				return Double.toString(n);
		}
	}

	private static double smallestFactor(double n) {
		
		for (double i = 2, end = Math.sqrt(n); i <= end; i++) {
			if (n % i == 0)
				return i;
		}
		return n; // Prime
	}
}
