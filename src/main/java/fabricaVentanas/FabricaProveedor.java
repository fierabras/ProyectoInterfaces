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
public class FabricaProveedor implements IFabrica {

    @Override
    public IVista crearVista() {
        return new VistaProveedor();
    }

    @Override
    public IConsulta crearConsulta() {
        return new ConsultaProveedores();
    }
    
}
