/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import fabricaVentanas.ConsultaMateriales;
import fabricaVentanas.GeneradorFabricas;
import fabricaVentanas.IFabrica;
import fabricaVentanas.IVista;
import fabricaVentanas.VistaMaterial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author /**
 */
public class ControladorConsultaMateriales implements ActionListener{
    private ConsultaMateriales consultaMateriales;
    private int selectedRow;

      
    public ControladorConsultaMateriales(ConsultaMateriales consultaMateriales) {
        this.consultaMateriales = consultaMateriales;        
        this.consultaMateriales.botonNuevoMaterial.addActionListener(this);
        this.consultaMateriales.botonModificarMaterial.addActionListener(this);        
        this.consultaMateriales.jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
              if (e.getClickCount() == 1) {
                selectedRow = consultaMateriales.jTable1.getSelectedRow();                
                System.out.println("La linea Seleccionada es " + selectedRow);
              }
            }
            });         
    }          
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Se ha presionado el boton nuevo proveedor");        
        
        
        if (consultaMateriales.botonNuevoMaterial.isFocusOwner()){
            IFabrica iFabrica = GeneradorFabricas.getFabrica("materiales");
            IVista iVistaM = iFabrica.crearVista();
            iVistaM.iniciar();
        }
        
        
        if (consultaMateriales.botonModificarMaterial.isFocusOwner()){
            IFabrica iFabrica = GeneradorFabricas.getFabrica("materiales");
            VistaMaterial vistaMaterial = (VistaMaterial)iFabrica.crearVista();  
            vistaMaterial.modificar(consultaMateriales,vistaMaterial,selectedRow);    
        }
 
    }

    
}
