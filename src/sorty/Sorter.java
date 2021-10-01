package sorty;

import java.util.ArrayList;
import java.util.List;

public class Sorter<T> {
	
	private int sortChoice;
	private List<Integer> input;
	private List<Integer> output;
	
	public Sorter(int sortChoice, List<Integer> input) {
		this.sortChoice = sortChoice;
		this.input = input;
		this.output = new ArrayList<Integer>();
		output.addAll(input);
		
		bubbleSort();
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
