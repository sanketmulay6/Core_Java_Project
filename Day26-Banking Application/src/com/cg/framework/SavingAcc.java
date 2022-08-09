package com.cg.framework;

public abstract class SavingAcc extends BankAcc 
{
	private boolean isSalaried;
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
	public void withdraw(float charges)
	{
		System.out.println("Account no. is : "+this.getAccNo()+", Account Name is : "+this.getAccNm()+ ", Account Balance is "+this.getAccBal());
	}
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}
	
}
