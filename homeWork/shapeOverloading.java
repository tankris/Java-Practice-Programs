class shapeOverloading {
	public void area(int side) {
		System.out.println("Area of a square is " + (side * side));
	}

	public void area(int length, int breadth) {
		System.out.println("Area of a rectangle is " + (length * breadth));
	}

	public void area(float radius) {
		System.out.println("Area of a circle is " + (Math.PI * radius * radius));
	}

	public static void main(String[] args) {
		shapeOverloading obj = new shapeOverloading();

		obj.area(10);
		obj.area(10.0f);
		obj.area(10,10);
	}
}
