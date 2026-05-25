package br.edu.ifpb.ads.padroes.atv2;

public class ImprimirValoresVisitor implements Visitor {
    @Override
    public void visit(ProdutoFisico produto) {
        System.out.println("Item [Produto Físico]: " + produto.getNome() + " custa R$ " + produto.getValor());
    }

    @Override
    public void visit(Servico servico) {
        System.out.println("Item [Serviço]: " + servico.getDescricao() + " custa R$ " + servico.getValor());
    }
}