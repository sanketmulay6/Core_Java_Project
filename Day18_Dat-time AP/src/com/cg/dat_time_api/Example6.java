package com.cg.dat_time_api;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("America/Toronto"));
		LocalDateTime df= LocalDateTime.now(ZoneId.of("Japan"));
		System.out.println(t);
		System.out.println(df);
		for(String s:ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}

	}

}