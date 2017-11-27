package com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "instructor")
public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name= "first_name")
	private String fname;
	@Column(name= "last_name")
	private String lname;
	@Column(name= "email")
	private String email;
	
	@OneToMany(mappedBy= "instructor",  cascade ={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Course> courses;
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private InstructorDetail insdetails;
    public Instructor(){
    	
    }
	public Instructor(String fname, String lname, String email) {
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public InstructorDetail getInsdetails() {
		return insdetails;
	}
	public void setInsdetails(InstructorDetail insdetails) {
		this.insdetails = insdetails;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", fname=" + fname + ", lname=" + lname
				+ ", email=" + email + ", insdetails=" + insdetails + "]";
	}
	
public void add(Course tempCourse) {
		
		if (courses == null) {
			courses = new ArrayList<>();
		}
		
		courses.add(tempCourse);
		
		tempCourse.setInstructor(this);
	}

}
