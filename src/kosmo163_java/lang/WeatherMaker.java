package kosmo163_java.lang;

public class WeatherMaker {
       WeatherMaker wm = new WeatherMaker();
       String [] ar =Wm.init();
  private String info;
  
  public WeatherMaker() {
      this.info = "서울-대전- 대구-부산-인천-제주";
     }
  
  public String[] init() {
	  //info데이터를 파싱해서 결과물을 리턴
	  String [] arr = this.info.split("-");
	  
	  return arr;
	  }
  }
