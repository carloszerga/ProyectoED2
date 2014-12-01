/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import Controlador.ControladorPrincipal;
import java.awt.event.ItemEvent;

/**
 *
 * @author CARLOS
 */
public interface PaginaPrincipal {
    void arranca();
    void insertarMensaje(String msj);
    static final String ICLIENTE="Interfaz Cliente";
    static final String IREPARTIDOR="Interfaz Repartidor";
    static final String IADMINISTRADOR="Interfaz Administrador";   
    static final String SUPERIOR="Panel Superior";
    static final String MEDIO="Panel Medio";
    static final String INFERIOR="Panel Inferior";
    void reconstruir();
}
