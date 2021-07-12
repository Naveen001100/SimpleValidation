package com.example;
import java.util.*;

public class LoginInformation {
	
	static Map<String,String>  mp = new HashMap<>();
	
	static {
		mp.put("Naveen", "Java");
		mp.put("Sachin", "Cricket");
	}
	
	public Boolean validate(String name,String pwd){
		if(mp.containsKey(name)) {
			if(mp.get(name).equals(pwd))
				return true;
		}
		return false;
	}
}
