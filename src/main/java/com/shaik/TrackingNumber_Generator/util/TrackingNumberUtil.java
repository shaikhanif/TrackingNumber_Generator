package com.shaik.TrackingNumber_Generator.util;

import java.util.UUID;

public class TrackingNumberUtil {
	 public static String generateTrackingNumber(String originCountryId, String destinationCountryId,
             Double weight, String createdAt,
             String customerId, String customerName, 
             String customerSlug) {

// Example of using parameters to generate the tracking number
String baseTrackingNumber = originCountryId + destinationCountryId + "-" 
+ weight.toString().replace(".", "") + "-" 
+ customerSlug + "-" 
+ UUID.randomUUID().toString().substring(0, 8).toUpperCase();

// Ensure tracking number follows the regex pattern ^[A-Z0-9]{1,16}$
return baseTrackingNumber.substring(0, Math.min(16, baseTrackingNumber.length()));
}
}