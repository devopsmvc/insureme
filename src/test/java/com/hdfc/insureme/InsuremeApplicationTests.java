package com.hdfc.insureme;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InsuremeApplicationTests {

	@Test
	void contextLoads() {
	}
	
//	@Test
//	public void testCreatePolicy() throws Exception {
//	    Policy policy = new Policy();
//	    policy.setPolicyName("Mahesh");
//	    policy.setPolicyNumber(12345);
//
//	    ObjectMapper mapper = new ObjectMapper();
//	    String json = mapper.writeValueAsString(policy);
//
//	    MockMvc.perform(post("/createPolicy")
//	        .contentType(MediaType.APPLICATION_JSON)
//	        .content(json))
//	        .andExpect(status().isOk())
//	        .andExpect(jsonPath("$.name", is("Test Policy")))
//	        .andExpect(jsonPath("$.number", is(1000)));
//	}
//	
//	@Test
//	public void testUpdatePolicy() throws Exception {
//	    Policy policy = new Policy();
//	    policy.setName("Test Policy Updated");
//	    policy.setAmount(2000);
//
//	    ObjectMapper mapper = new ObjectMapper();
//	    String json = mapper.writeValueAsString(policy);
//
//	    mockMvc.perform(put("/updatePolicy/1")
//	        .contentType(MediaType.APPLICATION_JSON)
//	        .content(json))
//	        .andExpect(status().isOk())
//	        .andExpect(jsonPath("$.name", is("Test Policy Updated")))
//	        .andExpect(jsonPath("$.amount", is(2000)));
//	}
//	
//	@Test
//	public void testViewPolicy() throws Exception {
//	    mockMvc.perform(get("/viewPolicy/1"))
//	        .andExpect(status().isOk())
//	        .andExpect(jsonPath("$.name", is("Test Policy")))
//	        .andExpect(jsonPath("$.amount", is(1000)));
//	}
//	
//	@Test
//	public void testDeletePolicy() throws Exception {
//	    mockMvc.perform(delete("/deletePolicy/1"))
//	        .andExpect(status().isOk());
//	}

}
