import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = input.nextLine();
		System.out.println("Enter text: ");
		String text = input.nextLine();		
		String modified = text.replace(word, word.toUpperCase());
		System.out.println(modified);
		input.close();
	}
}
