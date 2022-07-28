package org.smi;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecuteAll {
	@Test
	public void test() {
		Result res = JUnitCore.runClasses(Employee.class, Company.class,Client.class);
		
		System.out.println("RunCount :"+res.getRunCount());
		System.out.println("Ignore Count :"+res.getIgnoreCount());
		System.out.println("Failure Count :"+res.getFailureCount());
		System.out.println("Pass Count :"+(res.getRunCount()-res.getFailureCount()));
		
		List<Failure> failures = res.getFailures();
		for (Failure failure : failures) {
			System.out.println("Failed Methods"+failure);
		}
	}
}
