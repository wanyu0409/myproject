package oo.shopping;

public class GoldenCustomer extends SliverCustomer {
	float back = 0.05f;
	
	public GoldenCustomer(int amount){
		super(amount);
	}

	@Override
	public void print() {
		System.out.println(amount+"\t"+(amount*discount)+"\t"+(amount*back));
	}

	
}
