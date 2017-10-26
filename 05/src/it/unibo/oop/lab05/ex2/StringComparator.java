package it.unibo.oop.lab05.ex2;

import java.util.Comparator;



public class StringComparator implements Comparator<String> {

	public int compare(final String arg0, final String arg1) {
		if (Integer.parseInt(arg0) > Integer.parseInt(arg1)) {
			return 1;
		} else if (Integer.parseInt(arg0) < Integer.parseInt(arg1)) {
			return -1;
		} else {
			return 0;
		}
	}

}
