/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.patterns.Behavior.Visitor;

/**
 *
 * @author ns
 */
public class Lacteo extends Product{

    public Lacteo(String nombre, Double precio) {
        super(nombre, precio);
    }

    
    @Override
    public Double visit(Visitor visitante) {
     return visitante.visitProduct(this);
    }
    
  

    
}
