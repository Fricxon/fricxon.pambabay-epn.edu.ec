package utilitario;

import java.io.IOException;

public class ProgressBar {
    
    /**
     * [                       <-=->] 50%
     * Imprime la animacion de la nave al avanzar
     * @param entero : Parte entera del nroCaracteres
     * @param tamaño : Tamaño de la barra de carga
     */
    public static String dibujaNaveavanza(int entero,int tamaño) {
        String anim="<-=->";
        String barra="\r [";
        if(entero!=0){
            for(int espacios=0;espacios<entero;espacios++)
                barra+= String.format("%s", " ");
        }
        barra+= String.format("%s", anim);

        for(int espacios=entero+1;espacios<=tamaño;espacios++){
            barra+=String.format("%s", " ");
        }
        barra+= "]";
        
        
        return barra;
    }

    //Dibuja la animacion de la nave al retroceder
    /**
     * [ <-=->                      ] 90%
     * Imprime la animacion de la nave al retroceder
     * @param entero : Parte entera del nroCaracteres
     * @param tamaño : Tamaño de la barra de carga
     */
    public static String dibujaNaveretrocede(int entero,int tamaño) {
        String anim="<-=->";
        String barra="\r [";
        
        for(int espacios=0;espacios<tamaño-entero;espacios++)
            barra += String.format("%s", " ");
        
        barra+= String.format("%s", anim);

        for(int espacios=tamaño-entero+1;espacios<=tamaño;espacios++)
            barra+= String.format("%s", " ");

        barra+="]";

        return barra;
    }

    
    /**
     * [<-=->                         ] 100% Loading: 27 de 27   fricxon.pambabay@epn.edu.ec
     * Imprime la barra de carga junto con el numero de letras cargadas y las letras cargadas
     * @param entero : Parte entera del nroCaracteres
     * @param tamaño : Tamaño de la barra de carga
     */
    public static void showProgressBar_i(int TamBar) throws IOException, InterruptedException {
        int cont=1;
        String correo = "fricxon.pambabay@epn.edu.ec";
        for (int porcentaje = 0; porcentaje <= 50; porcentaje++) {
                    
            
            String sb= new String();
            int nroCaracteres = porcentaje *2* TamBar / 100;  //numero de caracteres
            int enteros= (int)nroCaracteres;
            sb="\n"+dibujaNaveavanza(enteros, TamBar);
            System.out.write(sb.getBytes());
            System.out.printf(" %d %% Loading: %d de 27    %s", porcentaje,cont,correo.substring(0, cont));
            if(enteros%4==0 && porcentaje<=50)
                cont++;

            Thread.sleep(100);
        }
        cont=1;
        for(int porcentaje = 0; porcentaje <= 50; porcentaje++) {
            
            String sb= new String();
            int nroCaracteres = porcentaje *2* TamBar / 100;  //numero de caracteres
            int enteros= (int)nroCaracteres;
            sb="\n"+dibujaNaveretrocede(enteros, TamBar);
            System.out.write(sb.getBytes());
                if(cont+15<28)
                        if(nroCaracteres==30)
                        System.out.printf(" %d %% Loading: %d de 27    %s", 100,27,correo);
                            else
                                System.out.printf(" %d %% Loading: %d de 27    %s", porcentaje+50,cont+15,correo.substring(0,cont+15));
                

            if(enteros%5==0 && porcentaje<=50)
                cont++;
            Thread.sleep(100);
    
        }
        
    }


    
}
