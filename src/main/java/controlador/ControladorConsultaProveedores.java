
package controlador;

import fabricaVentanas.ConsultaProveedores;
import fabricaVentanas.GeneradorFabricas;
import fabricaVentanas.IFabrica;
import fabricaVentanas.IVista;
import fabricaVentanas.VistaProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class ControladorConsultaProveedores implements ActionListener{
    private ConsultaProveedores consultaProveedores;   
    private int selectedRow;

      
    public ControladorConsultaProveedores(ConsultaProveedores consultaProveedores) {
        this.consultaProveedores = consultaProveedores;        
        this.consultaProveedores.botonNuevoProveedor.addActionListener(this);
        this.consultaProveedores.botonModificarProveedor.addActionListener(this);        
        this.consultaProveedores.jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
              if (e.getClickCount() == 1) {
                selectedRow = consultaProveedores.jTable1.getSelectedRow();                
                System.out.println("La linea Seleccionada es " + selectedRow);
              }
            }
            });      
    }          
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (consultaProveedores.botonNuevoProveedor.isFocusOwner()){
            IFabrica iFabrica = GeneradorFabricas.getFabrica("proveedores");
            IVista iVistaP = iFabrica.crearVista();
            iVistaP.iniciar();       
        }
        if (consultaProveedores.botonModificarProveedor.isFocusOwner()){
            IFabrica iFabrica = GeneradorFabricas.getFabrica("proveedores");
            VistaProveedor vistaProveedor = (VistaProveedor)iFabrica.crearVista();  
            vistaProveedor.modificar(consultaProveedores,vistaProveedor,selectedRow);
    
        }
 
    }
     
}
