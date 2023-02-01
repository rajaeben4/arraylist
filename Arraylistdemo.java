package com;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>countries=new ArrayList<String>();
		countries.add("INDIA");
		countries.add("AUSTRIA");
		countries.add("LIBYA");
		System.out.println("Initial ArrayList:"+countries);
		countries.add(1,"LIBYA");
		System.out.println("/nrraylist after adding element at 1:"+countries );
		//ArrayList<String>more_countries=new ArrayList<String>
	//System.out.println(Arrays.asList("NEPAL","BANGLADESH"));	
		countries.add(2,"NEPAL,BANGLADESH");
		System.out.println("/nrraylist after adding in 2 indexes:"+countries);
		
		
	
			
		
		
		
		
		
		
	}

}