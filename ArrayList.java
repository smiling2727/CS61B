package ClassNote;

public class ArrayList {
	String[] a;
	int LastItem;
	public ArrayList(int length){//构造方法 数组 test1
		 a = new String[length];
		LastItem = -1;
		a[0] = "No.1";
		LastItem++;
		a[1] = "No.2";
		LastItem++;
		a[2] = "No.3";
		LastItem++;
		a[3] = "No.4";
		LastItem++;
		//System.out.println("a.toString"+a.toString());
		System.out.println("a[0]="+a[0]);
		System.out.println("调用test1,LastItem="+LastItem);
		System.out.println("调用test1,length="+length);
	}
	public ArrayList(){//test2
		this(10); //调用上面那个构造方法的内容
		System.out.println("调用test2");
	}
	
	static private int gcd(int x, int y) {//这个是与这个文件无关的找最小公倍数的算法
	    /* Replace the following line with your solution. */
	   int max=0,min=0,maxd=0;
	   if(x>=y){ max=x; min=y;}
	   else {max = y;min=x;}
	   //System.out.println("max="+max+"min="+min);
	   for(int i=1;i<=min;i++){
		   if(max%i==0&&min%i==0){  maxd=i;
		   //System.out.println("i="+i+"maxd="+maxd);
		   }
		   }
	    return maxd;
	  }
	
	
	public void arrayInsert(int location,String value){
		//只在构造函数里定义过的变量，在方法中不能被调用
		for(int i=LastItem;i>=location;i--){
			a[i+1] = a[i];
		}
		a[location] =value;
		LastItem++;
	}
	public void showList(){
		for(int i=0;i<=LastItem;i++){
			System.out.println("a["+i+"]="+a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //test t1 = new test();
	    ArrayList t2 = new ArrayList (5);
		t2.arrayInsert(2,"hello");
		t2.showList();
	    int max = gcd(128,64);
		System.out.println(max);
		PrivatevsPublic p1 = new PrivatevsPublic();  
		//int myday = p1.day;
		//int m = 5; p1.setMonth(5);//这句也是错的因为setMonth是private method
		int d = 27; p1.setDay(d);
		int j = p1.getDay();
		System.out.println("p1.getDay="+j);
	}
}

