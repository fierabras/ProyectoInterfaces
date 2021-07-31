/*
 * Esta es la clase Main donde inicia el programa
 */
package controlador;

import vista.VentanaPrincipal;

/**
 * Jesus Armando Mendoza Romero
 * A171117
 * Diseño de Interfaces - virtual
 * Ingenieria de Software - Universidad Autónoma de Chihuahua
 * */
public class ProyectoInterfaces {
    
    public static void main(String[] args){
        
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);        
        ControladorVentanaPrincipal controlVentanaPrincipal = new ControladorVentanaPrincipal(ventanaPrincipal);       
        
    }
    
}
