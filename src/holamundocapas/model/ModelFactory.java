/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundocapas.model;

import holamundocapas.model.Model;

/**
 *
 * @author Iker
 */
public class ModelFactory {
    
    public static Model getModel(){
        return new ModelImplementation();
    }
    
}
