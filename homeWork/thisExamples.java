class A {
	int n;
	
	void printN(A a) {
		System.out.println(a.n);
	}
}

class ThisExamples {
	public static void main(String[] args) {
		A obj1 = new A();
		obj1.n = 10;
		obj1.printN(this);
	}
}
