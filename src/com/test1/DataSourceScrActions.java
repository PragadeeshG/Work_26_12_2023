package com.test1;

public class DataSourceScrActions {
	private Integer refId;
	private Integer dsScreenId;
	private Integer dsActionId;
	private String dsActionName;
	private Integer dsActionOrder;
	private Integer dsActionVersion;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataSourceScrActions() {

	}

	public DataSourceScrActions(Integer refId, Integer dsScreenId, Integer dsActionId, String dsActionName,
			Integer dsActionOrder, Integer dsActionVersion, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.refId = refId;
		this.dsScreenId = dsScreenId;
		this.dsActionId = dsActionId;
		this.dsActionName = dsActionName;
		this.dsActionOrder = dsActionOrder;
		this.dsActionVersion = dsActionVersion;
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

	public Integer getDsActionId() {
		return dsActionId;
	}

	public void setDsActionId(Integer dsActionId) {
		this.dsActionId = dsActionId;
	}

	public String getDsActionName() {
		return dsActionName;
	}

	public void setDsActionName(String dsActionName) {
		this.dsActionName = dsActionName;
	}

	public Integer getDsActionOrder() {
		return dsActionOrder;
	}

	public void setDsActionOrder(Integer dsActionOrder) {
		this.dsActionOrder = dsActionOrder;
	}

	public Integer getDsActionVersion() {
		return dsActionVersion;
	}

	public void setDsActionVersion(Integer dsActionVersion) {
		this.dsActionVersion = dsActionVersion;
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
