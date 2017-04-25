package oo.mid;

public class MealTester {

	public static void main(String[] args) {
		Meal m1 = new Meal("大麥克", "可樂","薯條", 1, 105, 105);
		Meal m2 = new Meal("麥香雞", "雪碧","薯條", 2, 95, 190);
		Meal m3 = new Meal("麥香魚", "檸檬紅茶", "薯條", 1, 115, 115);
		
		Meal[] meals = new Meal[3];
		meals[0]= new Meal("大麥克", "可樂","薯條", 1, 105, 105);
		meals[1]= new Meal("麥香雞", "雪碧","薯條", 2, 95, 190);
		meals[2]= new Meal("麥香魚", "檸檬紅茶", "薯條", 1, 115, 115);
		
		int i = 0;
		for(i=0; i<3; i++){
			System.out.println(meals[i].total);
		}
		
	}

}
