public class EstherTask{

	public int[] getSwapped(int[] arrays){

		for(int i = 1; i < arrays.length; i++){
	
		if(i % 2 != 0){

			int temp = arrays[i];

			arrays[i] = arrays[i-1];

			arrays[i-1] = temp;

		}

		}return arrays;

	}

}