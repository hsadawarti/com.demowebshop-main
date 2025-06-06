package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Baseclass;
import com.pages.Page_computers;

public class Tc_computers {
	Baseclass base = new Baseclass();
	
	@BeforeTest
	public void browserLaunch() {
		try {
			base.setup();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void computers() throws Exception {
		
		Page_computers pr = new Page_computers(base.getdriver());
		pr.computers();
	}
	
//	@AfterTest
//	public void browserClose() {
//		base.teardown();
//	}
	
}
