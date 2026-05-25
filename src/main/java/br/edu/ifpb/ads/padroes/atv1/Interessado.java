package br.edu.ifpb.ads.padroes.atv1;

public class Interessado {
    private String tipoInteresse; // Pode ser "titulo", "artista" ou "genero"
    private String valorInteresse; // O termo buscado, ex: "Desejo de Menina", "Forro", etc.
    private CanalNotificacao canal; // Como essa pessoa quer receber (SMS, Email ou Push)

    public Interessado(String tipoInteresse, String valorInteresse, CanalNotificacao canal) {
        this.tipoInteresse = tipoInteresse.toLowerCase();
        this.valorInteresse = valorInteresse.toLowerCase();
        this.canal = canal;
    }

    // Este método verifica se o novo disco cadastrado é do interesse desta pessoa
    public void avaliarEEnviar(Disco disco) {
        boolean match = false;
        String mensagemExibida = "";

        switch (tipoInteresse) {
            case "titulo" -> {
                if (disco.getTitulo().toLowerCase().contains(valorInteresse)) {
                    match = true;
                    mensagemExibida = "Novo disco adicionado: " + disco.getTitulo();
                }
            }
            case "artista" -> {
                if (disco.getArtista().toLowerCase().contains(valorInteresse)) {
                    match = true;
                    mensagemExibida = "Novo disco do artista: " + disco.getArtista();
                }
            }
            case "genero" -> {
                if (disco.getGenero().toLowerCase().contains(valorInteresse)) {
                    match = true;
                    mensagemExibida = "Novo disco do gênero: " + disco.getGenero();
                }
            }
        }

        // Se o disco for o que a pessoa queria, dispara a notificação pelo canal escolhido por ela!
        if (match) {
            canal.enviar(mensagemExibida);
        }
    }
}