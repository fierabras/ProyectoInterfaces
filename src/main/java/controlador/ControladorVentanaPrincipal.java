
package controlador;


import fabricaVentanas.ConsultaProveedores;
import fabricaVentanas.GeneradorFabricas;
import fabricaVentanas.IConsulta;
import fabricaVentanas.IFabrica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaPrincipal;

/**
 *
 * @author /**
 */
public class ControladorVentanaPrincipal implements ActionListener {
    
    private VentanaPrincipal ventanaPrincipal;   

      
    public ControladorVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;        
        this.ventanaPrincipal.botonProveedores.addActionListener(this);
        this.ventanaPrincipal.botonMateriales.addActionListener(this);
    }
          
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Se ha presionado el boton proveedor");        
        
        
        if (ventanaPrincipal.botonProveedores.isFocusOwner()){                           
            System.out.println("Se muestra la consulta de proveedores");
            IFabrica iFabrica = GeneradorFabricas.getFabrica("proveedores");
            IConsulta iConsultaP = iFabrica.crearConsulta();            
            iConsultaP.iniciar();
            
        }
        if (ventanaPrincipal.botonMateriales.isFocusOwner()){                           
            System.out.println("Se muestra la consulta de materiales");
            IFabrica iFabrica = GeneradorFabricas.getFabrica("materiales");
            IConsulta iConsultaM = iFabrica.crearConsulta();
            iConsultaM.iniciar();
        }
    }
    
}
