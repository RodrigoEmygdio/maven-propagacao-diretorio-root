package mavenHerancas.utils;

/**
 * Classe utilizada para cirar lista de propriedades para os build do manve sem a interferencia da herança do mesmo.
 * Veja o revision: 5597133657b4a7f3edc7f0ed43c1afe17bcbd03c na linha 60 do AplicativoA/pom.xml com a utilização dessa classe.
 * Essa ideia foi substituida pela utilziação do groovy-maven-plugin por ter uma melhor manutenibilidade
 */
public class MavenProjectInicializacao {
    public static void main(String[] args) {
        if(args == null){
            return;
        }
        System.out.println("Executando atividade iniciliação de propriedades");
        for (String prop : args
        ) {
            String[] propriredades = prop.split(";");
            if (System.getProperty(propriredades[0]) == null && propriredades.length > 1) {
                System.out.println(String.format("Settando propriedade %s e valor %s ",propriredades[0], propriredades[1]));
                System.setProperty(propriredades[0], propriredades[1]);
            }
        }
    }
}
