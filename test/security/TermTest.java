/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.util.LinkedList;
import java.util.List;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import security.Term.Type;

/**
 *
 * @author ryanrobinson
 */
public class TermTest {
    
    public TermTest() {
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
     * Test of encrypt method, of class Term.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        Term encryptee = null;
        Term key = null;
        Term expResult = null;
        Term result = Term.encrypt(encryptee, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class Term.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        Term decryptee = null;
        Term key = null;
        List<Term> expResult = null;
        List<Term> result = Term.decrypt(decryptee, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerAsymmetic method, of class Term.
     */
    @Test
    public void testRegisterAsymmetic() {
        System.out.println("registerAsymmetic");
        Term agent = null;
        List<Term> expResult = null;
        List<Term> result = Term.registerAsymmetic(agent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hash method, of class Term.
     */
    @Test
    public void testHash() {
        System.out.println("hash");
        Term hashee = new Term("NONCE",Type.FRESH, 0);
        Term expResult = new Term("h(NONCE)",Type.HASH, 1);
        expResult.setSubTerms(hashee);
        Term result = Term.hash(hashee);
        assertEquals(expResult.getTermString(), result.getTermString());
        assertEquals(expResult.getArity(), result.getArity());
        assertEquals(expResult.getType(), result.getType());
        assertEquals(expResult.getSubTerms(), result.getSubTerms());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTermString method, of class Term.
     */
    @Test
    public void testGetTermString() {
        System.out.println("getTermString");
        Term instance = new Term();
        String expResult = "";
        String result = instance.getTermString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

    /**
     * Test of createList method, of class Term.
     */
    @Test
    public void testCreateList() {
        System.out.println("createList");
        LinkedList<Term> myStack = new LinkedList();
        Term item1 = new Term("NA",Type.FRESH, 0);
        Term item2 = new Term("h(KEY)",Type.HASH, 1);
        Term item3 = new Term("NB",Type.FRESH, 0);
        myStack.add(item3);
        myStack.add(item2);
        myStack.add(item1);
        //Term instance = new Term();
        String expResult = "[NA, h(KEY), NB]";
        Term result = Term.createList(myStack);
        assertEquals(expResult, result.getTermString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
