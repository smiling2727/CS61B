package ClassNote;

public class ListNode {//public的class只能在自己的文件夹里定义
	public Object item;
	public ListNode next;//在ListNode还没创建的时候就调用自身
	
	public ListNode (Object item, ListNode next){
	this.item = item;
	this.next = next;
	}
	public ListNode(){ //因为写了上面这个含参的构造函数，所以默认的构造函数必须单独写出来
		}
	
	public void insertAfter(Object item){
		next = new ListNode(item,next);//第一个next默认是this.next
		//next = new ListNode(item, this.next);//这个跟上一行是一样的 括号里的next实际上指向的是this.next
	}
	public void bianliList(ListNode f1, int n){ //我自己写的，从f1开始往后遍历n个ListNode
		for(int i=0;i<n;i++){
			
			System.out.println();
		}
		
	}
}

class SList{//CS61B课上老师教的正确方法
	private ListNode head;//保证每个指向这个List都会同时增加
	private int size;

	public SList(){
		head = null;
		size = 0;
	}
	public void insertFront(Object item){
		head = new ListNode (item, head);
		size++;
	}
	public void listTravel(){//这个是我自己写的遍历函数
		ListNode lt = head;
		Object[] a = new Object[size];
		//因为是从头插入，如果正这遍历输出全部都是反的
		//所以这里用了先定义一个数组然后再遍历数组的方式
		//如果是倒叙输出，那么是可以直接来的
		for(int i=0;i<size;i++){
			//int j = size-i;
			a[size-1-i]=lt.item;
			lt = lt.next;
		}
		for(int j=0;j<size;j++){
		System.out.println("第"+j+"个的item="+a[j]);
		}
	}
	public void findNode(int location){//这个是我自己写的找到那个节点的含糊是
		for(int i=0;i<size;i++){
			
		}
	}
}

 class testListNode{
	
	public void testList1(){ //这个是用来测试ListNode的，不是拿来test SList的
	ListNode  l1 = new ListNode(), l2 = new ListNode(), l3 = new ListNode();
	l1.item = 7; l2.item=0; l3.item=6;
	l1.next = l2; l2.next = l3; 
	l3.next = null;//这一句在java中不一定要写，但是在c和c++中必须要有
	ListNode l4 = new ListNode(7,new ListNode(0 , new ListNode(6,null)));	
	l2.insertAfter(3);
	System.out.println("l2.next.item="+l2.next.item);
	}
	
	public void testSList(){
		SList s1 = new SList();
		s1.insertFront("I");
		s1.insertFront("love");
		s1.insertFront("you.");
		//s1.listTravel();//出来以后结果并不是iloveyou，因为是从头插入不是从后边插入
		s1.insertFront("Do");
		s1.insertFront("you");
		s1.insertFront("Love");
		s1.insertFront("me?");
		
		s1.listTravel();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     testListNode t1= new testListNode();
		t1.testList1();
		t1.testSList();
		
	}

}