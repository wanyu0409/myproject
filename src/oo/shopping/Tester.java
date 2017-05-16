package oo.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println("消費金額" + "\t" + "折扣後金額" + "\t" + "回饋金");
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new SliverCustomer(8000));
		list.add(new GoldenCustomer(10000));
		list.add(new GoldenCustomer(15000));
		list.add(new SliverCustomer(10000));
		list.add(new Customer(6000));
		//for (int i=0; i<list.size(); i++){
			//Customer cust = list.get(i);
		for (Customer cust : list){
			if(cust instanceof GoldenCustomer &&
					!(cust instanceof GoldenCustomer)){
				System.out.print("*");
				SliverCustomer silver = (SliverCustomer) cust;
			}
			cust.print();
		}
		
		String[] array = {"aa", "bb", "cc"};
		for (String s : array){
			System.out.println(s);
		}
		for(int i=0; i<array.length; i++){
			String s = array[i];
			System.out.println(s);
		}

		
		
	}

}
//父類別的參照可以放置子類別的物件