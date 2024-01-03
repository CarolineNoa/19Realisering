
package realiseringprojekt;

import java.util.ArrayList;
import javax.swing.JTextField;
import java.util.regex.*;
import oru.inf.InfDB;
import oru.inf.InfException; 

/**
 *
 * @author leyla
 * All användarinmatning ska kontrolleras eller valideras. Valideringen ska göras med hjälp av denna klass.
 * Valideringen ska helst ske med Regular Expressions (regEx).
 * 
 */
public class Validering {   

    private InfDB idb;
        
    public Validering(InfDB idb) {
        this.idb = idb;
    }

    // Agents epost måste sluta med @mib.net
    public static boolean giltigAgentEpost(JTextField ruta)
    {
        String epost = ruta.getText();
        boolean resultat = false;
                
        if(epost.endsWith("@mib.net")) {
        resultat = true;
        }
        return resultat;
    }
    
    //Används för att ta in giltig epost som matchar regular expression-mönstret
    public static boolean giltigEpost(JTextField ruta) 
    {
        String epost = ruta.getText();
        
        //Tillåter tecken innan och efter '@'
        String regularExpression = "^(.+)@(.+)$"; 
        
        return epost.matches(regularExpression);
    }
    
    
    // Tittar om textrutan har något värde    
    public static boolean rutaHarVarde(JTextField ruta)
    {
        boolean resultat = true;        
        if(ruta.getText().isEmpty()){
            resultat = false;
            ruta.requestFocus();
        }       
        return resultat;
    }
    
    //Tittar om det är korrekt datumformat med regular expression
    public static boolean korrektDatum(JTextField ruta) {
        String datum = ruta.getText();
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(datum);

        return matcher.matches();
    }
    
}
