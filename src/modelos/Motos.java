package modelos;

public class Motos {

    private int id;
    private String placa;
    private String cor;
    private String ano;
    private String valor_custo;
    private String valor_venda;
    private String modelo;

    public Motos() {
    }

    public Motos(int id, String placa, String cor, String ano, String valor_custo, String valor_venda, String modelo) {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.valor_custo = valor_custo;
        this.valor_venda = valor_venda;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getValor_custo() {
        return valor_custo;
    }

    public void setValor_custo(String valor_custo) {
        this.valor_custo = valor_custo;
    }

    public String getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(String valor_venda) {
        this.valor_venda = valor_venda;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
