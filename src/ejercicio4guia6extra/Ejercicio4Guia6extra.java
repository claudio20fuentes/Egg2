package ejercicio4guia6extra;

import com.oracle.net.Sdp;
import ejercicio4guia6extra.Entidades.NIF;
import ejercicio4guia6extra.Servicios.ServicesDni;
import java.math.BigInteger;

/**
 *
 * @author KAZAMA
 */
public class Ejercicio4Guia6extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NIF n = ServicesDni.crearNif();
        
        ServicesDni.mostrar(n.getDNI() , n.getLetra());
        
        
        
        
        
    }
    
}
