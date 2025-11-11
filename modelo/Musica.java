package modelo;

/**
 * Representa uma Música, estendendo as funcionalidades básicas de Audio.
 * Sobrescreve a classificação baseada no total de reproduções.
 */
public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;

    // Sobrescrita do método getClassificacao (Polimorfismo e Regra de Negócio)
    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() >= 2000) {
            return 10;
        } else {
            return 8;
        }
    }

    // Getters e Setters
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}