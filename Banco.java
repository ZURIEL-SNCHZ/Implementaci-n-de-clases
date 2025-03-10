/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author Zuriel Ali Sampé Sánchez
 */
public class Banco {

    public static void main(String[] args) {
        Usuario usuario=new Usuario("Zuriel Ali",500000);
        CajeroAutomatico cajero= new CajeroAutomatico();
        cajero.consultaeSaldo(usuario);
        cajero.depositar(usuario,500);
        cajero.retirar(usuario,300);
        cajero.retirar(usuario, 1000000);
        cajero.consultaeSaldo(usuario);
    }
}
