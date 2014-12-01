/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;

import Controlador.ControladorPrincipal;
import Vista.VistaPrincipal;

/**
 *
 * @author CARLOS
 */
public class Inicio {
    
    public static void main(String [] args){
        //modelo, se crea un modelo
        
        //vista, se crea una vista
        VistaPrincipal vista=new VistaPrincipal();
        //controlador,se crea un controlador con la vista y el modelo
        //ControladorPrincipal controlador=new ControladorPrincipal(vista);
        //configura La vista la vista se configura con el controlador
        //vista.setControlador(controlador);
        //arranca la vista se inicia la vista
        vista.arranca();
    }
    
}
