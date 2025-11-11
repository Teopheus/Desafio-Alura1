package modelo; // Corrected package declaration

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    // Métodos para Interação
    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }

    // Getters e Setters (Encapsulamento)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    /**
     * Calcula a classificação com base nas reproduções (implementação básica na classe Audio).
     * Este método será sobrescrito nas subclasses.
     */
    public int getClassificacao() {
        // Classificação padrão baseada em reproduções (para o caso de ser usado diretamente)
        if (totalReproducoes >= 100) {
            return 5;
        } else {
            return 3;
        }
    }
}