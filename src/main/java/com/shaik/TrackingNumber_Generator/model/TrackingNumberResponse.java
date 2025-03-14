package com.shaik.TrackingNumber_Generator.model;

public class TrackingNumberResponse {

	private String tracking_number;
    private long created_at;
   

    public TrackingNumberResponse(String tracking_number, long created_at) {
        this.tracking_number = tracking_number;
        this.created_at = created_at;
    }
 

    public String getTracking_number() {
        return tracking_number;
    }

    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
    }

    public long getCreated_at() {
        return created_at;
    }

   
}