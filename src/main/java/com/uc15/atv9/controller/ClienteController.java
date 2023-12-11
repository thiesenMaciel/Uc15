package com.uc15.atv9.controller;

import com.uc15.atv9.data.Cliente;
import com.uc15.atv9.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/adicionar")
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente clientes) {

        var novoCliente = clienteService.criarCliente(clientes);

        return new ResponseEntity<>(novoCliente, HttpStatus.CREATED);

    }

    @PutMapping("/atualizar/{id}")

    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Integer id, @RequestBody Cliente clientes) {

        var clienteAtualizado = clienteService.atualizarCliente(id, clientes);

        return new ResponseEntity<>(clienteAtualizado, HttpStatus.OK);

    }

    @GetMapping("/pesquisar/{id}")

    public ResponseEntity<Cliente> getClienteById(@PathVariable Integer id) {

        Cliente clientes = clienteService.getClienteId(id);

        return new ResponseEntity<>(clientes, HttpStatus.OK);

    }

    @DeleteMapping("/deletar/{id}")

    public ResponseEntity deletarCliente(@PathVariable Integer id) {

        clienteService.deletarCliente(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }

}
