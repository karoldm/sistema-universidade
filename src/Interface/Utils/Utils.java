
package Interface.Utils;

import Modelo.Efetivo;
import Modelo.Funcionario;
import Modelo.Substituto;
import Modelo.Tecnico;

/**
 *
 * @author karol
 */
public class Utils {
    public Utils(){};
    
    public static boolean hasNull(String[] values){
        for (String value : values) {
            if (null == value || value.equals("")) {
                return true;
            }
        }
        return false;
    }
    public static boolean isFloat(String value){
        try {
            float teste = Float.parseFloat(value);
        } catch(NumberFormatException nfe) {
             return false;
        }
        return true;
    }
   
}
