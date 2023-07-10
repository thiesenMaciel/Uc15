package modelos;

import java.util.ArrayList;
import java.util.List;

public class Clientes {

    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String rg;

    public static final List<Clientes> listaClientes = new ArrayList<>();

    public Clientes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clientes(int id) {
        this.id = id;
    }

    public List<Clientes> Listar() {
        return listaClientes;
    }

    public String NomeCliente() {
        return this.nome;
    }

    public void AddCliente(Clientes clientes) {
        listaClientes.add(clientes);
    }

    public void ExcluirCliente(Clientes clientes) {
        listaClientes.remove(clientes);
    }

    public Clientes(String nome, String endereco, String telefone, String cpf, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return getNome();
    }

}
