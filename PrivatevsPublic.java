package ClassNote;

public class PrivatevsPublic {//这个class的真实名称应该是Date
	//虽然是public class但是因为两个变量都是private的所以没有办法直接通过下面这个样子来调用
	// PrivatevsPublic p1 = new PrivatevsPublic();  int myday = p1.day;
	private int day;
	private int month;
	
	public PrivatevsPublic(int month, int day){
		this.day = day;
		this.month = month;
	}
	public PrivatevsPublic(){
		
	}
	
	private void setMonth(int m){
		month = m;
	}
	public void setDay(int d){
		day = d;
	}
	public int getDay(){
		return day;
	}
}

class testDate{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivatevsPublic p1 = new PrivatevsPublic();  
		//int myday = p1.day;
		//int m = 5; p1.setMonth(5);//这句也是错的因为setMonth是private method
		int d = 27; p1.setDay(d);
		int j = p1.getDay();
		System.out.println("p1.getDay="+j);
	}

}
