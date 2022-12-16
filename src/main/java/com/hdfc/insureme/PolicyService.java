package com.hdfc.insureme;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
//	Policy[] policy = new Policy[10];
//	
//	
//	public PolicyService()
//	{		
//		policy[0] = new Policy(1,"abc", 9876452);
//		policy[1] = new Policy(2,"xyz", 3763582);
//		policy[2] = new Policy(3,"asf", 9876452);
//	}
//  
	
	@Autowired
	PolicyRepository PolicyRepository;
	
	public Policy CreatePolicy() {
		Policy e = new Policy(12345, "Mahesh", 98765);
		//policy[3] = e;
		return e;
		
	}
	
	public Policy UpdatePolicy(Policy Policy) {
		return PolicyRepository.save(Policy);
	}

		
	public List<Policy> ViewPolicy() {
		//PolicyService p = new PolicyService();
		return PolicyRepository.getById(Policy);
	}

	public Policy ViewPolicy() {
		return PolicyRepository.findById(PolicyID).get();
	}
	
	public Policy DeletePolicy(int policyID) {
		return PolicyRepository.deleteById(policyID);
	}

}
