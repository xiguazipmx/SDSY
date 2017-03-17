package org.model;

/**
 * Activiting entity. @author MyEclipse Persistence Tools
 */

public class Activiting implements java.io.Serializable {

	// Fields

	private ActivitingId id;
	private Integer AStatus;
	private Integer AGrade;

	// Constructors

	/** default constructor */
	public Activiting() {
	}

	/** minimal constructor */
	public Activiting(ActivitingId id) {
		this.id = id;
	}

	/** full constructor */
	public Activiting(ActivitingId id, Integer AStatus, Integer AGrade) {
		this.id = id;
		this.AStatus = AStatus;
		this.AGrade = AGrade;
	}

	// Property accessors

	public ActivitingId getId() {
		return this.id;
	}

	public void setId(ActivitingId id) {
		this.id = id;
	}

	public Integer getAStatus() {
		return this.AStatus;
	}

	public void setAStatus(Integer AStatus) {
		this.AStatus = AStatus;
	}

	public Integer getAGrade() {
		return this.AGrade;
	}

	public void setAGrade(Integer AGrade) {
		this.AGrade = AGrade;
	}

	@Override
	public String toString() {
		return "Activiting [id=" + id + ", AStatus=" + AStatus + ", AGrade="
				+ AGrade + "]";
	}

}