package tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.CDB;

@RunWith(Parameterized.class)
public class RendimentoBrutoTest {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{60, 1000, 8.5, 13.97}, {120, 500, 8, 13.15}, {240, 3000, 9, 177.53}
		});
	}
	
	private int n;
	private double p, i, result;

	public RendimentoBrutoTest(int n, double p, double i, double result) {
		this.n = n;
		this.p = p;
		this.i = i;
		this.result = result;
	}

	@Test
	public void RedimentoBrutoTest() {
		assertEquals(13.97, CDB.redimento_bruto(60, 1000.00, 22.5), 0.01);
	}
	
	@Test
	public void RedimentoBrutoTest2() {
		assertEquals(13.15, CDB.redimento_bruto(120, 500.00, 8.0), 0.01);
		
	}
	
	@Test 
	public void RendimentoBrutoTest3() {
		assertEquals(result, CDB.redimento_bruto(n, p, i), 0.1);
	}

}
