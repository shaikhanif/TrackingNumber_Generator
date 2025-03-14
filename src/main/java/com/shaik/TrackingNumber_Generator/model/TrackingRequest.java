package com.shaik.TrackingNumber_Generator.model;

import org.springframework.validation.annotation.Validated;

@Validated
public class TrackingRequest {

	   private String originCountryId;
	    private String destinationCountryId;
	    private double weight;
	    private String createdAt;
	    private String customerId;
	    private String customerName;
	    private String customerSlug;
		public String getOriginCountryId() {
			return originCountryId;
		}
		public void setOriginCountryId(String originCountryId) {
			this.originCountryId = originCountryId;
		}
		public String getDestinationCountryId() {
			return destinationCountryId;
		}
		public void setDestinationCountryId(String destinationCountryId) {
			this.destinationCountryId = destinationCountryId;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public String getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}
		public String getCustomerId() {
			return customerId;
		}
		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerSlug() {
			return customerSlug;
		}
		public void setCustomerSlug(String customerSlug) {
			this.customerSlug = customerSlug;
		}

}
