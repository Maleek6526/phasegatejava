import java.util.Scanner;
import java.util.Arrays;

public class StringReversal{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String userInput = scanner.nextLine();

		getReverse(userInput);

	}

public static void getReverse(String sentence){

	String arrays[] = sentence.split(" ");

	System.out.print(Arrays.toString(arrays));

}

}
