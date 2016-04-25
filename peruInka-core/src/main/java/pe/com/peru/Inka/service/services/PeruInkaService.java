package pe.com.peru.Inka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peru.Inka.service.util.Cliente;
//import pe.com.peru.Inka.service.util.Productos;

@Service("peruInkaService")
public class PeruInkaService {

public static List<Cliente> list = new ArrayList<Cliente>();
	
	public String salvarCliente(Cliente cliente){
		String validate = "ok";
		String message="ID YA EXISTE";
		for (Cliente objet : list) {
			if(objet.getID().compareTo(cliente.getID())==0){
				validate = "ERROR";
				continue;
			}
		}
		if(validate.equals("ok")){
			list.add(cliente);
			message="ok";
		}
		return message;
	}
	
	public List<Cliente> findAllCliente(){
		return list;
	}
	
	public void updateCliente(Cliente clienteUpdate){
		List<Cliente> listTemp = new ArrayList<Cliente>();
		
		for (Cliente cliente : list) {
			if(clienteUpdate.getID().compareTo(cliente.getID())==0){
				listTemp.add(clienteUpdate);
			}else{
				listTemp.add(cliente);
			}
		}
		list = new ArrayList<Cliente>();
		list.addAll(listTemp);

	}
	
	public Cliente searchCliente(Long id){
		Cliente clienteReturn = new Cliente();
		for (Cliente cliente : list) {
			if(id.compareTo(cliente.getID())==0){
				clienteReturn = cliente;
				continue;
			}
		}
		return clienteReturn;
	}
	
	public void deleteCliente(Long id){
		List<Cliente> listTemp = new ArrayList<Cliente>();
		
		for (Cliente cliente : list) {
			if(id.compareTo(cliente.getID())!=0){
				listTemp.add(cliente);
			}
		}
		list = new ArrayList<Cliente>();
		list.addAll(listTemp);
	}
}

