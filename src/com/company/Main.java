package com.company;

public class Main {

    public static void main(String[] args) throws SizeException {
	ArrayList2 arraylist = new ArrayList2();

	arraylist.add("ok?");
	arraylist.add(123);
	arraylist.add("ok?");
	arraylist.add(123);
	arraylist.add("SAMURAI");
	arraylist.add(123);
	arraylist.add("matvei");
	arraylist.add("andrey");
	arraylist.add("igor");
	arraylist.add("senya");
	arraylist.add("fgg");

	System.out.println(arraylist.get(3));
	arraylist.remove(3);
	arraylist.set(7, 320);

	System.out.println(arraylist.get(3));

	arraylist.clear();
	arraylist.size();
	//arraylist.set(1, 10);     Will cause an error

    }
}
