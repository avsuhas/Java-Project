package com.samson.sakilaproject.dbo;

public class ActorDbo {
	
	private int actorId;
	private String firstName;
	private String lastName;
	private String name;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	    
	}
	
	
	
	
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "ActorDbo [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	

}
