public final class problem6 {
	public static void main(String[] args) {
		System.out.println(new problem6().run());
	}
	private static final int N = 100;
	public String run() {
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
			sum2 += i * i;
		}
		int sum1 = sum * sum;
		return Integer.toString(sum1 - sum2);
	}
}
