package com.epam.traning.java;

import java.util.*;


public class UserPhoneComparator implements Comparator<User> {
	public int compare(User user1, User user2) {
		return user1.getPhone().compareTo(user2.getPhone());
	}
}

