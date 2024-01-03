
package realiseringprojekt;

/**
 * @author Eric Carlberg
 * @author Elisa Alhilly
 * @author Charolin Noaaman
 * @author Leyla Altay
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

public class Start {

    private static InfDB idb;
    
    public static void main(String[] args) throws InfException {
        
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        catch (InfException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new Inloggning(idb).setVisible(true);
        
    }
}
