package com.poscoict.container.user;

import java.util.List;

public class User {
	private Long no = 0L;
	private String name = "myName";
	
	private Friend friend = null; // 의존성
	private List<String> friends;
	
	public User () {
		
	}
	
	public User (String name) {
		this.name = name;
	}

	public User (Long no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void setNo(Long no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", friends=" + friends + "]";
	}

	
}