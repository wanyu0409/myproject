package oo.test;

public class Member {
	String id;
	private int age;
	String name;
	
	public Member(){
		System.out.println("member construstor");
	}
	//只能在這個package使用
	void setAge(int age){
		if(age < 0){
			age = 0;
		}
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
