package com.huangyu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.huangyu.bean.Employee;

/**
 * 690. Employee Importance
 * 
 * @author huangyu
 *
 */
public class EmployeeImportance {

	public int getImportance(List<Employee> employees, int id) {
		Map<Integer, Employee> map = new HashMap<>();
		for (Employee employee : employees) {
			map.put(employee.id, employee);
		}
		return ecursionImportance(map, id);
	}

	private int ecursionImportance(Map<Integer, Employee> map, int rootId) {
		Employee parent = map.get(rootId);
		int totalImportance = parent.importance;
		for (int subordinate : parent.subordinates) {
			totalImportance += ecursionImportance(map, subordinate);
		}
		return totalImportance;
	}

}
