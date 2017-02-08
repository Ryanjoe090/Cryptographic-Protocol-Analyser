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
public class EnvironmentTest {
    
    public EnvironmentTest() {
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
     * Test of run method, of class Environment.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        ProtocolParser parser = new ProtocolParser();
        Protocol protocol = parser.parseProtocol("pray4ryan");
        Environment instance = new Environment(protocol);
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAgent method, of class Environment.
     */
    @Test
    public void testCreateAgent() {
        System.out.println("createAgent");
        String name = "";
        Environment instance = null;
        instance.createAgent(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeStep method, of class Environment.
     */
    @Test
    public void testTakeStep() {
        System.out.println("takeStep");
        int runIdentifier = 0;
        Environment instance = null;
        instance.takeStep(runIdentifier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
