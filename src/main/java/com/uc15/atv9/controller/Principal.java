package com.uc15.atv9.controller;

import com.uc15.atv9.data.Cliente;
import com.uc15.atv9.data.Moto;
import com.uc15.atv9.data.Venda;
import com.uc15.atv9.service.ClienteService;
import com.uc15.atv9.service.MotoService;
import com.uc15.atv9.service.VendaService;
import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Principal {

    @Autowired
    MotoService motoservice;

    @Autowired
    ClienteService clienteService;

    @Autowired
    VendaService vendaService;

    @GetMapping("/menu")
    public String inicio(Model model) {
        return "menu";
    }

    @GetMapping("/cadastro-moto")
    public String exibirFormulario(Model model) {
        model.addAttribute("moto", new Moto());
        return "cadastro-moto";
    }

    @PostMapping("/cadastro-moto")
    public String cadastrarMoto(@Valid @ModelAttribute Moto cine, BindingResult result,Model model) {
        if (result.hasErrors()) {
            return "cadastro-cliente";
        }
        motoservice.criarMoto(cine);
        model.addAttribute("moto", cine);
        return "redirect:/lista-moto";
    }

    @GetMapping("/lista-moto")
    public String listaMotos(Model model) {
        List<Moto> todasMotos = motoservice.listarTodasMotos();

        List<Moto> motosNaoVendidas = todasMotos.stream()
                .filter(moto -> !moto.isVendida())
                .collect(Collectors.toList());

        model.addAttribute("motos", motosNaoVendidas);
        return "lista-moto";
    }

    @GetMapping("/lista-cliente")
    public String listaCliente(Model model) {
        model.addAttribute("clientes", clienteService.listarTodosClientes());
        return "lista-cliente";
    }

    @GetMapping("/cadastro-cliente")
    public String exibirFormularioCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cadastro-cliente";
    }

    @PostMapping("/cadastro-cliente")
    public String cadastrarCliente(@Valid @ModelAttribute Cliente cliente, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "cadastro-cliente";
        }

        clienteService.criarCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "redirect:/lista-cliente";
    }

    @PostMapping("/moto/deletar/{id}")
    public String deletarMoto(@PathVariable Integer id) {
        motoservice.deletarMoto(id);
        return "redirect:/lista-moto";
    }

    @PostMapping("/cliente/deletar/{id}")
    public String deletarCliente(@PathVariable Integer id) {
        clienteService.deletarCliente(id);
        return "redirect:/lista-cliente";
    }

    @GetMapping("/editar-moto/{id}")
    public String exibirFormularioEdicao(@PathVariable Integer id, Model model) {
        Moto moto = motoservice.getMotoId(id);
        model.addAttribute("moto", moto);
        return "editar-moto";
    }

    @PostMapping("/editar-moto/{id}")
    public String salvarEdicaoMoto(@PathVariable Integer id, @ModelAttribute("moto") Moto motoAtualizado) {
        motoservice.atualizarMoto(id, motoAtualizado);
        return "redirect:/lista-moto";
    }

    @GetMapping("/editar-cliente/{id}")
    public String exibirFormularioEdicaoCliente(@PathVariable Integer id, Model model) {
        Cliente cliente = clienteService.getClienteId(id);
        model.addAttribute("cliente", cliente);
        return "editar-cliente";
    }

    @PostMapping("/editar-cliente/{id}")
    public String salvarEdicaoCliente(@PathVariable Integer id, @ModelAttribute("cliente") Cliente clienteAtualizado) {
        clienteService.atualizarCliente(id, clienteAtualizado);
        return "redirect:/lista-cliente";
    }

    @GetMapping("/formar-venda")
    public String exibirFormularioVenda(Model model) {
        List<Moto> todasMotos = motoservice.listarTodasMotos();

        List<Moto> motosNaoVendidas = todasMotos.stream()
                .filter(moto -> !moto.isVendida())
                .collect(Collectors.toList());
        List<Cliente> clientes = clienteService.listarTodosClientes();
        model.addAttribute("motos", motosNaoVendidas);
        model.addAttribute("clientes", clientes);
        model.addAttribute("venda", new Venda());
        return "formar-venda";
    }

    @PostMapping("/formar-venda")
    public String cadastrarVenda(@ModelAttribute Venda venda, Model model) {
        Integer motoId = venda.getMoto().getId();
        Integer clienteId = venda.getCliente().getId();

        Moto moto = motoservice.getMotoId(motoId);
        Cliente cliente = clienteService.getClienteId(clienteId);

        venda.setMoto(moto);
        venda.setCliente(cliente);

        vendaService.criarVenda(venda);

        vendaService.realizarVenda(motoId);

        return "resumo-venda";
    }

    @GetMapping("/motos-vendidas")
    public String listarMotosVendidas(Model model) {
        List<Moto> motosVendidas = motoservice.listarTodasMotos().stream()
                .filter(Moto::isVendida)
                .collect(Collectors.toList());

        model.addAttribute("motosVendidas", motosVendidas);
        return "motos-vendidas";
    }

}
