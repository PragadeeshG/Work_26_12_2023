package com.test1;

public class DatasourceCategory {
	private String catCode;
	private String catName;
	private String catDescription;
	private String catDefinition;
	private long refAuthId;
	private String owner;
	private String psIds;
	private long departmentId;
	private String creationDate;
	private String modifiedDate;

	public DatasourceCategory() {

	}

	public DatasourceCategory(String catCode, String catName, String catDescription, String catDefinition,
			long refAuthId, String owner, String psIds, long departmentId, String creationDate, String modifiedDate) {
		super();
		this.catCode = catCode;
		this.catName = catName;
		this.catDescription = catDescription;
		this.catDefinition = catDefinition;
		this.refAuthId = refAuthId;
		this.owner = owner;
		this.psIds = psIds;
		this.departmentId = departmentId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getCatCode() {
		return catCode;
	}

	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDescription() {
		return catDescription;
	}

	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}

	public String getCatDefinition() {
		return catDefinition;
	}

	public void setCatDefinition(String catDefinition) {
		this.catDefinition = catDefinition;
	}

	public long getRefAuthId() {
		return refAuthId;
	}

	public void setRefAuthId(long refAuthId) {
		this.refAuthId = refAuthId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPsIds() {
		return psIds;
	}

	public void setPsIds(String psIds) {
		this.psIds = psIds;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
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

}
