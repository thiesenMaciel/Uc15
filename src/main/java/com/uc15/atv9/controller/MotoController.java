package com.uc15.atv9.controller;

import com.uc15.atv9.data.Moto;
import com.uc15.atv9.service.MotoService;
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

@RequestMapping("/moto")

public class MotoController {

    @Autowired

    MotoService motoService;

    @GetMapping("/listar")

    public ResponseEntity<List> getAllMotos() {

        List<Moto> motos = motoService.listarTodasMotos();

        return new ResponseEntity<>(motos, HttpStatus.OK);

    }

    @GetMapping("/pesquisar/{id}")

    public ResponseEntity<Moto> getMotoById(@PathVariable Integer id) {

        Moto moto = motoService.getMotoId(id);

        return new ResponseEntity<>(moto, HttpStatus.OK);

    }

    @PostMapping("/adicionar")

    public ResponseEntity<Moto> addMoto(@RequestBody Moto moto) {

        var novaMoto = motoService.criarMoto(moto);

        return new ResponseEntity<>(novaMoto, HttpStatus.CREATED);

    }

    @PutMapping("/atualizar/{id}")

    public ResponseEntity<Moto> atualizarMoto(@PathVariable Integer id, @RequestBody Moto moto) {

        var motoAtualizado = motoService.atualizarMoto(id, moto);

        return new ResponseEntity<>(motoAtualizado, HttpStatus.OK);

    }

    @DeleteMapping("/deletar/{id}")

    public ResponseEntity deletarMoto(@PathVariable Integer id) {

        motoService.deletarMoto(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }

}
