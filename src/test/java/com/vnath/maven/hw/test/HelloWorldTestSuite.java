package com.vnath.maven.hw.test;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HelloWorldTestSuite 
    {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   /* public MyHelloWorldTest( String testName )
    {
        super( testName );
    }*/

    /**
     * @return the suite of tests being tested
     */
	/*public static TestSuite suite()
    {
        return new TestSuite( MyHelloWorldTest.class );
    }*/
	
	

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp1()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp2()
    {
    	assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    @Test
    @Ignore("Ignoring temporarily")
    public void testApp3()
    {
    	assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp4()
    {
    	assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp5()
    {
    	assertTrue( true );
    }
}
