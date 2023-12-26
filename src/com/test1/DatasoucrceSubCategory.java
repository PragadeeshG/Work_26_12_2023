package com.test1;

public class DatasoucrceSubCategory {
	private String subCatCode;
	private String subcatName;
	private String subCatDescription;
	private String subCatDefinition;
	private String subCatRefAuthName;
	private long errorCode;
	private String errorSeverity;
	private String ncType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DatasoucrceSubCategory() {

	}

	public DatasoucrceSubCategory(String subCatCode, String subcatName, String subCatDescription,
			String subCatDefinition, String subCatRefAuthName, long errorCode, String errorSeverity, String ncType,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.subCatCode = subCatCode;
		this.subcatName = subcatName;
		this.subCatDescription = subCatDescription;
		this.subCatDefinition = subCatDefinition;
		this.subCatRefAuthName = subCatRefAuthName;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.ncType = ncType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getSubCatCode() {
		return subCatCode;
	}

	public void setSubCatCode(String subCatCode) {
		this.subCatCode = subCatCode;
	}

	public String getSubcatName() {
		return subcatName;
	}

	public void setSubcatName(String subcatName) {
		this.subcatName = subcatName;
	}

	public String getSubCatDescription() {
		return subCatDescription;
	}

	public void setSubCatDescription(String subCatDescription) {
		this.subCatDescription = subCatDescription;
	}

	public String getSubCatDefinition() {
		return subCatDefinition;
	}

	public void setSubCatDefinition(String subCatDefinition) {
		this.subCatDefinition = subCatDefinition;
	}

	public String getSubCatRefAuthName() {
		return subCatRefAuthName;
	}

	public void setSubCatRefAuthName(String subCatRefAuthName) {
		this.subCatRefAuthName = subCatRefAuthName;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSeverity() {
		return errorSeverity;
	}

	public void setErrorSeverity(String errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	public String getNcType() {
		return ncType;
	}

	public void setNcType(String ncType) {
		this.ncType = ncType;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
