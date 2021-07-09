package com.devblogs.params;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import com.devblogs.beans.Employee;

@Component
@ConfigurationProperties("key1")
public class Params {
	private List<Employee> employees;
	
	@Value("${key2.param1}")
	private String param1;
	
	public String getParam1() {
		return param1;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}