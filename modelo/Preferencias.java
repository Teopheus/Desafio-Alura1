package modelo;

/**
 * Classe que usa o conceito de polimorfismo para incluir e avaliar Audios.
 */
public class Preferencias {

    /**
     * Inclui um Audio (Musica ou Podcast) e exibe uma mensagem 
     * baseada na sua classificação específica (polimorfismo).
     * @param audio Objeto do tipo Audio (pode ser Musica ou Podcast).
     */
    public void inclui(Audio audio) {
        // Chama o getClassificacao() da subclasse real do objeto (Musica ou Podcast)
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e um dos títulos preferidos da galera!");
        } else {
            System.out.println(audio.getTitulo() + " é um dos títulos que todo mundo está curtindo. Não deixe de ouvir também!");
        }
    }
}