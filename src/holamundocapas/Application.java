/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundocapas;

import holamundocapas.view.ViewFactory;
import holamundocapas.model.ModelFactory;
import holamundocapas.controller.Controller;

/**
 * Aplicacion para el HolaMundo con capas
 * @author Iker
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
       
        Controller controller = new Controller();
        controller.run(ModelFactory.getModel(), ViewFactory.getView());
    }
    
}
