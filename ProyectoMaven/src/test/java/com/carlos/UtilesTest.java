package com.carlos;

import junit.framework.Assert;

import org.junit.Test;

public class UtilesTest {


	@Test
	public void testPrueba() {
		Utiles ut = new Utiles();
		
		Assert.assertTrue("Hola mundo".equals(ut.saluda("mundo")));
	}
	
	

}
