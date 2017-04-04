package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

import oo.abstraction.*;

public class Tester {
	
	public static void main (String[] args){
		Car c = new Car("XX", "AA", 2000);
		ArrayList<String> a = new ArrayList();
		//List可放異質資料Heterogeneous
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入您的號碼:");
		
		
		//String[] numbers = {"331","821", "886", "554"};
		a.add("321");
		a.add("821");
		//a.add(123);
		a.add("886");
		//a.add(true);
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(2, "885");
		System.out.println(a);
		String data = a.get(3);
		//int n = (int)a.get(4);
		
		//本次開獎號為:331 821 886 554讓使用者輸入發票號碼(長度不限)，判斷尾數3位是否中獎
	}
	
}
