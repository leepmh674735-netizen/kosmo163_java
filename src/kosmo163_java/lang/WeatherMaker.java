package kosmo163_java.lang;

public class WeatherMaker DTO
{

	private String cityname
	private String weather;
	private String temp;
	WeatherMaker wm = new WeatherMaker();

	String[] ar = Wm.init();
	private String info;

	public WeatherMaker() {
		this.info = "서울-12-25.2-대전-3-65.대구#56&85.9";
	}

	public String[] init() {
		// info데이터를 파싱해서 결과물을 리턴
		String[] arr = this.info.split("-");
		WeatherDTO[] ar = new WeatherDTO[3];

		for (int i = 0; i < arr.length; i++) {
			// WeatherDTO dto = new WeatherDTO();
		}

		return arr;
	}
}
