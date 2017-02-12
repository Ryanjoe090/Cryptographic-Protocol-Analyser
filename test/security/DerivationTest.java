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

/**
 *
 * @author Think
 */
public class DerivationTest {
    
    public DerivationTest() {
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
     * Test of breakdownTermList method, of class Derivation.
     */
    @Test
    public void testBreakdownTermList() {
        System.out.println("breakdownTermList");
        LinkedList<Term> myStack = new LinkedList();
        Term item1 = new Term("NA",Term.Type.FRESH, 0);
        Term item2 = new Term("h(KEY)",Term.Type.HASH, 1);
        Term item3 = new Term("NB",Term.Type.FRESH, 0);
        myStack.add(item3);
        myStack.add(item2);
        myStack.add(item1);
        //Term instance = new Term();
        //String expResult = "[NA, h(KEY), NB]";
        Term list = Term.createList(myStack);
        List<Term> expResult = null;
        List<Term> result = Derivation.breakdownTermList(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterateList method, of class Derivation.
     */
    @Test
    public void testIterateList() {
        System.out.println("iterateList");
        List<Term> finalList = null;
        Term tail = null;
        Derivation.iterateList(finalList, tail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
