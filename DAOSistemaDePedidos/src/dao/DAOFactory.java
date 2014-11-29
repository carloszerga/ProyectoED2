/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import dao.component.*;
import dao.design.*;

/**
 *
 * @author CARLOS
 */
public class DAOFactory {
    
    private static DAOFactory daoFac;
    static{
        daoFac=new DAOFactory();
    }
    public static DAOFactory getInstance(){
        return daoFac;
    }
    public IClienteDAO getClienteDAO(){
        return new ClienteDAO();
    }
    public IDetalle_PedidoDAO getDetalle_PedidoDAO(){
        return new Detalle_PedidoDAO();
    }
    public IFacturaDAO getFacturaDAO(){
        return new FacturaDAO();
    }
    public IPedidoDAO getPedidoDAO(){
        return new PedidoDAO();
    }
    public IProductoDAO getProductoDAO(){
        return new ProductoDAO();
    }
    public IRepartidorDAO getRepartidorDAO(){
        return new RepartidorDAO();
    }
}