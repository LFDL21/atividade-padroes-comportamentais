package br.edu.ifpb.ads.padroes.atv2;

public class RelatorioImpostoVisitor implements Visitor {
    private double totalImposto = 0;

    @Override
    public void visit(ProdutoFisico produto) {
        double imposto = produto.getValor() * 0.10; // 10%
        totalImposto += imposto;
        System.out.println("Produto Físico: " + produto.getNome() + " | Valor: R$ " + produto.getValor() + " | Imposto (10%): R$ " + imposto);
    }

    @Override
    public void visit(Servico servico) {
        double imposto = servico.getValor() * 0.15; // 15%
        totalImposto += imposto;
        System.out.println("Serviço: " + servico.getDescricao() + " | Valor: R$ " + servico.getValor() + " | Imposto (15%): R$ " + imposto);
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}