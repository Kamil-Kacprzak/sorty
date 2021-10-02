package sorty;

import java.util.Scanner;

import sorty.ui.Menu;

class Main {

	private final static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		Menu menu = new Menu(in);
		String exitStr;
		//Main, infinity loop of a program, which shows console menu,
		//until user provide exit character (Y)
		do {
			menu.open();
			System.out.println("Would you like to exit now? Y/N");
			exitStr = in.nextLine();
			if(exitStr.toUpperCase().equals("Y")) {
				break;
			}
		}while(true);
		
		in.close();
	}
}
