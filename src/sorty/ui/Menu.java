package sorty.ui;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import sorty.logic.Sorter;
import sorty.ui.MenuOptions.InputOptions;
import sorty.ui.MenuOptions.SortOptions;

public class Menu {
	
	private Scanner in;
	
	public Menu(Scanner in) {
		this.in = in;
	}
	
	public void open() {
		SortOptions sortChoice = chooseSortOption();
		InputOptions inputChoice = chooseInputOption();
		List<Integer> input = getInput(inputChoice);
		
		Sorter<Integer> srt = new Sorter<Integer>(sortChoice, input);
		srt.showResult();
	}
	
	private SortOptions chooseSortOption() {
		System.out.println("Choose algorithm:");
		MenuOptions.SORT.showOptions();
		int input = in.nextInt();
		in.nextLine();
		return MenuOptions.SortOptions.valueOf(input);
	}
	
	private InputOptions chooseInputOption() {
		System.out.println("What data input would you like to use:");
		MenuOptions.INPUT.showOptions();
		int dataChoice = in.nextInt();
		in.nextLine();		
		return MenuOptions.InputOptions.valueOf(dataChoice);
	}

	private List<Integer> getInput(InputOptions inOpt) {
		List<Integer> result = new ArrayList<Integer>();
		//TODO: Add different input options
		switch(inOpt) {
		case FILE:
			break;
		case MANUAL:
			break;
		case RANDOM_DATA:
			break;
		default:
			result.addAll(Arrays.asList(1,7,34,3,12,43,5));
		}		
		return result;
	}

}
