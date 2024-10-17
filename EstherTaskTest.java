import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EstherTaskTest{


	@Test
	public void swapTest(){

		//Given

		EstherTask wahala = new EstherTask();
		int[] arrays = {2, 1, 4, 3, 6, 5};


		//When

		int[] result = wahala.getSwapped(arrays);


		int[] expected = {1, 2, 3, 4, 5, 6};

		assertArrayEquals(expected, result);

	}

}
