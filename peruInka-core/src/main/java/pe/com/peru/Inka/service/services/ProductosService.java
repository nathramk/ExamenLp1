package pe.com.peru.Inka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peru.Inka.service.util.Productos;
@Service("productosService")
public class ProductosService {

	public static List<Productos> listProduct=new ArrayList<Productos>();
	
	public void GuardarProductos(Productos productos){
		listProduct.add(productos);
	}
	public List<Productos> findAllProductos(){
		return listProduct;
	}
}
