package br.edu.ifpb.ads.padroes.atv2;

public class Servico implements Item {
    private String descricao;
    private double valor;

    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }

    @Override
    public void accept(Visitor visitor) {
        // O serviço diz ao visitante: "Pode me visitar como um Serviço"
        visitor.visit(this);
    }
}