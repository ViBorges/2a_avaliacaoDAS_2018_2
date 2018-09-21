package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.CDB;

public class RendimentoBrutoTest {
	
	private int n;
	private double p, i, result;

	/*public RendimentoBrutoTest(int n, double p, double i, double result) {
		this.n = n;
		this.p = p;
		this.i = i;
		this.result = result;
	}*/

	@Test
	public void RedimentoBrutoTest() {
		assertEquals(13.97, CDB.redimento_bruto(60, 1000.00, 22.5), 0.01);
	}
	
	@Test
	public void RedimentoBrutoTest2() {
		assertEquals(13.15, CDB.redimento_bruto(120, 500.00, 8.0), 0.01);
		
	}

}
