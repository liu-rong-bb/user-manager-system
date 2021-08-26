package com.liurong.usermanagersystem;

import java.util.Arrays;
import java.util.List;

public class Music{

	public final static List<String> myList = Arrays.asList("APPLE","BANANA", "ORANGE");

	public static void tune(Istrument i){
	    i.play(Note.A);
    }

    public static void main(String[] args){
	    Decterger d = new Decterger();
	    tune(d);
	    myList.contains("APPLE");

    }
}
