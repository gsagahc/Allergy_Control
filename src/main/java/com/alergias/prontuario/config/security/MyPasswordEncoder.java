package com.alergias.prontuario.config.security;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.crypto.password.PasswordEncoder;



public class MyPasswordEncoder implements PasswordEncoder {
	private final Log logger = LogFactory.getLog(getClass());
	

	@Override
	public String encode(CharSequence Valor) {
		String stringresult;
		 try {
	            MessageDigest digest = MessageDigest.getInstance("SHA-256");
	            byte[] hash = digest.digest(((String) Valor).getBytes(StandardCharsets.UTF_8));
	            stringresult = bytesToHex(hash);
	            return stringresult;
	        } catch (NoSuchAlgorithmException e) {
	           
	        }
	        return null;
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		String senhaCriptografada = encode(rawPassword);
		if (encodedPassword == null || encodedPassword.length() == 0) {
			logger.warn("Empty encoded password");
			return false;
		}

		if (encodedPassword.equals(senhaCriptografada.toUpperCase())  ) {
			logger.warn("Authenticated User");
			return true;
			
		}
		else
		{
			System.out.println(encodedPassword.toUpperCase());
			System.out.println(senhaCriptografada.toUpperCase());
			logger.warn("Invalid password!" );
			return false;
		}	
		
			
		
	}
	//Converter a byte para Hex devolvendo uma string
	private static String bytesToHex(byte[] hash) {
	    StringBuilder hexString = new StringBuilder(2 * hash.length);
	    for (int i = 0; i < hash.length; i++) {
	        String hex = Integer.toHexString(0xff & hash[i]);
	        if(hex.length() == 1) {
	            hexString.append('0');
	        }
	        hexString.append(hex);
	    }
	    return hexString.toString();
	}

}
