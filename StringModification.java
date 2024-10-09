import java.util.Scanner;

public class StringModification{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String userInput = scanner.nextLine();
		System.out.println(convertToTitleCase(userInput));
		System.out.print(isSecoondOrderIsogram(userInput));
	}

	public static String convertToTitleCase(String sentence){

		char[] seperation = sentence.toCharArray();
		String sentenceSetUp = " ";

		seperation[0] = Character.toUpperCase(seperation[0]);

		for(int index = 0; index < seperation.length; index++){
			if (seperation[index] == ' ') {
				char firstCharacter = seperation[index+1];
				seperation[index+1] = Character.toUpperCase(firstCharacter);
			}
		}

		for(int index = 0; index < seperation.length; index++){

			sentenceSetUp += seperation[index];

		}
		return sentenceSetUp;
	}

public static boolean isSecoondOrderIsogram(String phrase){
	boolean isPhraseWithOddNumbers = phrase.length() % 2 != 0;
	if(isPhraseWithOddNumbers) return false;

	String uniqueCharactersOfPhrase = "";
	for(int index = 0; index < phrase.length(); index++){

		char currentCharacter = phrase.charAt(index);
		boolean isUniqueCharacterOfPhrase = !uniqueCharactersOfPhrase.contains(""+currentCharacter);

		if(isUniqueCharacterOfPhrase) uniqueCharactersOfPhrase += currentCharacter;	
	}

	int numberOfUniqueCharacters = uniqueCharactersOfPhrase.length();

	int[] tally = new int[numberOfUniqueCharacters];

	for(int index = 0; index < numberOfUniqueCharacters; index++){
		char currentCharacter = uniqueCharactersOfPhrase.charAt(index);
		for(int counter = 0; counter < phrase.length(); counter++){

			if(currentCharacter == phrase.charAt(counter)) tally[index] = tally[index]+1;

		}

	}
	
	for(int index = 0; index < tally.length; index++){

		if(tally[index] != 2) return false;

	}return true; 

}
}