package com.todo.todo.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Tache")
public class Tache {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int ID;
	@Column
	private String Title;
	@Column
	private String Content;
	@Column
	private Date Day;
	@Column
	private Time Hour;
	@ManyToOne
    @JoinColumn(name="empl_id", nullable=false)
	private Employee employee;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public Date getDay() {
		return Day;
	}
	public void setDay(Date day) {
		Day = day;
	}
	public Time getHour() {
		return Hour;
	}
	public void setHour(Time hour) {
		Hour = hour;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
