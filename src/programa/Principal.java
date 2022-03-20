/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import vistas.*;

/**
 *
 * @author Agustin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaRegistrarVenta vista1 = new VistaRegistrarVenta();
        VistaAutenticacion vista2 = new VistaAutenticacion();
        VistaGestionarProducto vista3 = new VistaGestionarProducto();
        VistaAltaProducto vista4 = new VistaAltaProducto();
        
        vista1.setVisible(true);
        vista2.setVisible(false);
        vista3.setVisible(false);
        vista4.setVisible(false);
    }
    
}
