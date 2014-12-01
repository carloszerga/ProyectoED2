/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Interfaz.PaginaPersonal;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author CARLOS
 */
public class VistaRepartidor extends JPanel implements PaginaPersonal {
    public VistaRepartidor(){
        super(new FlowLayout());
        JButton opciones=new JButton("Repartidor");
        add(opciones);
    }    

    @Override
    public void validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reiniciar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
