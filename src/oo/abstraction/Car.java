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
	//�H�W�����ϰ��ܼ� local variable
	//��k:public void xxx(){}
	//void:�^�ǭ�return type
	//method name:xxx
	
	public void setMilage(int m){
		milage = m;
	}
	//��ӳ�r�զ�����k�W�r:�Ĥ@�ӳ�r�����p�g�ĤG�ӳ�r�Ĥ@�Ӧr���j�g

	public float addMilage(int m){
		milage = milage + m;
		return milage;
	}
	
	public void maintain(){
		status = 5;
		
	}
	
}
