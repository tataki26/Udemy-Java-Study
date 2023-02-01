package com.udemyjava.learnspringframework.sample.enterprise.flow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// web layer - UI
// sending response in the right format(JSON, XML, ...)
// use RestController to return data as JSON format
// REST API: data as response
@RestController
public class Controller
{
	// mapping: define what URL does
	// GetMapping: mapping HTTP GET request with a handler method
	// "/sum" => 100
	@GetMapping("/sum")
	public long displaySum() {
		// hard coding
		return 100;
	}
}

// business logic
class BusinessService {
	
}

// getting data
class DataService {
	
}