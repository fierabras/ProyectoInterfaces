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
public class FabricaMaterial implements IFabrica {

    @Override
    public IVista crearVista() {
        return new VistaMaterial();
    }

    @Override
    public IConsulta crearConsulta() {
        return new ConsultaMateriales();
    }
    
}
