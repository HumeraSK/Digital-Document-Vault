package com.vault.util;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;

public class EncryptionUtil {

    // Simple secret key (for demo). In real apps, store securely
    private static final byte[] keyBytes = "1234567890123456".getBytes(); // 16 bytes = 128-bit key
    private static final SecretKey secretKey = new SecretKeySpec(keyBytes, "AES");

    // Encrypt file
    public static void encryptFile(InputStream is, File outFile) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        try (CipherOutputStream cos = new CipherOutputStream(new FileOutputStream(outFile), cipher)) {
            byte[] buffer = new byte[4096];
            int read;
            while ((read = is.read(buffer)) != -1) {
                cos.write(buffer, 0, read);
            }
        }
    }

    // Decrypt file
    public static void decryptFile(File inFile, OutputStream os) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        try (CipherInputStream cis = new CipherInputStream(new FileInputStream(inFile), cipher)) {
            byte[] buffer = new byte[4096];
            int read;
            while ((read = cis.read(buffer)) != -1) {
                os.write(buffer, 0, read);
            }
        }
    }
}
