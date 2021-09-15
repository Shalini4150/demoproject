package org.tst;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	    @Test
	    public void tst1() {
			System.out.println("be a man");

		}
	    @Test
	    public void tst2() {
			System.out.println("be a king");

		}
	    @Test
	    public void tst3() {
			System.out.println("be a kindable");

		}
	    
	    @Before
	    public void before() {
	    	System.out.println(" before  thattividu");
}
	    @After
	    public void after() {
			System.out.println(" after   ethuku");

		}
	    @AfterClass
	    public static void afterclass() {
			System.out.println(" afterclass  mudiyathu");
		}
	    @BeforeClass
	    public static void beforeclass() {
		      System.out.println("beforeclass    mudiyum");
		}
	    

}
