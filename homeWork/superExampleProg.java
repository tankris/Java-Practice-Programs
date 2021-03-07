class parent {
	parent() {
		System.out.println("This is the parent");
	}

	public void parentMethod() {
		System.out.println("Hooray! Parent method");
	}
}

class child extends parent {
	child() {
		super();
		System.out.println("This is the child");
	}

	public void parentMethod() {
		super.parentMethod();
	}

	public static void main(String[] args) {
		parent obj = new child();

		obj.parentMethod();
	}
}
