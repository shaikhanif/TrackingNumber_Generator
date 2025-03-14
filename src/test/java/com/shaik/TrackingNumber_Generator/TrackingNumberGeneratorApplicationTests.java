package com.shaik.TrackingNumber_Generator;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
@RunWith(SpringRunner.class)
@SpringBootTest
class TrackingNumberGeneratorApplicationTests {
	
	@Autowired
    private MockMvc mockMvc;

	 @Test
	    public void testGenerateTrackingNumber() throws Exception {
	        mockMvc.perform(get("/api/tracking/next-tracking-number")
	                        .param("originCountryId", "MY")
	                        .param("destinationCountryId", "ID")
	                        .param("weight", "2.5")
	                        .param("createdAt", "2025-03-14T10:00:00+00:00")
	                        .param("customerId", "de619854-b59b-425e-9db4-943979e1bd49")
	                        .param("customerName", "RedBox Logistics")
	                        .param("customerSlug", "redbox-logistics"))
	               .andExpect(status().isOk())
	               .andExpect(jsonPath("$.tracking_number").exists())
	               .andExpect(jsonPath("$.created_at").exists());
	    }
}
