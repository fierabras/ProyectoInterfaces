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
public interface IVista {
    
    public void iniciar();
    public void modificar(IConsulta consulta, IVista vista, int row);
    
}
