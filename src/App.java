import utilitario.ProgressBar;

/**
 * @author: Fricxon Xavier Pambabay Valle
 * @version: Final
 * @date: 2022-07-06
 */

public class App {
    public static void main(String[] args) throws Exception {
        int tamañoBarra=30;
    /**
     * [<-=->                         ] 100% Loading: 27 de 27   fricxon.pambabay@epn.edu.ec
     * @param TamañoBarra : tamano de la barra de carga
     */
        ProgressBar.showProgressBar_i(tamañoBarra);
        
        
    }
}
