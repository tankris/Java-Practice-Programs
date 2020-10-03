import java.util.ArrayList;

class arrayList {
	ArrayList<Integer> arrList = new ArrayList<>();

	public arrayList() {
		//Ensures that arrList will hold 5 elements
		arrList.ensureCapacity(5);
	}

	//Returns the number of items in the Array List
	public int size() {
		return arrList.size();
	}

	//Returns boolean result upon checking if arrList is empty
	public boolean is_empty() {
		return arrList.isEmpty();
	}

	//Returns item at given index unless index ot of bounds
	public Integer at(int index) {
		try {
			return arrList.get(index);
		}

		catch(IndexOutOfBoundsException ex) {
			//Return Integer's min value in case the index is out of
			//bounds
			return Integer.MIN_VALUE;
		}
	}

	public static void main(String[] args) {
		arrayList al = new arrayList();

		//Addings 10 values to the Array List
		for(int i = 0; i < 10; i++) {
			al.arrList.add(i);
		}
	}
}
