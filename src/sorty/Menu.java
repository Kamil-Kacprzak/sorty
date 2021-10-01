package sorty;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
	
	private Scanner in;
	
	public Menu(Scanner in) {
		this.in = in;
	}
	
	public void open() {
		int sortChoice = chooseSortOption();
		int inputChoice = chooseInputOption();
		List<Integer> input = getInput(inputChoice);
		
		Sorter<Integer> srt = new Sorter<Integer>(sortChoice, input);
		srt.showResult();
	}
	
	private int chooseInputOption() {
		System.out.println("What data input would you like to use:\n"
				+ "1.File"+"\n"
				+ "2.Manual input"+"\n"
				+ "3.Random data"+"\n"
				+ "Otherwise default data");
		int dataChoice = in.nextInt();
		in.nextLine();		
		return dataChoice;
	}
	
	private List<Integer> getInput(int dataChoice) {
		List<Integer> result = new ArrayList<Integer>();
		//TODO: Add different input options
		switch(dataChoice) {
		case 1:
		case 2:
		case 3:
		default:
			result.addAll(Arrays.asList(1,7,34,3,12,43,5));
		}		
		return result;
	}

	private int chooseSortOption() {
		System.out.println("Choose algorithm:\n"
				+ "1.Heapsort"+"\n"
				+ "2.Insertion Sort"+"\n"
				+ "3.Selection Sort"+"\n"
				+ "4.Bubble Sort"+"\n"
				+ "5.Merge Sort"+"\n"
				+ "6.Heapsort");
		int result = in.nextInt();
		in.nextLine();
		return result;
	}
}
