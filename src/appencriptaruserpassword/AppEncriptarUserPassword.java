/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appencriptaruserpassword;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author hezeballos
 */
public class AppEncriptarUserPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException, IllegalAccessException {
        PantallaPrincipal obj = new PantallaPrincipal();
        obj.show();
        ///(UIManager.getSystemLookAndFeelClassName());
        obj.setLocationRelativeTo(null);
        
    }
    
}
