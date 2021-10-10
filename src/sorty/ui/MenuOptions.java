package sorty.ui;

import java.util.EnumSet;

public enum MenuOptions {
	INPUT,SORT;
	
	public enum SortOptions {
		HEAP(1),INSERTION(2),SELECTION(3),BUBBLE(4),MERGE(5),QUICK(6),EXIT(0),DEFAULT(-1);
		
		private int choice;
		
		SortOptions(int i){
			choice = i;
		}
		
		public static SortOptions valueOf(int i) {
			for (SortOptions srtOpt : SortOptions.values()) {
				if(i == srtOpt.choice) {
					return srtOpt;
				}
			}
			return SortOptions.DEFAULT;
		}
		@Override
		public String toString() {
			if(this.choice >= 0) {
				return this.choice + ". "+ this.name();				
			}else {
				return "Otherwise " + this.name();
			}
		}
	}
	
	public enum InputOptions {
		FILE(1),MANUAL(2),RANDOM_DATA(3),EXIT(0),DEFAULT(-1);
		
		private int choice;
		
		InputOptions(int i){
			choice = i;
		}
		
		public static InputOptions valueOf(int i) {
			for (InputOptions inOpt : InputOptions.values()) {
				if(i == inOpt.choice) {
					return inOpt;
				}
			}
			return InputOptions.DEFAULT;
		}
		@Override
		public String toString() {
			if(this.choice >= 0) {
				return this.choice + ". "+ this.name();				
			}else {
				return "Otherwise " + this.name();
			}
		}
	}

	
	
	public void showOptions() {
		switch(this) {
		case INPUT:
			show(InputOptions.class);
			break;
		case SORT:
			show(SortOptions.class);
			break;
		//In case of adding values to MenuOptions, without covering it in switch statement 
		default:
			throw new UnsupportedOperationException("Missing switch implementation");
		}
		
	}
	
	private <E extends Enum<E>> void show(Class<E> e) {
		for (E opt : EnumSet.allOf(e)) {
			System.out.println(opt.toString());
		}
	}
}

