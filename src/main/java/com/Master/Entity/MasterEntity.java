package com.Master.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "master_list")
public class MasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String category; 

	@Column(nullable = false)
	private String parentCode;

	@Column(nullable = false)
	private String parentName;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String plan;

	@Column(nullable = false)
	private String option;

	private String optionFrequency;
	private Integer faceValue;
	private String subCategory;
	private String transactionModeAllowed;
	private String sector;
	private String benchmark;

	public MasterEntity() {
	}

	public MasterEntity(Long id, String category, String parentCode, String parentName, String name, String plan,
			String option, String optionFrequency, Integer faceValue, String subCategory, String transactionModeAllowed,
			String sector, String benchmark) {
		this.id = id;
		this.category = category;
		this.parentCode = parentCode;
		this.parentName = parentName;
		this.name = name;
		this.plan = plan;
		this.option = option;
		this.optionFrequency = optionFrequency;
		this.faceValue = faceValue;
		this.subCategory = subCategory;
		this.transactionModeAllowed = transactionModeAllowed;
		this.sector = sector;
		this.benchmark = benchmark;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getOptionFrequency() {
		return optionFrequency;
	}

	public void setOptionFrequency(String optionFrequency) {
		this.optionFrequency = optionFrequency;
	}

	public Integer getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(Integer faceValue) {
		this.faceValue = faceValue;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getTransactionModeAllowed() {
		return transactionModeAllowed;
	}

	public void setTransactionModeAllowed(String transactionModeAllowed) {
		this.transactionModeAllowed = transactionModeAllowed;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getBenchmark() {
		return benchmark;
	}

	public void setBenchmark(String benchmark) {
		this.benchmark = benchmark;
	}

	@Override
	public String toString() {
		return "MasterEntity [id=" + id + ", category=" + category + ", parentCode=" + parentCode + ", parentName="
				+ parentName + ", name=" + name + ", plan=" + plan + ", option=" + option + ", optionFrequency="
				+ optionFrequency + ", faceValue=" + faceValue + ", subCategory=" + subCategory
				+ ", transactionModeAllowed=" + transactionModeAllowed + ", sector=" + sector + ", benchmark="
				+ benchmark + "]";
	}
	
	
}
