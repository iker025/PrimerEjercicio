/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundocapas;

import holamundocapas.view.View;
import holamundocapas.view.ViewFactory;
import holamundocapas.model.ModelFactory;
import holamundocapas.model.Model;
import holamundocapas.controller.Controller;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iker
 */
public class ControllerIT {
    
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut; 
    
    @Before
    public void setUp() {
        testOut=new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class Controller.
     */
    @Test
    public void testRun() {
        Model model=ModelFactory.getModel();
        View view=ViewFactory.getView();
        Controller controller=new Controller();
        
        String greeting=model.getGreeting();
        controller.run(model, view);
        assertEquals("Shown greeting is not correct!!", greeting+"\n",testOut.toString());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
