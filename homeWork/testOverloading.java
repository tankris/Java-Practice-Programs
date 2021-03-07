class TestOverloading {
	public static void main(String[] a, int b) {
		System.out.println("Heloasdasd");
	}

	public static void main(String[] args) {
		String[] a = {"a", "b"};
		main(a, 2);
		System.out.println("Hey");
	}
}
