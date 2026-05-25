package br.edu.ifpb.ads.padroes.atv1;

import java.util.LinkedList;
import java.util.List;

public class RepositorioDiscos {

    private List<Disco> discos = new LinkedList<>();
    
    // Lista contendo todos os observadores interessados
    private List<Interessado> interessados = new LinkedList<>();

    public List<Disco> buscarDiscos(String titulo) {
        return discos.stream().filter(d -> d.getTitulo().toLowerCase()
                .contains(titulo.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorArtista(String artista) {
        return discos.stream().filter(d -> d.getArtista().toLowerCase()
                .contains(artista.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorGenero(String genero) {
        return discos.stream().filter(d -> d.getGenero().toLowerCase()
                .contains(genero.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorAno(int ano) {
        return discos.stream().filter(d -> d.getAnoLancamento() == ano).toList();
    }

    // Método para adicionar um disco e notificar os interessados
    public void addDisco(Disco disco) {
        discos.add(disco);
        notificar(disco);
    }

    public void removeDisco(Disco disco) {
        discos.remove(disco);
    }

    // Método que permite cadastrar um novo interessado no sistema
    public void registrarInteressado(Interessado interessado) {
        this.interessados.add(interessado);
    }

    // Varre a lista de interessados e avisa cada um sobre o novo disco adicionado
    private void notificar(Disco disco) {
        for (Interessado interessado : interessados) {
            interessado.avaliarEEnviar(disco);
        }
    }
}