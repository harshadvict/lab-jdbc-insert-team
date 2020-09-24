package model;

public class City{
	Long CityId;
	String cityName;
	
	//Constructors
	
	public City(Long cityId, String cityName) {
	//	super();
		CityId = cityId;
		this.cityName = cityName;
	}
	
	//getters and setters
	
	public Long getCityId() {
		return CityId;
	}
	
	public void setCityId(Long cityId) {
		CityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
