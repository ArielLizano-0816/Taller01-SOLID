/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller01_solid;

/**
 *
 * @author ariel
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compra {
    	private final List<Articulo> articulos = new ArrayList<>();
    
   	public void agregarArticulo(Articulo articulo){
        	articulos.add(articulo);
   	}
   	public void removerArticulo(Articulo articulo){
       		//remover un articulo a la compra
		articulos.remove(articulo);
	}

	public double calcularSubtotal(){
		double total = 0;
		for(Articulo a : articulos){
			total += a.getPrecio();
		}
		return total;
	}
	public List<Articulo> getArticulos(){
		return Collections.unmodifiableList(articulos);
	}
}
