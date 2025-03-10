/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Zuriel Ali Sampé Sánchez
 */
public class CuentaBancaria {
    private double saldo;
    
    public CuentaBancaria(double saldoInicial){
        this.saldo=saldoInicial;
    }
    
public void depositar(double cantidad){
    if(cantidad>0) {
        saldo+=cantidad;
        System.out.println("Depósito exitoso. Nuevo saldo: $" +saldo) ;
    }else{
        System.out.println("La cantidad a depositar debe ser mayo a 0.") ;
    }   
}
public  boolean retirar(double cantidad){
    if (cantidad <0 && cantidad <=saldo){
         saldo-=cantidad;
         System.out.println("Retiro exitoso. Nuevo saldo $"+saldo);
         return true;
   }else{
           System.out.println("Fondo insuficiente o cantidad no válida");
           return false;
           
  }
}
  public double getSaldo(){
      return saldo;
      }
}
    
 



