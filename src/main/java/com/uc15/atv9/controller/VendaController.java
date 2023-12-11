package com.uc15.atv9.controller;

import com.uc15.atv9.data.Venda;
import com.uc15.atv9.service.VendaService;
import java.util.List;
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

@RequestMapping("/venda")

public class VendaController {

    @Autowired

    VendaService motoService;

    @GetMapping("/listar")

    public ResponseEntity<List> getAllMotos() {

        List<Venda> vendas = motoService.listarTodasVendas();

        return new ResponseEntity<>(vendas, HttpStatus.OK);

    }

    @GetMapping("/pesquisar/{id}")

    public ResponseEntity<Venda> getVendaById(@PathVariable Integer id) {

        Venda moto = motoService.getVendaId(id);

        return new ResponseEntity<>(moto, HttpStatus.OK);

    }

    @PostMapping("/adicionar")

    public ResponseEntity<Venda> addVenda(@RequestBody Venda moto) {

        var novaMoto = motoService.criarVenda(moto);

        return new ResponseEntity<>(novaMoto, HttpStatus.CREATED);

    }

    @PutMapping("/atualizar/{id}")

    public ResponseEntity<Venda> atualizarVenda(@PathVariable Integer id, @RequestBody Venda moto) {

        var motoAtualizado = motoService.atualizarVenda(id, moto);

        return new ResponseEntity<>(motoAtualizado, HttpStatus.OK);

    }

    @DeleteMapping("/deletar/{id}")

    public ResponseEntity deletarVenda(@PathVariable Integer id) {

        motoService.deletarVenda(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }

}
