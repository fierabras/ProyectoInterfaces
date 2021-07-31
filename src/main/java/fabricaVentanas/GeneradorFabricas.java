/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaVentanas;

/**
 *
 * @author /**
 */
public class GeneradorFabricas {
    
    private IFabrica fabrica;
    private IVista vistaProveedor;
    private IConsulta consultaProveedores;
    
    public static IFabrica getFabrica(String param){
        if (param == "proveedores"){
            return new FabricaProveedor();
        }
        if (param== "materiales"){
            return new FabricaMaterial();
        }
        return null;
    }
    
    
    
    
    public void AplicacionFabrica(IFabrica fabrica){
        this.fabrica = fabrica;
    
    }
    
    public void crearVista(){
        this.vistaProveedor = fabrica.crearVista();
    }
    
    public void iniciar(){
        vistaProveedor.iniciar();
    }
    
}
