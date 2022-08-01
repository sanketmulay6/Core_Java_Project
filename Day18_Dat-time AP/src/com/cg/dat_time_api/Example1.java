package com.cg.dat_time_api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Example1 {

	public static void main(String[] args) {
		LocalDate l= LocalDate.now();
		LocalTime t= LocalTime.now();
		LocalDate lt= LocalDate.of(1997,Month.OCTOBER , 3);
		System.out.println(l);
		System.out.println(t);
		System.out.println(lt);
	}

}