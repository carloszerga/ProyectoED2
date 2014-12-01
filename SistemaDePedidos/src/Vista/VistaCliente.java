/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.ControladorValidacion;
import Controlador.Validacion;
import Interfaz.PaginaPersonal;
import Interfaz.PaginaPrincipal;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

/**
 *
 * @author CARLOS
 */
public class VistaCliente extends JPanel implements PaginaPersonal {
    public JPasswordField password;
    public CardLayout cardLayout;
    public JPanel panelMedio;
    public JPanel sesion;
    public JPanel flujo;
    public VistaCliente(){
        super(new FlowLayout());
        
        panelSesion();
        panelFlujo();
        controlador();
        configuraciones();
        
    }
    private void panelSesion() {
        sesion=new JPanel();
        JLabel aux=new JLabel("DIgite su DNI:");
        sesion.add(aux);
        password=new JPasswordField(40);
        sesion.add(password);
        JButton activador=new JButton("Ingresar al Sistema");
        ControladorValidacion val=new ControladorValidacion(this);
        activador.addActionListener(val);
        sesion.add(activador);
    }

    private void configuraciones() {
        
        add(panelMedio);
        
        getPreferredSize();
    }

    @Override
    public void validar() {
        String dni=new String(password.getPassword());
        //if(Validacion.isNumber(dni, DNI)){
            //hacer la consulta en la base de datos
            
            if(true){// si la consulta es correcta
                JOptionPane.showMessageDialog(null,"LOL");
                cardLayout.show(panelMedio,PaginaPersonal.FLUJO);
                
            }
        //}
    }

    private void panelFlujo() {
        flujo=new OpcionesCliente();
    }

    private void controlador() {
        panelMedio=new JPanel();
        cardLayout=new CardLayout();
        panelMedio.setLayout(cardLayout);
        panelMedio.add(sesion,PaginaPersonal.LOGIN);
        panelMedio.add(flujo,PaginaPersonal.FLUJO);
        panelMedio.getPreferredSize();
    }

    @Override
    public void reiniciar() {
        cardLayout.show(panelMedio, LOGIN);
    }
}
