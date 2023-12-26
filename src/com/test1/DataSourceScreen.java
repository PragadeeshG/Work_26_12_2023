package com.test1;

public class DataSourceScreen {
	private Integer refId;
	private Integer dsScreenId;
	private String dsScreenName;
	private String dsScreenUrl;
	private String dsPageUrl;
	private String actionIds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataSourceScreen() {

	}

	public DataSourceScreen(Integer refId, Integer dsScreenId, String dsScreenName, String dsScreenUrl,
			String dsPageUrl, String actionIds, String creationDate, String modifiedDate, String entityState) {
		super();
		this.refId = refId;
		this.dsScreenId = dsScreenId;
		this.dsScreenName = dsScreenName;
		this.dsScreenUrl = dsScreenUrl;
		this.dsPageUrl = dsPageUrl;
		this.actionIds = actionIds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRefId() {
		return refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	public Integer getDsScreenId() {
		return dsScreenId;
	}

	public void setDsScreenId(Integer dsScreenId) {
		this.dsScreenId = dsScreenId;
	}

	public String getDsScreenName() {
		return dsScreenName;
	}

	public void setDsScreenName(String dsScreenName) {
		this.dsScreenName = dsScreenName;
	}

	public String getDsScreenUrl() {
		return dsScreenUrl;
	}

	public void setDsScreenUrl(String dsScreenUrl) {
		this.dsScreenUrl = dsScreenUrl;
	}

	public String getDsPageUrl() {
		return dsPageUrl;
	}

	public void setDsPageUrl(String dsPageUrl) {
		this.dsPageUrl = dsPageUrl;
	}

	public String getActionIds() {
		return actionIds;
	}

	public void setActionIds(String actionIds) {
		this.actionIds = actionIds;
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
