public final class problem4 {
	public static void main(String[] args) {
		System.out.println(new problem4().run());
	}
	public String run() {
		int maxPalin = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i * j;
				if (Library.isPalindrome(prod) && prod > maxPalin)
					maxPalin = prod;
			}
		}
		return Integer.toString(maxPalin);
	}
}
