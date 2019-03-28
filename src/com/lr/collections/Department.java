package com.lr.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Department {
	
	private String name;
	private String[] empName;
	private List<Employee> empList;
	private Set<Employee> empSet;
	private Map<String, Employee> empMap;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getEmpName() {
		return empName;
	}
	public void setEmpName(String[] empName) {
		this.empName = empName;
	}
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public Set<Employee> getEmpSet() {
		return empSet;
	}
	public void setEmpSet(Set<Employee> empSet) {
		this.empSet = empSet;
	}
	
	public Map<String, Employee> getEmpMap() {
		return empMap;
	}
	public void setEmpMap(Map<String, Employee> empMap) {
		this.empMap = empMap;
	}	
	
	
}
