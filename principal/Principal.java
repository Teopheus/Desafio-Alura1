package principal;

import modelo.Musica;
import modelo.Podcast;
import modelo.Preferencias;

/**
 * Classe principal para instanciar e testar as classes de Audio.
 */
public class Principal {
    public static void main(String[] args) {
        
        // 1. Instanciar e configurar uma Música
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("StarDust");
        minhaMusica.setGenero("Pop");
        minhaMusica.setAlbum("Eternity");

        // 2. Simular interações (Loop para reprodução/curtidas)
        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 500; i++) {
            minhaMusica.curte();
        }

        System.out.println("--- Dados da Música ---");
        System.out.println("Título: " + minhaMusica.getTitulo());
        System.out.println("Reproduções: " + minhaMusica.getTotalReproducoes()); // Esperado: 3000
        System.out.println("Curtidas: " + minhaMusica.getTotalCurtidas());     // Esperado: 500
        // Classificação: 3000 reproduções é >= 2000, então deve ser 10.
        System.out.println("Classificação: " + minhaMusica.getClassificacao()); 
        System.out.println("-------------------------\n");


        // 3. Instanciar e configurar um Podcast
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Alura & Cia");
        meuPodcast.setDescricao("Podcast sobre o universo da programação.");

        // 4. Simular interações (Loop para reprodução/curtidas)
        for (int i = 0; i < 8000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 600; i++) {
            meuPodcast.curte();
        }

        System.out.println("--- Dados do Podcast ---");
        System.out.println("Título: " + meuPodcast.getTitulo());
        System.out.println("Reproduções: " + meuPodcast.getTotalReproducoes()); // Esperado: 8000
        System.out.println("Curtidas: " + meuPodcast.getTotalCurtidas());     // Esperado: 600
        // Classificação: 600 curtidas é >= 500, então deve ser 10.
        System.out.println("Classificação: " + meuPodcast.getClassificacao());
        System.out.println("--------------------------\n");


        // 5. Finalizar com a classe Preferencias (Demonstração de Polimorfismo)
        Preferencias minhasPreferencias = new Preferencias();
        
        System.out.println("--- Avaliação das Preferências ---");
        // Polimorfismo: o método inclui recebe Audio, mas chama o getClassificacao() 
        // específico da subclasse (Musica).
        minhasPreferencias.inclui(minhaMusica); 
        
        // Polimorfismo: a mesma chamada, mas o getClassificacao() agora é o de Podcast.
        minhasPreferencias.inclui(meuPodcast); 
    }
}