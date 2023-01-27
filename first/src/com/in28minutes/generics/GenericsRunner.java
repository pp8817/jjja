package com.in28minutes.generics;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String valueString = list.get(0);
		
		System.out.println(list);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer numberInteger = list2.get(0);
		System.out.println(list2);
	}

}
