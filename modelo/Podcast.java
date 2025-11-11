package modelo;

/**
 * Representa um Podcast, estendendo as funcionalidades básicas de Audio.
 * Sobrescreve a classificação baseada no total de curtidas.
 */
public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    // Sobrescrita do método getClassificacao (Polimorfismo e Regra de Negócio)
    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() >= 500) {
            return 10;
        } else {
            return 7;
        }
    }

    // Getters e Setters
    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}