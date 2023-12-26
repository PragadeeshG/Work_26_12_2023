package com.test1;

public class DatasourceRefAuth {
	private long refAuthId;
	private String catCode;
	private String subCatCode;
	private String dataOwner;
	private String dataVerifier;
	private String dataCompletionTeam;
	private String emailGroup;
	private long refDataId;
	private Integer sequence;
	private String modularData;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DatasourceRefAuth() {

	}

	public DatasourceRefAuth(long refAuthId, String catCode, String subCatCode, String dataOwner, String dataVerifier,
			String dataCompletionTeam, String emailGroup, long refDataId, Integer sequence, String modularData,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.refAuthId = refAuthId;
		this.catCode = catCode;
		this.subCatCode = subCatCode;
		this.dataOwner = dataOwner;
		this.dataVerifier = dataVerifier;
		this.dataCompletionTeam = dataCompletionTeam;
		this.emailGroup = emailGroup;
		this.refDataId = refDataId;
		this.sequence = sequence;
		this.modularData = modularData;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getRefAuthId() {
		return refAuthId;
	}

	public void setRefAuthId(long refAuthId) {
		this.refAuthId = refAuthId;
	}

	public String getCatCode() {
		return catCode;
	}

	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}

	public String getSubCatCode() {
		return subCatCode;
	}

	public void setSubCatCode(String subCatCode) {
		this.subCatCode = subCatCode;
	}

	public String getDataOwner() {
		return dataOwner;
	}

	public void setDataOwner(String dataOwner) {
		this.dataOwner = dataOwner;
	}

	public String getDataVerifier() {
		return dataVerifier;
	}

	public void setDataVerifier(String dataVerifier) {
		this.dataVerifier = dataVerifier;
	}

	public String getDataCompletionTeam() {
		return dataCompletionTeam;
	}

	public void setDataCompletionTeam(String dataCompletionTeam) {
		this.dataCompletionTeam = dataCompletionTeam;
	}

	public String getEmailGroup() {
		return emailGroup;
	}

	public void setEmailGroup(String emailGroup) {
		this.emailGroup = emailGroup;
	}

	public long getRefDataId() {
		return refDataId;
	}

	public void setRefDataId(long refDataId) {
		this.refDataId = refDataId;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
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
