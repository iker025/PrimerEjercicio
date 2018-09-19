/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundocapas.controller;

import holamundocapas.model.Model;
import holamundocapas.view.View;

/**
 *
 * @author Iker
 */
public class Controller {
    
    public void run(Model model, View view){
        
        String greeting=model.getGreeting();
        view.showGreeting(greeting);
    }

    void run(View view, Model model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

  
}
