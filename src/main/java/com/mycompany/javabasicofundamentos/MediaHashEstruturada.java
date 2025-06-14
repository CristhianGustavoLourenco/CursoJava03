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
public class MediaHashEstruturada {
  
    public static HashMap<String,HashMap<String,String>> cadAluno = new HashMap<String,HashMap<String,String>>();
    
    public static void main(String[] args) {
        
        int controlador = 0;
        
        String nome;
        float nota1, nota2, nota3;
        int idade;
        
        
        while (controlador == 0) {            
        
            nome = JOptionPane.showInputDialog("Digite o Nome do Aluno");
            
            idade = Integer.parseInt(JOptionPane.showInputDialog("DIgite a Idade do Aluno"));
        
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 1"));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 2"));
            nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 3"));
            
            cadastraAluno(nome,nota1,nota2,nota3,idade);
            
            nome = JOptionPane.showInputDialog("Digite Sair ou qualquer coisa para continuar");
            
            if (nome.equalsIgnoreCase("sair")) {
                controlador = 1;
                
            }
        
            

        
        }
        
        String txt = "";
        
        for (String chaveNome : cadAluno.keySet()) {
            
            txt += "Nome do Aluno: "+ chaveNome;
            
            HashMap<String,String> dadosAlunos = new HashMap<String,String>();
            dadosAlunos = cadAluno.get(chaveNome);
            
            for (String chaveDado : dadosAlunos.keySet()){
                
                txt += " "+chaveDado + ": "+dadosAlunos.get(chaveDado);
                
            }
            
            txt += "\n";
            
        }
        
        JOptionPane.showMessageDialog(null, txt);
        JOptionPane.showMessageDialog(null, cadAluno);
        
        
        
        
    }
    
    
   
    public static void cadastraAluno(String nome, float nota1, float nota2, float nota3, int idade){
        HashMap<String,String> dadosALuno = new HashMap<String,String>();
        float media = cauculaMedia(nota1, nota2, nota3);
        
        dadosALuno.put("media", String.valueOf(media));
        dadosALuno.put("status", retornaStatus(media));
        dadosALuno.put("idade", String.valueOf(idade));
        
        cadAluno.put(nome, dadosALuno);
    }
    
    
    public static float cauculaMedia(float nota1 , float nota2,float nota3){
        return (nota1+nota2+nota3)/3;
    }
    
    public static String retornaStatus(float media){
        String status = "Reprovado";
        
        if (media>=7){
            status = "Aprovado";
        }
        else if (media >=4){
            status = "Recuperação";
        }
 
        return status;
    }
}
