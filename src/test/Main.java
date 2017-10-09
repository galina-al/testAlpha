package test;


public class Main {

	public static void main(String[] args){
		int[] arr = {9, 8, 5, 4, 3, 1, 0};
		System.out.println(bsearch(arr, 5));
	}

	public static int bsearch(int arr[], int X){
		int i;
		for (i = 0; i < arr.length; i++){
			if (arr[i] < X){
				break;
			}
		}
		return i;
	}
}
