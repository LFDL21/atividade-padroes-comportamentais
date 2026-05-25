package br.edu.ifpb.ads.padroes.atv2;

// Interface que define que qualquer item do nosso sistema aceita um visitante (Visitor)
public interface Item {
    void accept(Visitor visitor);
}