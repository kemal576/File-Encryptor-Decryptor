package com.sahinkemal.encyrptproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

public class FileEncryption 
{
    
    public static SecretKey generateKey() throws NoSuchAlgorithmException 
    {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecretKey key = keyGenerator.generateKey();
        return key;
    }   

    public static String KeyToString(SecretKey secretKey) 
    {
        String key = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        return key;
    }
    
    public static SecretKey StringToKey(String strKey)
    {
        byte[] decodedKey = Base64.getDecoder().decode(strKey);
        SecretKey secretKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
        return secretKey;
    }
   
    public static IvParameterSpec generateIv(String seed) 
    {
        byte[] iv = seed.getBytes();
        return new IvParameterSpec(iv);
    }
    
    public static void encryptFile(String algorithm, SecretKey key,IvParameterSpec iv,
    File inputFile, File outputFile) throws IOException, NoSuchPaddingException,
    NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException,
    BadPaddingException, IllegalBlockSizeException {
    
    Cipher cipher = Cipher.getInstance(algorithm);
    cipher.init(Cipher.ENCRYPT_MODE, key, iv);
    FileInputStream inputStream = new FileInputStream(inputFile);
    FileOutputStream outputStream = new FileOutputStream(outputFile);
    byte[] buffer = new byte[64];
    int bytesRead;
    while ((bytesRead = inputStream.read(buffer)) != -1) {
        byte[] output = cipher.update(buffer, 0, bytesRead);
        if (output != null) {
            outputStream.write(output);
        }
    }
    byte[] outputBytes = cipher.doFinal();
    if (outputBytes != null) {
        outputStream.write(outputBytes);
    }
    inputStream.close();
    outputStream.close();
}
    
    public static void decryptFile(String algorithm, SecretKey key,IvParameterSpec iv,
    File inputFile, File outputFile) throws IOException, NoSuchPaddingException,
    NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException,
    BadPaddingException, IllegalBlockSizeException 
    {
        
    Cipher cipher = Cipher.getInstance(algorithm);
    cipher.init(Cipher.DECRYPT_MODE, key, iv);
    FileInputStream inputStream = new FileInputStream(inputFile);
    FileOutputStream outputStream = new FileOutputStream(outputFile);
    byte[] buffer = new byte[64];
    int bytesRead;
    while ((bytesRead = inputStream.read(buffer)) != -1) {
        byte[] output = cipher.update(buffer, 0, bytesRead);
        if (output != null) {
            outputStream.write(output);
        }
    }
    byte[] outputBytes = cipher.doFinal();
    if (outputBytes != null) {
        outputStream.write(outputBytes);
    }
    inputStream.close();
    outputStream.close();
    }
    
}
