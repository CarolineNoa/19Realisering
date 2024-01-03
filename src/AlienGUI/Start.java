/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlienGUI;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ericc
 */
public class Start {
    
    private static InfDB idb;   
    
    public static void main(String[] args) {
        
        try{
         idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            

        }
        catch (InfException ettUndantag) {        //som finns placerad i samma map som projektet självt 
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }       
        
        new AlienFönster(idb).setVisible(true);
        
    }
    
}
