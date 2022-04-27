/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public abstract class Conversor {
    
    public abstract String getTipo();
    
    //Obtiene el rotulo para el text filed 1
    public abstract String getLabel1();
    
    //Obtiene el rotulo para el text filed 2
    public abstract String getLabel2();
    
    public abstract Double convertirValorUnoaValorDos(Double valorUno);
    
    public abstract Double convertirValoDosaValorUno(Double valorDos);
}
