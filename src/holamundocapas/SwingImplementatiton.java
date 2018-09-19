/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundocapas;

import holamundocapas.view.View;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Class for the Swing implementation of the HelloWorldWithTiers app.
 * @author Iker
 */
public class SwingImplementatiton  implements View{
    /**
     * Shows a greeting in a Message window.
     * @param greeting The greeting.
     */
    @Override
    public void showGreeting(String greeting) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       JFrame frame=new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JOptionPane.showMessageDialog(frame, greeting,"Result", JOptionPane.ERROR_MESSAGE);
       frame.dispose();
    }
    
}
