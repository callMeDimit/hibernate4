package com.dimit.base.entity;

import java.util.Date;

public class Event {
	private Long id;
	private String title;
	private Date date;

	public Event() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", date=" + date + "]";
	}

	public static Event valueOf (String title, Date date) {
		Event envent = new Event();
		envent.title = title;
		envent.date = date;
		return envent;
	}
	
	
}
