/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

/**
 *
 * @author CARLOS
 */
public class Validacion {
    public static boolean isNumber(String objeto){
        boolean flag=false;
        int dim=objeto.length(),i=0;
        char [] caracter=new char[dim];
        caracter=objeto.toCharArray();
        while(i<dim && flag){
            if(Character.isDigit(caracter[i])){
                flag=true;
            }
        }
        return false;
    }
    public static boolean isNumber(String objeto,int dim){
        if(objeto.length()==dim){
            return true;
        }
        else{
            return false;
        }
    }
}
