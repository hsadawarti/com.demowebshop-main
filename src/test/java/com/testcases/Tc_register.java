package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Baseclass;
import com.pages.Page_register;

public class Tc_register {
	Baseclass base = new Baseclass();
	
	@BeforeTest
	public void url_launch() {
		try {
			base.setup();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void register() throws Exception {
		Page_register pr = new Page_register(base.getdriver());
		pr.register();
//		base.teardown();
	}
}
