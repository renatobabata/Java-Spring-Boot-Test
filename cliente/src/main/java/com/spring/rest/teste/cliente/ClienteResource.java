package com.spring.rest.teste.cliente;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ClienteResource {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listarTodosClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente consultarClienteId(@PathVariable long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		
		if(!cliente.isPresent())
			throw new ClienteException("Cliente nao encontrado: "+id);
		return cliente.get();
	}
	
	@DeleteMapping("/clientes/{id}")
	public void removerCliente(@PathVariable long id) {
		clienteRepository.deleteById(id);
	}
	
	@PostMapping("/clientes")
	public ResponseEntity<Object> criarCliente(@RequestBody Cliente cliente){
		Cliente clienteAdicionado = clienteRepository.save(cliente);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(clienteAdicionado.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping("/clientes/{id}")
	public ResponseEntity<Object> alterarCliente(@RequestBody Cliente cliente,@PathVariable long id){
		Optional<Cliente> clienteOptional = clienteRepository.findById(id);
		
		if(!clienteOptional.isPresent());
		
		return ResponseEntity.noContent().build();
	}
}
