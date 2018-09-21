/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundocapas.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;



/**
 *
 * @author Iker
 */

public  class JavaFXViewImplementation extends Application implements View {
    
    private static String greeting;
 
    @Override
    public void start(Stage stage) throws Exception{
        /**
         * Carga el FXMLDocument y lo muestra
         * Aqui fallan dos lineas
         */
        FXMLLoader loader = new FXMLLoader((getClass().getResource("FXMLDocument.fxml")));
        
        Parent root =loader.load();//Cargo el archivo XML donde esta cargada mi vista
        
        
         FXMLDocumentController controller = loader.getController();//Obtener el controladorFXML del documento
         controller.setGreeting(greeting);//Pasar el greeting al controladorFXML
        
        
        
        Scene scene = new Scene(root);//Crear una scene
        stage.setScene(scene);//Asociar el scene a una stage9/
        stage.show(); //Mostrar stage
       
    }
    
    @Override
    public void showGreeting(String greeting){
        /**
         * Guarda el greeting en un atributo y lanza el JavaFX
         */
        JavaFXViewImplementation.greeting=greeting;
        
        launch();//lanza aplicacion
    }
  public void setGreeting(String greeting){
      this.greeting = greeting;
  }
   
}
