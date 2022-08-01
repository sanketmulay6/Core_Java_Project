package com.cg.dat_time_api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example3 {

	public static void main(String[] args) {
		LocalDateTime datetime=LocalDateTime.now();
		DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String var=datetime.format(df);
		System.out.println(var);
	}

}