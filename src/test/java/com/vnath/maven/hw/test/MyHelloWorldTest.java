package com.vnath.maven.hw.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MyHelloWorldTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MyHelloWorldTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MyHelloWorldTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp2()
    {
    	assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp3()
    {
    	assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp4()
    {
    	assertTrue( false );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp5()
    {
    	assertTrue( false );
    }
}
