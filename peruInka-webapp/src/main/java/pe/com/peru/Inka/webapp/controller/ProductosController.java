package pe.com.peru.Inka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.peru.Inka.service.services.ProductosService;
//import pe.com.peru.Inka.service.util.Cliente;
import pe.com.peru.Inka.service.util.Productos;
import sun.print.resources.serviceui;

@Controller
public class ProductosController {
	@Autowired
	private ProductosService productosService;
	//PRODUCTOSSSSSSSSSS
		@RequestMapping(value="home/dashboardProducto", method=RequestMethod.GET)
		public String GuardarProductos(Model model, HttpServletRequest request){
			model.addAttribute("listProduct",productosService.findAllProductos() );
			return "home/dashboardProducto";
		}
		@RequestMapping(value="home/frmProducto", method=RequestMethod.GET)
		public String NewProduct(Model model, HttpServletRequest request){
			model.addAttribute("productos", new Productos() );
			System.out.println("home/frmProducto");
			return "home/frmProducto";
		}
		@RequestMapping(value="home/GuardarProductos", method=RequestMethod.POST)
		public String GuardarProductos(Model model, HttpServletRequest request, @ModelAttribute("productos") Productos productos){
			productosService.GuardarProductos(productos);
			System.out.println("home/GuardarProductos");
			return "redirect:dashboardProducto";
		}
}
