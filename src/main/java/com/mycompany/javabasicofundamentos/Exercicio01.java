/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabasicofundamentos;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
import java.util.HashMap
 *
 * @author User
 */
public class Exercicio01 {
    
        public static void main(String args[]){
        
        String txt;
        HashMap<String,String> informacoesTerreno = new HashMap<>();
        double areaTerreno, precoTerreno; 
        
        informacoesTerreno.put("larguraTerreno",JOptionPane.showInputDialog("Digite o valor da Lagura do Terreno"));
        informacoesTerreno.put("comprimentoTerreno", JOptionPane.showInputDialog("Digite o comprimento do Terreno"));
        informacoesTerreno.put("valorMetroQuadradoTerreno", JOptionPane.showInputDialog("Digite o valor do Metro Quadrado"));
        
        txt = "Largura do Terreno: " + informacoesTerreno.get("larguraTerreno") 
                + "\nComprimento do Terreno: " + informacoesTerreno.get("comprimentoTerreno") 
                    + "\nValor do Metro Quadrado: " + informacoesTerreno.get("valorMetroQuadradoTerreno");
        
        areaTerreno = Double.parseDouble(informacoesTerreno.get("larguraTerreno")) * Double.parseDouble(informacoesTerreno.get("comprimentoTerreno"));
        
        precoTerreno = areaTerreno * Double.parseDouble(informacoesTerreno.get("valorMetroQuadradoTerreno"));
        
        txt += "\nArea do Terreno: " + areaTerreno + "\nPreço do Terreno: " + precoTerreno;
        
        JOptionPane.showMessageDialog(null, txt);
        
        
        
    }
    
}
