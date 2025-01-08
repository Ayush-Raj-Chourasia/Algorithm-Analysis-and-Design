package AD_1.Lab_9;

import java.util.ArrayList;
public class Javacollection {

	public static void main(String[] args) {
		ArrayList <Integer> list= new ArrayList <Integer> ();
		list.add(10);
		list.add(89);
		list.add(24);
		System.out.println(list);
		int element =list.get(0);
		System.out.println(element);
		list.add(1,34);
	}

}