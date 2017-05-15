package oo.shopping;

public class GoldenCustomer extends Customer {
	public void amount (int price){
		amount = price * 9 / 10;
		System.out.println("金級會員應付金額:" + amount);
	}
	public void back (int price){
		back = price * 5 / 100;
		System.out.println("金級會員所得回饋金:" + back);
	}
}
