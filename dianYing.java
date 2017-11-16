import javax.xml.crypto.Data;

/*
 *  属性: 编号、名称、导演、主演、时长、播放时间、价格.
           行为: 显示信息.
 */
public class dianYing {
   private String id;
   private String name;
   private String director;
   private int time1;
   private int time2;
   private float price;
   
   public dianYing(String id, String name, String director, int time1, int time2, float price) {
	//super();
		this.id = id;
		this.name = name;
		this.director = director;
		this.time1 = time1;
		this.time2 = time2;
		this.price = price;
	}
    public void showInfo(){
    	System.out.println("电影名字："+name+", "+"导演："+director+", "+"时长:"+time1+", "+"播放时长："+time2+", "+"价格："+price+"RMB");
    }
   	public String getID() {
	    return id;
   	}
	public void setID(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getTime1() {
		return time1;
	}
	public void setTime1(int time1) {
		this.time1 = time1;
	}
	public int getTime2() {
		return time2;
	}
	public void setTime2(int time2) {
		this.time2 = time2;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

   
}
