package org.model;

import java.sql.Timestamp;

/**
 * Yuyuelaoshi entity. @author MyEclipse Persistence Tools
 */

public class Yuyuelaoshi implements java.io.Serializable {

	// Fields

	private Integer YId;
	private String YTId;
	private String YAddress;
	private Timestamp YCreateTime;
	private Timestamp YChangeTime;
	private String YEvaluation;

	// Constructors

	/** default constructor */
	public Yuyuelaoshi() {
	}

	/** full constructor */
	public Yuyuelaoshi(String YTId, String YAddress, Timestamp YCreateTime,
			Timestamp YChangeTime, String YEvaluation) {
		this.YTId = YTId;
		this.YAddress = YAddress;
		this.YCreateTime = YCreateTime;
		this.YChangeTime = YChangeTime;
		this.YEvaluation = YEvaluation;
	}

	// Property accessors

	public Integer getYId() {
		return this.YId;
	}

	public void setYId(Integer YId) {
		this.YId = YId;
	}

	public String getYTId() {
		return this.YTId;
	}

	public void setYTId(String YTId) {
		this.YTId = YTId;
	}

	public String getYAddress() {
		return this.YAddress;
	}

	public void setYAddress(String YAddress) {
		this.YAddress = YAddress;
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

	public String getYEvaluation() {
		return this.YEvaluation;
	}

	public void setYEvaluation(String YEvaluation) {
		this.YEvaluation = YEvaluation;
	}

}