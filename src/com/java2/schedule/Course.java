package com.java2.schedule;

public class Course {
	String id;
	String subject;
	int weekDay;
	int time;
	int duration;
	public Course(String id, String subject, int weekDay, int time, int duration) {
		super();
		this.id = id;
		this.subject = subject;
		this.weekDay = weekDay;
		this.time = time;
		this.duration = duration;
	}
	public boolean isAvailable(int weekDay,int time) {
		boolean avail = true;
		if(weekDay==this.weekDay) {
			if(time>=this.time && time<=this.time+duration) {
				return false;
			}
		}
		return avail;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
