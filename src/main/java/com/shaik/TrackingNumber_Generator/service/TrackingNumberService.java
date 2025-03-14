 package com.shaik.TrackingNumber_Generator.service;

import org.springframework.stereotype.Service;
import com.shaik.TrackingNumber_Generator.util.TrackingNumberUtil;
@Service
public class TrackingNumberService {
	public String generateTrackingNumber(String originCountryId, String destinationCountryId, 
            Double weight, String createdAt, 
            String customerId, String customerName, 
            String customerSlug) {

// Use parameters to generate a unique tracking number.
return TrackingNumberUtil.generateTrackingNumber(
originCountryId, destinationCountryId, weight, createdAt, 
customerId, customerName, customerSlug
);
}
}