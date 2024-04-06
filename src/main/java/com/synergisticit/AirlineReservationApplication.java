package com.synergisticit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirlineReservationApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
	    SpringApplication.run(AirlineReservationApplication.class, args);
	}
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AirlineReservationApplication.class);
    }
}
