package com.cg.dat_time_api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Example4 {

	public static void main(String[] args) {
		LocalDate date1= LocalDate.now();
		LocalDate date2= date1.plusDays(1);
				System.out.println(date2);
				long df=ChronoUnit.DAYS.between(date1, date2);
				System.out.println(df);
	}

}