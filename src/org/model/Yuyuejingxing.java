package org.model;

import java.sql.Timestamp;

/**
 * Yuyuejingxing entity. @author MyEclipse Persistence Tools
 */

public class Yuyuejingxing implements java.io.Serializable {

	// Fields

	private YuyuejingxingId id;
	private Timestamp YStartTime;
	private Timestamp YEndTime;
	private String YScript;
	private Integer YStatus;
	private Timestamp YCreateTime;
	private Timestamp YChangeTime;

	// Constructors

	/** default constructor */
	public Yuyuejingxing() {
	}

	/** minimal constructor */
	public Yuyuejingxing(YuyuejingxingId id) {
		this.id = id;
	}

	/** full constructor */
	public Yuyuejingxing(YuyuejingxingId id, Timestamp YStartTime,
			Timestamp YEndTime, String YScript, Integer YStatus,
			Timestamp YCreateTime, Timestamp YChangeTime) {
		this.id = id;
		this.YStartTime = YStartTime;
		this.YEndTime = YEndTime;
		this.YScript = YScript;
		this.YStatus = YStatus;
		this.YCreateTime = YCreateTime;
		this.YChangeTime = YChangeTime;
	}

	// Property accessors

	public YuyuejingxingId getId() {
		return this.id;
	}

	public void setId(YuyuejingxingId id) {
		this.id = id;
	}

	public Timestamp getYStartTime() {
		return this.YStartTime;
	}

	public void setYStartTime(Timestamp YStartTime) {
		this.YStartTime = YStartTime;
	}

	public Timestamp getYEndTime() {
		return this.YEndTime;
	}

	public void setYEndTime(Timestamp YEndTime) {
		this.YEndTime = YEndTime;
	}

	public String getYScript() {
		return this.YScript;
	}

	public void setYScript(String YScript) {
		this.YScript = YScript;
	}

	public Integer getYStatus() {
		return this.YStatus;
	}

	public void setYStatus(Integer YStatus) {
		this.YStatus = YStatus;
	}

	public Timestamp getYCreateTime() {
		return this.YCreateTime;
	}

	public void setYCreateTime(Timestamp YCreateTime) {
		this.YCreateTime = YCreateTime;
	}

	public Timestamp getYChangeTime() {
		return this.YChangeTime;
	}

	public void setYChangeTime(Timestamp YChangeTime) {
		this.YChangeTime = YChangeTime;
	}

}