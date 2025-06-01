/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabasicofundamentos;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ExemploHashCarro {
    
    public static HashMap<String, HashMap<String,String>> carro = new HashMap<String, HashMap<String,String>>();
    
    public static void main(String[] args) {
         
        
        
        preencheHash("ABC-6789", "fiat", "uno");
        
        preencheHash("ABC-1234", "jeep", "renegade");
        
        
        //String resultadoCarro = carro.get("ABC-1234").get("marca");
        
        JOptionPane.showMessageDialog(null, carro);
        
       // JOptionPane.showMessageDialog(null, resultadoCarro);
        
        
    }
    
    
    public static void preencheHash(String placa, String marca, String modelo){
        HashMap<String,String> dadosCarro = new HashMap<String,String>();
       
        dadosCarro.put("marca", marca);
        dadosCarro.put("modelo", modelo);
        
        carro.put( placa, dadosCarro);
       
    }
    
}
