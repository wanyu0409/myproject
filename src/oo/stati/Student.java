package oo.stati;

class Student {
	//屬性(Fields, Instance Variable實例變數)
	int english;
	int math;
	int chinese;
	static int pass = 60;
	Student(){
		//不寫public、private、protected只能在這個package裡使用
	}
	//static類別變數，應用上用得到才用
	/*static{
		System.out.println("STATIC!!");
		System.out.println(english);
		//因為在static區塊是物件還沒生成就執行，所以english不能再static區塊執行		
		System.out.println(pass);
		//一切都還沒發生就有資料了 所以在static區塊就能使用他
		
		//在static類別裡不能使用this	
	}*/
	
	public Student(int english, int math, int chinese){
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese));
	}
	private String getScore(int score){
		if(score<pass){
			return String.valueOf(score)+"*";
		}else{
			return String.valueOf(score);
		}
	}
}
