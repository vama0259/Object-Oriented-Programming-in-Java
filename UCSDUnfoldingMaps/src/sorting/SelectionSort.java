package sorting;

public class SelectionSort {
	static int[] test = {9, 67, 23,69,83,23,99,45};
	
	public static int[] sort(int[] array) {
		int low;
		for (low=0;low<array.length-1;low++) {
			int smallestIndex = low;
			for (int index = low+1;index<array.length;index++) {
				if(array[index]<array[smallestIndex]) {
					smallestIndex = index;
				}
			}
			int temp = array[low];
			array[low] = array[smallestIndex];
			array[smallestIndex] = temp;			
		}
		return array;
	}
	public static void main(String[] args) {
		int[] sorted = sort(test);
		for (int i:sorted) {
			System.out.println(i);
		}
	}
}
