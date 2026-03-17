package kosmo163_java.lang;

public class WeatherDTO {

	private String cityName;

	public String init() {
		 //info데이터를 파싱해서 결과물을 리턴
		
		 String [] ar = this.info.split("-");
		WeatherMaker [] weathers =new WeatherDTO[6];
		
		weatherDTO = new WeatherDTO(ar[i]);
		
		WeatherDTO weatherDTO = null;
		 for(int i=0;i<ar.length;i++) {
			//  WeatherMaker w = new WeatherMaker();
			//  weatherDTO = new WeatherDTO();
			//  w,setCityName(ar[i]);
			// weathers[i]=w;
			 
			 
			 
			 weather[i] = new WeatherDTO();
			 weather[i].setcityName(ar[i]);
		 } 
			 if(ar[i].equals(this.cityName)) {
				 
				 return weathers;
			 }
		 }
}
@Override
public String toString() {
	return "WeatherDTO [cityName=" + cityName + "]";

}
