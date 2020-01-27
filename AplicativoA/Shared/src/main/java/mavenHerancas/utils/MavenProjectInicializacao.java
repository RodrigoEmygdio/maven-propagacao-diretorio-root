package mavenHerancas.utils;


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
