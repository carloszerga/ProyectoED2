/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.design;

import dao.to.RepartidorTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLOS
 */
public interface IRepartidorDAO {
    public abstract ArrayList<RepartidorTO> listaRepartidor();
    public abstract String insertarRepartidor(RepartidorTO repartidor);
    public abstract String actualizarRepartidor(RepartidorTO repartidor);
    public abstract String eliminarRepartidor(List<Integer> idrepartidor);
    public abstract RepartidorTO datoRepartidorporId(Integer id);
    public abstract RepartidorTO repartidorLogin(String usuario, String pwd);
}
