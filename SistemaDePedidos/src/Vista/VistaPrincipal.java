/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.ControladorPrincipal;
import Interfaz.PaginaPersonal;
import Interfaz.PaginaPrincipal;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author CARLOS
 */
public final class VistaPrincipal extends JFrame implements PaginaPrincipal{
    
    public JPanel panelSuperior;
    public JPanel panelMedio;
    public JPanel panelInferior;
    public CardLayout cardLayout;
    public JButton btn1,btn2,btn3;
    
    
    private JTextField mensaje;
    
    
    public VistaPrincipal(){
        super("Tratamiento de un Supermercado");
        panelConfiguracion();
        panelSuperior();
        panelMedio();
        panelInferior();
    }
    public void panelConfiguracion(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void panelSuperior(){
        JLabel txt=new JLabel("Observaciones: ");
        mensaje=new JTextField(110);
        mensaje.setEditable(false);
        panelSuperior=new JPanel();
        panelSuperior.add(txt);
        panelSuperior.add(mensaje);
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Mensajes de Estado:"));
        panelSuperior.getPreferredSize();
    }
    public void panelInferior(){
        panelInferior=new JPanel(new BorderLayout(50,50));
        panelInferior=new JPanel();
        panelInferior.setBorder(BorderFactory.createTitledBorder("Opciones:"));
        panelInferior.setLayout(new FlowLayout());
        
        ControladorPrincipal c=new ControladorPrincipal(this);
        
        JButton aux=new JButton(PaginaPrincipal.ICLIENTE);
        aux.addActionListener(c);        
        panelInferior.add(aux);
        aux=new JButton(PaginaPrincipal.IREPARTIDOR);
        aux.addActionListener(c);
        panelInferior.add(aux);
        aux=new JButton(PaginaPrincipal.IADMINISTRADOR);
        aux.addActionListener(c);
        panelInferior.add(aux);
        
        panelInferior.getPreferredSize();
    }
    public void panelMedio(){
        panelMedio= new JPanel();
        cardLayout=new CardLayout();
        panelMedio.setLayout(cardLayout);
        panelMedio.add(new VistaCliente(), PaginaPrincipal.ICLIENTE);
        panelMedio.add(new VistaRepartidor(), PaginaPrincipal.IREPARTIDOR);
        panelMedio.add(new VistaAdministrador(), IADMINISTRADOR);
        panelMedio.setBorder(BorderFactory.createTitledBorder("Interfaz:"));
        panelMedio.getPreferredSize();
        
    }

    @Override
    public void arranca() {
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        add(panelSuperior,PaginaPrincipal.SUPERIOR);
        add(panelMedio,PaginaPrincipal.MEDIO);
        add(panelInferior,PaginaPrincipal.INFERIOR);
        getPreferredSize();
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setVisible(true);
        setSize(1365,730);
    }
    @Override
    public void insertarMensaje(String msj) {
        mensaje.setText(msj);
    }

    @Override
    public void reconstruir() {
        PaginaPersonal cliente=(PaginaPersonal)panelMedio.getComponent(0);
        cliente.reiniciar();
    }
}
