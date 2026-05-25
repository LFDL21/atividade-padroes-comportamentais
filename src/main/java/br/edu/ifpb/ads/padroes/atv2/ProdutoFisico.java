package br.edu.ifpb.ads.padroes.atv2;

public class ProdutoFisico implements Item {
    private String nome;
    private double valor;

    public ProdutoFisico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() { return nome; }
    public double getValor() { return valor; }

    @Override
    public void accept(Visitor visitor) {
        // O produto físico diz ao visitante: "Pode me visitar como um Produto Físico"
        visitor.visit(this);
    }
}
