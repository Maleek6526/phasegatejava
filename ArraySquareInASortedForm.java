import java.util.Arrays;
public class ArraySquareInASortedForm{

	public static void main(String[] args){

		int[] elements = {2, 1, 4, 3, 5, 9};

		System.out.println("The Square of the elements are " + Arrays.toString(getSquareOfElement(elements)));

		int[] sort = getSortNumbers(elements);
	
		System.out.print("The sorted form of the element is "+ Arrays.toString(sort));
	}

public static int[] getSquareOfElement(int[] numbers){

	int[] arr = new int[numbers.length];

	for(int index = 0; index < numbers.length; index++){

		arr[index] = numbers[index] * numbers[index];
	}

	return arr;
	}


 public static int[] getSortNumbers(int [] array){

	

	for(int index = 0; index < array.length; index++){
		
		for(int count = 1; count < array.length; count++){

 			if(array[count - 1] > array[count]){

				int number =  array[count - 1];

				array[count - 1] = array[count];

				array[count] = number;
			}
		}
	}return array;
	
   }


}