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
public class ExemploHashMedias {
    
    public static void main(String[] args) {
        
        HashMap<String, String> aluno = new HashMap<String,String>();
        
        int ContPassou =0 , contRec= 0, contRep = 3;
        
    
        
        String txt = "";
        
        float media;
        
        for (int i = 0; i <= 2; i++) {
            
            String resultado = "Reprovou";
            
            aluno.put("nome", JOptionPane.showInputDialog("Digite o Nome do Aluno"));
            
            aluno.put("nota1", JOptionPane.showInputDialog("Digite a Nota 1 do Aluno: "));
            aluno.put("nota2", JOptionPane.showInputDialog("Digite a Nota 2 do Aluno: "));
            aluno.put("nota3", JOptionPane.showInputDialog("Digite a Nota 3 do Aluno: "));
            
            media = (Float.parseFloat(aluno.get("nota1"))
                      +(Float.parseFloat(aluno.get("nota2")))
                        +(Float.parseFloat(aluno.get("nota3"))));
            
            
            media = media /3;
            
            
            if (media >= 7 ) {
                
                resultado = "Aprovado";
                ContPassou += 1;
                contRep -= 1;
                
            }
            else if (media >= 4){
                
                resultado = "Recuperação";
                contRec += 1;
                contRep -= 1;
                
            }
            
            txt += "Aluno: "+aluno.get("nome")+" Media: " + media + " E Esta: "+ resultado;    
            txt += "\n";
        
        }
        
        
        
        JOptionPane.showMessageDialog(null, txt);
       
        JOptionPane.showMessageDialog(null, "Tevemos:  \n Reprovados: "+ contRep +" Aprovado: "+ ContPassou + " Recuperacao: "+ contRec);
        
        
        
        HashMap<String, HashMap<String, String>> alunos = new HashMap<String,HashMap<String,String>>();
        
        
        HashMap<String, String> cadAluno = new HashMap<String, String>();
        
        cadAluno.put("Idade", "17");
        cadAluno.put("media", "9");
        cadAluno.put("serie", "Quinto ANo");
        
        
        alunos.put("Walter", cadAluno );
        
        JOptionPane.showMessageDialog(null, alunos.get("Walter"));
        
    }
    
}
