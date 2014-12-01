/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Interfaz.PaginaOpciones;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author CARLOS
 */
public class OpcionesCliente extends JPanel implements PaginaOpciones {
    JTabbedPane toques;
    public OpcionesCliente(){
        configuracionBasica();
    }
    public void configuracionBasica(){
        toques=new JTabbedPane();
        toques.addTab("Hacer Pedido", new VistaRepartidor());
        toques.addTab("Estado de los Pedidos", new VistaAdministrador());
        toques.addTab("Configuraciones del Cliente", new VistaAdministrador());
        add(toques);
    }
}
