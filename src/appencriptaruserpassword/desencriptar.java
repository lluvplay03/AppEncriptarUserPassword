/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appencriptaruserpassword;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author hzeballos
 */
public class desencriptar 
{
  
    public byte[] cifra(String sinCifrar) throws Exception 
    {            
            final byte[] bytes = sinCifrar.getBytes("UTF-8");
            final Cipher aes = obtieneCipher(true);
            final byte[] cifrado = aes.doFinal(bytes);
            return cifrado;
    }

    public String descifra(byte[] cifrado) throws Exception 
    {
            final Cipher aes = obtieneCipher(false);
            final byte[] bytes = aes.doFinal(cifrado);
            final String sinCifrar = new String(bytes, "UTF-8");
            return sinCifrar;
    }

    private Cipher obtieneCipher(boolean paraCifrar) throws Exception 
    {            
            final String frase ="panamaAlMundial2017-10-100t0r1n0r4l1ng0l0g10-{#$%&/(){}+´#$&/()=Tr4st0rn0";
            final MessageDigest digest = MessageDigest.getInstance("SHA");
            digest.update(frase.getBytes("UTF-8"));
            final SecretKeySpec key = new SecretKeySpec(digest.digest(), 0, 16, "AES");

            final Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
            if (paraCifrar) {
                    aes.init(Cipher.ENCRYPT_MODE, key);
            } else {
                    aes.init(Cipher.DECRYPT_MODE, key);
            }
            return aes;
    }    
    
    public void escribirArchivo ( byte[] texto, String ruta) throws FileNotFoundException, IOException
    {
    FileOutputStream fos = new FileOutputStream(ruta);
    fos.write(texto);
    fos.close();
    }   
}//clase
