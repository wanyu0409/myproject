package oo.shopping;

import java.util.Scanner;

public class Customer {
	int amount;
	int price;
	int back;

	
	public void amount(int price){
		amount = price;
		System.out.println("一般會員應負金額:" + amount);
	}
	
	public void back(int price){
		back = price * 0;
		System.out.println("一般會員所得回饋金:" + back);
	}
	
}
