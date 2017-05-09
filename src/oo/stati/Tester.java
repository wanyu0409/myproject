package oo.stati;

import java.util.ArrayList;


public class Tester {

	public static void main(String[] args) {
		//所有類別的最上層類別是java.lang.Object
		System.out.println(Student.pass);
		Student stu1 = new Student(58, 98, 66);
		Student stu2 = new Student(67, 56, 77);
		Student stu3 = new Student(88, 99, 85);
		//stu1.english = -99;
		//利用private隱藏起來 寫方法set進來
		stu1.print();
		stu2.print();
		stu3.print();
		GraduateStudent gstu1 = new GraduateStudent(68, 85, 89);
		GraduateStudent gstu2 = new GraduateStudent(78, 89, 60);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(58, 98, 66));
		list.add(new Student(67, 56, 77));
		list.add(new Student(88, 99, 85));
		list.add(new GraduateStudent(68, 85, 89));
		list.add(new GraduateStudent(78, 89, 60));
		for(int i=0; i<list.size(); i++){
			Student stu = list.get(i);
			stu.print();
			
		}
		Student stu = new Student();
		System.out.println(stu);
	}

}
