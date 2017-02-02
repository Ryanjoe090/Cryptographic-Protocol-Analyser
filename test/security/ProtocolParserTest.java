/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Think
 */
public class ProtocolParserTest {
    
    public ProtocolParserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of parseProtocol method, of class ProtocolParser.
     */
    @Test
    public void testParseProtocol() {
        System.out.println("parseProtocol");
        String protocol = "A->B: {[NA,A]}pk(B)";
        ProtocolParser instance = new ProtocolParser();
        Protocol expResult = null;
        Protocol result = instance.parseProtocol(protocol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
