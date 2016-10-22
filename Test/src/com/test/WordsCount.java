package com.test;

import java.util.HashMap;
import java.util.Set;

public class WordsCount {

	public static void main(String[] args) {
		String data="This is This is";
		String arr[]=data.split(" ");
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		for(String temp:arr){ 
			try{
				hash.get(temp);
				hash.put(temp,hash.get(temp)+1);
			}catch(Exception e){
				Integer put = hash.put(temp, 1);
			}
				
		}
		Set<String> key=hash.keySet();
		for(String k:key)
			System.out.println(k+":"+hash.get(k));
	}

}
