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
public class ParserTest {
    
    public ParserTest() {
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
     * Test of parse method, of class Parser.
     */
    @Test
    public void testParse() {
        System.out.println("parse");
        String masterString = "[{[NA,NB]}pk(A),h(key),h({{NONCE}sk(T)}pk(U))]";
        Parser instance = new Parser();
        String expResult = "[NB,NA]";
        Term result = instance.parse(masterString);
        assertEquals(expResult, result.getTermString());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of parseList method, of class Parser.
     */
    @Test
    public void testParseList() {
        System.out.println("parseList");
        String userList = "";
        Parser instance = new Parser();
        Term expResult = null;
        Term result = instance.parseList(userList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parseEncryption method, of class Parser.
     */
    @Test
    public void testParseEncryption() {
        System.out.println("parseEncryption");
        String paramTerm = "";
        Parser instance = new Parser();
        Term expResult = null;
        Term result = instance.parseEncryption(paramTerm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parseKey method, of class Parser.
     */
    @Test
    public void testParseKey() {
        System.out.println("parseKey");
        String keyString = "";
        Parser instance = new Parser();
        Term expResult = null;
        Term result = instance.parseKey(keyString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parseHash method, of class Parser.
     */
    @Test
    public void testParseHash() {
        System.out.println("parseHash");
        String hashString = "";
        Parser instance = new Parser();
        Term expResult = null;
        Term result = instance.parseHash(hashString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parseVariable method, of class Parser.
     */
    @Test
    public void testParseVariable() {
        System.out.println("parseVariable");
        String variableString = "";
        Parser instance = new Parser();
        Term expResult = null;
        Term result = instance.parseVariable(variableString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
