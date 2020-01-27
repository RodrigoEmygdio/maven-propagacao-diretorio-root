package mavenHerancas.utils;


import java.util.Arrays;

public class VisualizaVariaveis {

    public static void main(String[] args) {
        // Essa variavel de ambiente altera de acordo com o work directory da execução do manven
        // Tente executar o mvn compile no diretorio: MavenHerancas\AplicativoA\Funcionalidades\FuncionalidadeA
        // e veja a saida ;)
        System.out.println(String.format("Executando plugin, root do projeto: %s",System.getProperty("maven.multiModuleProjectDirectory")));
        // Esse foi um jeito seguro de recuperar em conjunto com o gmaven
        // Nesse caso o args na posicao o é a propriedade que setamos no gmaven para pegar o root do AplicativoA.
        System.out.println(String.format("Recuperando valor do %s : %s",args[0],System.getProperty(args[0]) ));
        System.out.println(String.format("O %s foi setado no gmaven na inicialização do projeto para pegar o diretorio do AplicativoA", args[0]));

        Arrays.stream(
                args
        )
                .forEach(System.out::println);
        System.out.println("Final execução!");
    }
}
