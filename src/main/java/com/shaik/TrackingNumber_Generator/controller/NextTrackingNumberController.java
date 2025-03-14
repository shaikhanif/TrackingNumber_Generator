package com.shaik.TrackingNumber_Generator.controller;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.shaik.TrackingNumber_Generator.model.TrackingNumberResponse;
import com.shaik.TrackingNumber_Generator.service.TrackingNumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class NextTrackingNumberController {
	private static final Logger logger = LoggerFactory.getLogger(NextTrackingNumberController.class);

	 private final TrackingNumberService trackingService;

	    @Autowired
	    public NextTrackingNumberController(TrackingNumberService trackingService) {
	        this.trackingService = trackingService;
	    }

	    @GetMapping("/next-tracking-number")
	    public ResponseEntity<TrackingNumberResponse> generateTrackingNumber(
	            @RequestParam @NotNull String origin_country_id,
	            @RequestParam @NotNull String destination_country_id,
	            @RequestParam @NotNull Double weight,
	            @RequestParam @NotNull String created_at,
	            @RequestParam @NotNull String customer_id,
	            @RequestParam @NotNull String customer_name,
	            @RequestParam @NotNull String customer_slug) {
	    	 logger.info("Received request to generate tracking number for customer: {}", customer_name);

	        String trackingNumber = trackingService.generateTrackingNumber(
	                origin_country_id, destination_country_id, weight, created_at,
	                customer_id, customer_name, customer_slug);

	        TrackingNumberResponse response = new TrackingNumberResponse(trackingNumber, System.currentTimeMillis());
	        return ResponseEntity.ok(response);
	   
}

}