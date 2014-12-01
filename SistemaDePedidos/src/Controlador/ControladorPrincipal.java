/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Interfaz.PaginaPrincipal;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CARLOS
 */
public class ControladorPrincipal implements ActionListener {
    private VistaPrincipal ventana;
    
    
    public ControladorPrincipal(VistaPrincipal vision){
        ventana=vision;
    }
    @Override
    public void actionPerformed(ActionEvent evento) {
        ventana.reconstruir();
        switch (evento.getActionCommand()) {
            case PaginaPrincipal.ICLIENTE:
                ventana.cardLayout.show(ventana.panelMedio,PaginaPrincipal.ICLIENTE);
                break;
            case PaginaPrincipal.IREPARTIDOR:
                ventana.cardLayout.show(ventana.panelMedio,PaginaPrincipal.IREPARTIDOR);
                break;
            case PaginaPrincipal.IADMINISTRADOR:
                ventana.cardLayout.show(ventana.panelMedio,PaginaPrincipal.IADMINISTRADOR);
                break;
        }
    }
}
