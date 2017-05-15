package oo.shopping;

public class SliverCustomer extends Customer{
	public void amount (int price){
		amount = price * 9 / 10 ;
		System.out.println("銀級會員應付金額:" + amount);
	}
	public void back (int price){
		price = 6000;
		back = price * 0;
		System.out.println("銀級會員所得回饋金:" + back);
	}
	
}
