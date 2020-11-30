
package com.mycompany.sistemacentralizadodos.principal;

import com.mycompany.sistemacentralizadodos.controladores.ProductoJpaController;
import com.mycompany.sistemacentralizadodos.entidades.Producto;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {


    public static void main(String[] args) {
        
        //TOMA LOS PARAMETROS ESTABLECIDOS DE LA CADENA DE CONEXIÓN 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        
        // LA CLASE CONTROLADORA RECIBE DE PARAMETRO UNA CADENA DE CONEXIÓN
        ProductoJpaController pjc = new ProductoJpaController(emf);
        
        Producto p = new Producto();
        
        p.setNombre("VINO");
        
        Double d1 = 10.35;
        
        BigDecimal bd1 = BigDecimal.valueOf(d1.doubleValue());
        
        p.setPrecio(bd1);
        
        pjc.create(p);
        
        
    }
    
}
