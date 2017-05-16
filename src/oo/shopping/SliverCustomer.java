package oo.shopping;

public class SliverCustomer extends Customer{
	float discount = 0.1f;
	
	public SliverCustomer(int amount){
		super(amount);
	}
	
	@Override
	public void print() {
		System.out.println(amount+"\t"+(amount*discount)+"\t0");
	}
	
	
	
}
