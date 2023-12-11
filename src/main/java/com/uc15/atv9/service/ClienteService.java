package com.uc15.atv9.service;

import com.uc15.atv9.data.Cliente;
import com.uc15.atv9.data.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired

    ClienteRepository clienteRepository;

    public Cliente criarCliente(Cliente cliente) {

        cliente.setId(null);

        clienteRepository.save(cliente);

        return cliente;

    }

    public Cliente atualizarCliente(Integer clienteId, Cliente clienteRequest) {
        Cliente clienteExistente = getClienteId(clienteId);

        clienteExistente.setNome(clienteRequest.getNome());
        clienteExistente.setEndereco(clienteRequest.getEndereco());
        clienteExistente.setTelefone(clienteRequest.getTelefone());
        clienteExistente.setCpf(clienteRequest.getCpf());
        clienteExistente.setRg(clienteRequest.getRg());

        clienteRepository.save(clienteExistente);

        return clienteExistente;
    }

    public Cliente getClienteId(Integer clienteId) {

        return clienteRepository.findById(clienteId).orElse(null);

    }

    public List<Cliente> listarTodosClientes() {

        return clienteRepository.findAll();

    }

    public void deletarCliente(Integer clienteId) {

        Cliente cliente = getClienteId(clienteId);

        clienteRepository.deleteById(cliente.getId());

    }

}
