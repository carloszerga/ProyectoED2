/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Interfaz.PaginaPersonal;
import Vista.VistaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author CARLOS
 */
public class ControladorValidacion implements ActionListener{
    private PaginaPersonal ventana;
    
    public ControladorValidacion(VistaCliente vision){
        ventana=vision;
    }
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equals(PaginaPersonal.VALIDAR)){
            ventana.validar();
        }
    }
    
}
