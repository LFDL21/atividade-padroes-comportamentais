package br.edu.ifpb.ads.padroes.atv2;

public interface Visitor {
    void visit(ProdutoFisico produto);
    void visit(Servico servico);
}
