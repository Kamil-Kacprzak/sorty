package sorty.logic;

import java.util.ArrayList;
import java.util.List;

import sorty.ui.MenuOptions.SortOptions;

public class Sorter<T> {
	
	private SortOptions sortChoice;
	private List<Integer> input;
	private List<Integer> output;
	
	public Sorter(SortOptions sortChoice, List<Integer> input) {
		this.sortChoice = sortChoice;
		this.input = input;
		this.output = new ArrayList<Integer>();
		output.addAll(input);
		selectSortingMethod();
	}

	private void selectSortingMethod() {
		switch(sortChoice) {
		case HEAP:
			break;
		case INSERTION:
			break;
		case SELECTION:
			break;
		case BUBBLE:
			bubbleSort();
			break;
		case MERGE:
			break;
		// Default sorting algorithm is quick sort
		default: case QUICK:
			break;
		}
		
	}

	private void bubbleSort() {
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for(int i=0; i< output.size()-1; i++) {
				if(output.get(i) > output.get(i+1)) {
					int tmp = output.get(i);
					output.set(i, output.get(i+1));
					output.set(i+1, tmp);
					sorted = false;
				}
			}
		}		
	}
	
	public void showResult() {
		showInput();
		showOutput();
	}
	
	public void showInput() {
		System.out.println("Sorting input:");
		System.out.println(input.toString());
	}
	
	public void showOutput() {
		System.out.println("Sorting result:");
		System.out.println(output.toString());
	}
	

}
