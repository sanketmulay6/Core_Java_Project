package com.cg.app;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFact;

public class GSShopFactory extends ShopFact {

	@Override
	public PrimeAcc getnewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc p= new GSPrimeAcc(AccNo,accNm,charges,isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc n=new GSNormalAcc(AccNo,accNm,charges,deliveryCharges);
		return n;
	}

}