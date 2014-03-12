package com.graeme.model;

public class storeBean 
{
	private String short_Desc;
	private int faultID;
	private String description;
	private String priority;
	private int reported_By;
	private String fix;
	private int fix_by;
	
	public String getShort_Desc() {
		return short_Desc;
	}
	public void setShort_Desc(String short_Desc) {
		this.short_Desc = short_Desc;
	}
	public int getFaultID() {
		return faultID;
	}
	public void setFaultID(int faultID) {
		this.faultID = faultID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public int getReported_By() {
		return reported_By;
	}
	public void setReported_By(int reported_By) {
		this.reported_By = reported_By;
	}
	public String getFix() {
		return fix;
	}
	public void setFix(String fix) {
		this.fix = fix;
	}
	public int getFix_by() {
		return fix_by;
	}
	public void setFix_by(int fix_by) {
		this.fix_by = fix_by;
	}
}
