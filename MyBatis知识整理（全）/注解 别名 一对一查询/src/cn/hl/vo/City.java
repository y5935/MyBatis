package cn.hl.vo;

public class City {
	private int cityId;
	private String cityName;
	private int pId;
	
	public City() {
		// TODO Auto-generated constructor stub
	}

	public City(int cityId, String cityName, int pId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.pId = pId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", pId="
				+ pId + "]";
	}
	
}
