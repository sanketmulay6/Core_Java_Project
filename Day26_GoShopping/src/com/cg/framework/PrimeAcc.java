package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
//constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges);
		this.isPrime=isPrime;
		
	}
//method
	public void bookproduct(float charges) {
		System.out.println("Account no is:"+this.getAccNo()+"Account name is :"+this.getAccNm()+
				"Charges is :"+charges);
	}
	@Override
	public String toString() {
		return String.format("PrimeAcc [isPrime=%s]", isPrime);
	}

}