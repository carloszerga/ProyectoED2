/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import javax.swing.JPasswordField;

/**
 *
 * @author CARLOS
 */
public interface PaginaPersonal {
    static final int DNI=8;
    static final String LOGIN="Panel de Sesion";
    static final String FLUJO="Panel de Flujo";
    static final String VALIDAR="Ingresar al Sistema";
    void validar();
    void reiniciar();
}
