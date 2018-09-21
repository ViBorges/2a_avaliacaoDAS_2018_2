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
		assertEquals(13.97, CDB.redimentoBruto(60, 1000, 22.5), 0.1);
	}

}
