package cn.hl.vo;

public class Department {
	private int deptId;
	private String deptName;
	private String common;
	
	public Department() {
	}

	public Department(int deptId, String deptName, String common) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.common = common;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName
				+ ", common=" + common + "]";
	}
}
