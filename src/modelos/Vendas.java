package modelos;

import java.util.ArrayList;
import java.util.List;

public class Vendas {

    private Clientes clientes;
    private Motos motos;

    private static final List<Vendas> listaVendas = new ArrayList<>();

    public void AddVenda(Vendas vendas) {
        listaVendas.add(vendas);
    }

    public void ExcluirVenda(Vendas vendas) {
        listaVendas.remove(vendas);
    }
    
    public Vendas(Clientes clientes, Motos motos) {
        this.clientes = clientes;
        this.motos = motos;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Motos getMotos() {
        return motos;
    }

    public void setMotos(Motos motos) {
        this.motos = motos;
    }

}
