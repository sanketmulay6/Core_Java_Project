package com.cg.framework;

public abstract class ShopFact {
	abstract public PrimeAcc getnewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime);
	abstract public NormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges);

}