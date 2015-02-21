public final class problem4 {
	public static void main(String[] args) {
		System.out.println(new problem4().run());
	}
	public String run() {
		int maxPalin = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i * j;
				int num = prod;
				int reverse=0 , remainder;
				while (prod > 0) {
					remainder = prod % 10;
					reverse = reverse * 10 + remainder;
					prod = prod / 10;
				}
				if (num == reverse && num > maxPalin)
					maxPalin = num;
			}
		}
		return Integer.toString(maxPalin);
	}
}
