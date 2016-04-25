package pe.com.peru.Inka.webapp.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.peru.Inka.service.services.PeruInkaService;
import pe.com.peru.Inka.service.util.Cliente;
//import pe.com.peru.Inka.service.util.Productos;
@Controller
public class DashboardController {
	
	@Autowired
	private PeruInkaService peruInkaService;

	@RequestMapping(value="home/DashBoard", method=RequestMethod.GET)
	public String homesDashboard(Model model, HttpServletRequest request){
		model.addAttribute("listCliente",peruInkaService.findAllCliente() );
		return "home/DashBoard";
	}
	@RequestMapping(value="home/frmCliente", method=RequestMethod.GET)
	public String NewClient(Model model, HttpServletRequest request){
		model.addAttribute("cliente", new Cliente() );
		System.out.println("home/frmCliente");
		return "home/frmCliente";
	}
	@RequestMapping(value="home/salvarCliente", method=RequestMethod.POST)
	public String salvarCliente(Model model, HttpServletRequest request, @ModelAttribute("cliente") Cliente cliente){
		peruInkaService.salvarCliente(cliente);
		System.out.println("home/salvarCliente");
		return "redirect:DashBoard";
		
	}
	
	
}
