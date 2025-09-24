package sbi.loan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PracticeTest {
	Practice p1=new Practice();
	@Test
	public void addTest()
	{
		int extected=p1.add(50, 40);
		int actuaresult=90;
		assertEquals(extected, actuaresult);
	}
}
