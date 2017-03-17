package org.model;

import java.sql.Timestamp;

/**
 * Students entity. @author MyEclipse Persistence Tools
 */

public class Students implements java.io.Serializable {

	// Fields

	private StudentsId id;
	private String SName;
	private String SProfession;
	private String SClass;
	private String SPassword;
	private String SIdcard;
	private Integer SPhone;
	private Boolean SSex;
	private String STutor;
	private Timestamp SCreateTime;
	private Timestamp SChangeTime;
	private String SPicture;
	private String SToken;

	// Constructors

	/** default constructor */
	public Students() {
	}

	/** minimal constructor */
	public Students(StudentsId id) {
		this.id = id;
	}

	/** full constructor */
	public Students(StudentsId id, String SName, String SProfession,
			String SClass, String SPassword, String SIdcard, Integer SPhone,
			Boolean SSex, String STutor, Timestamp SCreateTime,
			Timestamp SChangeTime, String SPicture, String SToken) {
		this.id = id;
		this.SName = SName;
		this.SProfession = SProfession;
		this.SClass = SClass;
		this.SPassword = SPassword;
		this.SIdcard = SIdcard;
		this.SPhone = SPhone;
		this.SSex = SSex;
		this.STutor = STutor;
		this.SCreateTime = SCreateTime;
		this.SChangeTime = SChangeTime;
		this.SPicture = SPicture;
		this.SToken = SToken;
	}

	// Property accessors

	public StudentsId getId() {
		return this.id;
	}

	public void setId(StudentsId id) {
		this.id = id;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public String getSProfession() {
		return this.SProfession;
	}

	public void setSProfession(String SProfession) {
		this.SProfession = SProfession;
	}

	public String getSClass() {
		return this.SClass;
	}

	public void setSClass(String SClass) {
		this.SClass = SClass;
	}

	public String getSPassword() {
		return this.SPassword;
	}

	public void setSPassword(String SPassword) {
		this.SPassword = SPassword;
	}

	public String getSIdcard() {
		return this.SIdcard;
	}

	public void setSIdcard(String SIdcard) {
		this.SIdcard = SIdcard;
	}

	public Integer getSPhone() {
		return this.SPhone;
	}

	public void setSPhone(Integer SPhone) {
		this.SPhone = SPhone;
	}

	public Boolean getSSex() {
		return this.SSex;
	}

	public void setSSex(Boolean SSex) {
		this.SSex = SSex;
	}

	public String getSTutor() {
		return this.STutor;
	}

	public void setSTutor(String STutor) {
		this.STutor = STutor;
	}

	public Timestamp getSCreateTime() {
		return this.SCreateTime;
	}

	public void setSCreateTime(Timestamp SCreateTime) {
		this.SCreateTime = SCreateTime;
	}

	public Timestamp getSChangeTime() {
		return this.SChangeTime;
	}

	public void setSChangeTime(Timestamp SChangeTime) {
		this.SChangeTime = SChangeTime;
	}

	public String getSPicture() {
		return this.SPicture;
	}

	public void setSPicture(String SPicture) {
		this.SPicture = SPicture;
	}

	public String getSToken() {
		return this.SToken;
	}

	public void setSToken(String SToken) {
		this.SToken = SToken;
	}

}