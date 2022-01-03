package sorting;

public class InsertionSort {
	public static int[] array = {2,7,13,45,99,34,1,6,73,81};
	
	private static void swap(int[] array, int swap1,int swap2) {
		int temp = array[swap1];
		array[swap1] = array[swap2];
		array[swap2] = temp;
	}
	
	private static int[] sort(int[] array) {
		int currIndex;
		for (int index =1;index<array.length;index++) {
			currIndex = index;
			while(currIndex>0) {
				if(array[currIndex]<array[currIndex-1] && currIndex != 0) {
					swap(array, currIndex, currIndex-1);
				}
				currIndex--;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		sort(array);
		for (int i:array) {
			System.out.println(i);
		}
	}
}
