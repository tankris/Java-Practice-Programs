class shapeOverloading {
	public static void area(int side) {
		System.out.println("Area of a square is " + (side * side));
	}

	public static void area(int length, int breadth) {
		System.out.println("Area of a rectangle is " + (length * breadth));
	}

	public static void area(float radius) {
		System.out.println("Area of a circle is " + (Math.PI * radius * radius));
	}

	public static void main(String[] args) {
		//shapeOverloading obj = new shapeOverloading();

		area(10);
		area(10.0f);
		area(10,10);
	}
}
