/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import security.Agent.Status;
import security.Term.Type;

/**
 *
 * @author Think
 */
public class AgentTest {
    
    public AgentTest() {
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
     * Test of setRole method, of class Agent.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        Role role = null;
        Agent instance = null;
        instance.setRole(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKnowledge method, of class Agent.
     */
    @Test
    public void testSetKnowledge() {
        System.out.println("setKnowledge");
        List<Term> knowledge = null;
        Agent instance = null;
        instance.setKnowledge(knowledge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addKnowledge method, of class Agent.
     */
    @Test
    public void testAddKnowledge() {
        System.out.println("addKnowledge");
        Term term = null;
        Agent instance = null;
        instance.addKnowledge(term);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of correctVariable method, of class Agent.
     */
    @Test
    public void testCorrectVariable() {
        System.out.println("correctVariable");
        Term newTerm = new Term("Alice", Type.PUBLIC, 0);
        Term oldVariable = new Term("A", Type.VARIABLE,0);
        Parser parser = new Parser();
        Term term = parser.parse("[B,C,D,E,F,A,{h({[A,pk(A)]}pk(S))}pk(A),pk(A)]");
        Agent instance = new Agent("Alice", Status.PARTICIPANT, 0);
        instance.addKnowledge(term);
        instance.correctVariable(newTerm, oldVariable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of correctSubTerms method, of class Agent.
     */
    @Test
    public void testCorrectSubTerms() {
        System.out.println("correctSubTerms");
        Term newTerm = null;
        Term oldVariable = null;
        Term tree = null;
        Agent instance = null;
        instance.correctSubTerms(newTerm, oldVariable, tree);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Agent.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Agent instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRunIdentifier method, of class Agent.
     */
    @Test
    public void testGetRunIdentifier() {
        System.out.println("getRunIdentifier");
        Agent instance = null;
        int expResult = 0;
        int result = instance.getRunIdentifier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class Agent.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Agent instance = null;
        Role expResult = null;
        Role result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStepCounter method, of class Agent.
     */
    @Test
    public void testGetStepCounter() {
        System.out.println("getStepCounter");
        Agent instance = null;
        int expResult = 0;
        int result = instance.getStepCounter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementStep method, of class Agent.
     */
    @Test
    public void testIncrementStep() {
        System.out.println("incrementStep");
        Agent instance = null;
        instance.incrementStep();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
