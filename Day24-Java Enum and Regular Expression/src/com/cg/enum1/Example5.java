package com.cg.enum1;

public class Example5 {
	enum EmpType{
		Permanent,Temporary,Contaract_Based,Temp;
	}
	static void print(EmpType e) {
		if(e==EmpType.Permanent) {
			System.out.println("Employment is Permanent");
		}
		else if(e==EmpType.Contaract_Based) {
			System.out.println("Employment is Contract_Based");
		}
		else{
			System.out.println("Employment is Temporary");
		}
		
	}

	public static void main(String[] args) {
		EmpType e=EmpType.Temp;
		print(e);

	}

}