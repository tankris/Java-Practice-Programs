class Parent {
	Parent() {
		System.out.println("This is the parent");
	}

	public void parentMethod() {
		System.out.println("Hooray! Parent method");
	}
}

class Child extends Parent {
	Child() {
		super();
		System.out.println("This is the child");
	}

	public void parentMethod() {
		super.parentMethod();
	}

	public static void main(String[] args) {
		Parent obj = new Child();

		obj.parentMethod();
	}
}
