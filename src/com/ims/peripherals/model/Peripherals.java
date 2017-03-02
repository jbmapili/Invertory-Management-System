package com.ims.peripherals.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Peripherals implements Serializable{
	private Integer unitNo;
	private Integer peripheralNo;
	private String peripheralType;
	private String tagNumber;
	private Date acquiredDate;
	private String description;
	private String serialNo;
	private String brand;
	private String model;
	private String color;
	private String remarks;
	private String userId; 
	private Date lastUpdate;
	private String status;	
	private String saved;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getUnitNo() {
		return unitNo;
	}
	public void setUnitNo(Integer unitNo) {
		this.unitNo = unitNo;
	}
	public Integer getPeripheralNo() {
		return peripheralNo;
	}
	public void setPeripheralNo(Integer peripheralNo) {
		this.peripheralNo = peripheralNo;
	}
	public String getPeripheralType() {
		return peripheralType;
	}
	public void setPeripheralType(String peripheralType) {
		this.peripheralType = peripheralType;
	}
	public String getTagNumber() {
		return tagNumber;
	}
	public void setTagNumber(String tagNumber) {
		this.tagNumber = tagNumber;
	}
	public Date getAcquiredDate() {
		return acquiredDate;
	}
	public void setAcquiredDate(Date acquiredDate) {
		this.acquiredDate = acquiredDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getSaved() {
		return saved;
	}
	public void setSaved(String saved) {
		this.saved = saved;
	}
	
}
