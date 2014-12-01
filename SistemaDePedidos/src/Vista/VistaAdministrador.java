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
import javax.swing.JPasswordField;

/**
 *
 * @author CARLOS
 */
public class VistaAdministrador extends JPanel implements PaginaPersonal {
    public VistaAdministrador(){
        super(new FlowLayout());
        JButton opciones=new JButton("Administrador");
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
