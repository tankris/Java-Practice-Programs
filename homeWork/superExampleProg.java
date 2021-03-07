class parent {
	parent(int i) {
		System.out.println("This is the parent");
	}

	public void parentMethod() {
		System.out.println("Hooray! Parent method");
	}
}

class child extends parent {
	child() {
		super(10);
		System.out.println("This is the child");
	}

	public void callParentMethod() {
		super.parentMethod();
	}

	public void callParentConstructor(int i) {
		//super();
	}

	public static void main(String[] args) {
		child obj = new child();

		//obj.callParentConstructor(10);
		obj.callParentMethod();
	}
}
