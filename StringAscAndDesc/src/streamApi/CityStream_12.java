package streamApi;

public class CityStream_12 {

	private int cityid;
	private String cityname;
	private StateStream_12 objState;
	private float pollutionIndex;
	private int population;
	private int area_of_city;
	
	public CityStream_12(int cityid, String cityname, StateStream_12 objState, float pollutionIndex, int population,
			int area_of_city) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.objState = objState;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public StateStream_12 getObjState() {
		return objState;
	}

	public void setObjState(StateStream_12 objState) {
		this.objState = objState;
	}

	public float getPollutionIndex() {
		return pollutionIndex;
	}

	public void setPollutionIndex(float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea_of_city() {
		return area_of_city;
	}

	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}

	@Override
	public String toString() {
		return "CityStream [cityid=" + cityid + ", cityname=" + cityname + ", objState=" + objState
				+ ", pollutionIndex=" + pollutionIndex + ", population=" + population + ", area_of_city=" + area_of_city
				+ "]";
	}
	
	
	
	
}
