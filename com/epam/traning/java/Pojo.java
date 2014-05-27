package com.epam.traning.java;

import java.util.*;


public class Pojo{
			
	public static  void main(String[] args){

	User user = new User("Peter Geza","+5454545454",123456);
	List<User> userList = new ArrayList<User>();
	userList.add(new User("THOMAS ANDERSEN","6666666",111111));
	userList.add(new User("cHRIS ANDERSEN","4444444",222222));
	userList.add(new User("EVE Smith","999999",333333));	
	userList.add(new User("THOMAS Smith","3333333",4444444));
	userList.add(new User("THOMAS Smith","3333333",4444444));
	
	Collections.sort(userList, new UserPhoneComparator());
	for(User element : userList) {
		System.out.println(element.toString());
	}

	System.out.println("SET: ");
	Set<User> userSet = new HashSet<User>();
	for(User element : userList){
		userSet.add(element);
	}

	for(User element : userSet) {
		System.out.println(element.toString());
	}
	

	
	
	

	}
	
}