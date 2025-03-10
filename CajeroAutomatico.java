/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Zuriel Ali Sampé Sánchez
 */
public class CajeroAutomatico {
    public void consultaeSaldo(Usuario usuario){
        System.out.println("Saldoactual de"+usuario.getNombre()+":$"+usuario.getCuenta().getSaldo());
    } 
    
    public void depositar(Usuario usuario, double cantidad){
       usuario.getCuenta().depositar(cantidad);
    }
    
    public void retirar(Usuario usuario,double cantidad){
        usuario.getCuenta().retirar(cantidad);
    }
}
