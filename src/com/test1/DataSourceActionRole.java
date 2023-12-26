package com.test1;

public class DataSourceActionRole {
	private Integer refId;
	private Integer dsScreenId;
	private Integer dsActionId;
	private String grpName;
	private Integer roleId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataSourceActionRole() {

	}

	public DataSourceActionRole(Integer refId, Integer dsScreenId, Integer dsActionId, String grpName, Integer roleId,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.refId = refId;
		this.dsScreenId = dsScreenId;
		this.dsActionId = dsActionId;
		this.grpName = grpName;
		this.roleId = roleId;
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

	public String getGrpName() {
		return grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
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
