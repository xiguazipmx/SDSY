package org.model;

import java.sql.Timestamp;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private TeacherId id;
	private String TPassword;
	private String TName;
	private Integer TPhone;
	private Integer TDutyphone;
	private String TEmail;
	private String TCollege;
	private String TAddress;
	private String TPicture;
	private String TToken;
	private String TExpert;
	private String TResearchdirection;
	private Timestamp TChangeTime;
	private Timestamp TCreateTime;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(TeacherId id) {
		this.id = id;
	}

	/** full constructor */
	public Teacher(TeacherId id, String TPassword, String TName,
			Integer TPhone, Integer TDutyphone, String TEmail, String TCollege,
			String TAddress, String TPicture, String TToken, String TExpert,
			String TResearchdirection, Timestamp TChangeTime,
			Timestamp TCreateTime) {
		this.id = id;
		this.TPassword = TPassword;
		this.TName = TName;
		this.TPhone = TPhone;
		this.TDutyphone = TDutyphone;
		this.TEmail = TEmail;
		this.TCollege = TCollege;
		this.TAddress = TAddress;
		this.TPicture = TPicture;
		this.TToken = TToken;
		this.TExpert = TExpert;
		this.TResearchdirection = TResearchdirection;
		this.TChangeTime = TChangeTime;
		this.TCreateTime = TCreateTime;
	}

	// Property accessors

	public TeacherId getId() {
		return this.id;
	}

	public void setId(TeacherId id) {
		this.id = id;
	}

	public String getTPassword() {
		return this.TPassword;
	}

	public void setTPassword(String TPassword) {
		this.TPassword = TPassword;
	}

	public String getTName() {
		return this.TName;
	}

	public void setTName(String TName) {
		this.TName = TName;
	}

	public Integer getTPhone() {
		return this.TPhone;
	}

	public void setTPhone(Integer TPhone) {
		this.TPhone = TPhone;
	}

	public Integer getTDutyphone() {
		return this.TDutyphone;
	}

	public void setTDutyphone(Integer TDutyphone) {
		this.TDutyphone = TDutyphone;
	}

	public String getTEmail() {
		return this.TEmail;
	}

	public void setTEmail(String TEmail) {
		this.TEmail = TEmail;
	}

	public String getTCollege() {
		return this.TCollege;
	}

	public void setTCollege(String TCollege) {
		this.TCollege = TCollege;
	}

	public String getTAddress() {
		return this.TAddress;
	}

	public void setTAddress(String TAddress) {
		this.TAddress = TAddress;
	}

	public String getTPicture() {
		return this.TPicture;
	}

	public void setTPicture(String TPicture) {
		this.TPicture = TPicture;
	}

	public String getTToken() {
		return this.TToken;
	}

	public void setTToken(String TToken) {
		this.TToken = TToken;
	}

	public String getTExpert() {
		return this.TExpert;
	}

	public void setTExpert(String TExpert) {
		this.TExpert = TExpert;
	}

	public String getTResearchdirection() {
		return this.TResearchdirection;
	}

	public void setTResearchdirection(String TResearchdirection) {
		this.TResearchdirection = TResearchdirection;
	}

	public Timestamp getTChangeTime() {
		return this.TChangeTime;
	}

	public void setTChangeTime(Timestamp TChangeTime) {
		this.TChangeTime = TChangeTime;
	}

	public Timestamp getTCreateTime() {
		return this.TCreateTime;
	}

	public void setTCreateTime(Timestamp TCreateTime) {
		this.TCreateTime = TCreateTime;
	}

}