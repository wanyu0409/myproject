package oo.abstraction;

public class Car {
	String brand;
	int cc;
	String name;
	String type;
	int status;
	int id;
	float milage;
	//Fields
	
	public Car(String brand, String name, int cc){
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}
	//以上均為區域變數 local variable
	//方法:public void xxx(){}
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
