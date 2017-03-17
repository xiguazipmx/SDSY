package org.model;

import java.sql.Timestamp;

/**
 * Activity entity. @author MyEclipse Persistence Tools
 */

public class Activity implements java.io.Serializable {

	// Fields

	private Integer RId;
	private String RName;
	private String RTId;
	private String RPicture;
	private String RIntroduction;
	private Integer RStatus;
	private String RAddress;
	private Timestamp RStartTime;
	private Timestamp REndTime;
	private Timestamp RCreateTime;
	private Timestamp RChangeTime;

	// Constructors

	/** default constructor */
	public Activity() {
	}

	/** full constructor */
	public Activity(String RName, String RTId, String RPicture,
			String RIntroduction, Integer RStatus, String RAddress,
			Timestamp RStartTime, Timestamp REndTime, Timestamp RCreateTime,
			Timestamp RChangeTime) {
		this.RName = RName;
		this.RTId = RTId;
		this.RPicture = RPicture;
		this.RIntroduction = RIntroduction;
		this.RStatus = RStatus;
		this.RAddress = RAddress;
		this.RStartTime = RStartTime;
		this.REndTime = REndTime;
		this.RCreateTime = RCreateTime;
		this.RChangeTime = RChangeTime;
	}

	// Property accessors

	public Integer getRId() {
		return this.RId;
	}

	public void setRId(Integer RId) {
		this.RId = RId;
	}

	public String getRName() {
		return this.RName;
	}

	public void setRName(String RName) {
		this.RName = RName;
	}

	public String getRTId() {
		return this.RTId;
	}

	public void setRTId(String RTId) {
		this.RTId = RTId;
	}

	public String getRPicture() {
		return this.RPicture;
	}

	public void setRPicture(String RPicture) {
		this.RPicture = RPicture;
	}

	public String getRIntroduction() {
		return this.RIntroduction;
	}

	public void setRIntroduction(String RIntroduction) {
		this.RIntroduction = RIntroduction;
	}

	public Integer getRStatus() {
		return this.RStatus;
	}

	public void setRStatus(Integer RStatus) {
		this.RStatus = RStatus;
	}

	public String getRAddress() {
		return this.RAddress;
	}

	public void setRAddress(String RAddress) {
		this.RAddress = RAddress;
	}

	public Timestamp getRStartTime() {
		return this.RStartTime;
	}

	public void setRStartTime(Timestamp RStartTime) {
		this.RStartTime = RStartTime;
	}

	public Timestamp getREndTime() {
		return this.REndTime;
	}

	public void setREndTime(Timestamp REndTime) {
		this.REndTime = REndTime;
	}

	public Timestamp getRCreateTime() {
		return this.RCreateTime;
	}

	public void setRCreateTime(Timestamp RCreateTime) {
		this.RCreateTime = RCreateTime;
	}

	public Timestamp getRChangeTime() {
		return this.RChangeTime;
	}

	public void setRChangeTime(Timestamp RChangeTime) {
		this.RChangeTime = RChangeTime;
	}

	@Override
	public String toString() {
		return "Activity [RId=" + RId + ", RName=" + RName + ", RTId=" + RTId
				+ ", RPicture=" + RPicture + ", RIntroduction=" + RIntroduction
				+ ", RStatus=" + RStatus + ", RAddress=" + RAddress
				+ ", RStartTime=" + RStartTime + ", REndTime=" + REndTime
				+ ", RCreateTime=" + RCreateTime + ", RChangeTime="
				+ RChangeTime + "]";
	}

}