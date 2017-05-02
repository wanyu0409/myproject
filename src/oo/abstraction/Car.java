package oo.abstraction;

public class Car {
	public String brand;
	int cc;
	String name;
	String type;
	int status;
	int id;
	float milage;
	//Fields
	
	public Car() {
		
	}
	public Car(String brand, String name){
		this(brand, name, 0);
		//會去找有沒有(字串，字串，整數)的建構子，而且要在第一行
		//this務健身上本身的方法，除了static
		System.out.println("haha");
	}
	public Car(String brand, String name, int cc){
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}
	//以上均為區域變數 local variable
	//方法:public void xxx(){}
	//可以用同一個方法名稱(同一種型態)，用變數去區別
	//void:回傳值return type
	//method name:xxx
	
	public void setMilage(int m){
		milage = m;
	}
	//兩個單字組成的方法名字:第一個單字完全小寫第二個單字第一個字母大寫

	public float addMilage(int m){
		milage = milage + m;
		return milage;
	}
	
	public void maintain(){
		status = 5;
		
	}
	
}
