package cn.hl.vo;

public class Role {
	private int roleId;
	private String roleName;
	private String common;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(int roleId, String roleName, String common) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.common = common;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName
				+ ", common=" + common + "]";
	}
}
