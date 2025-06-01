/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.JavaBasicoFundamentos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author 74741
 */
public class JavaBasicoFundamentos {

    public static String nome, statusAluno, strMedia, textoFinal;
    public static int num1, num2, resultSoma, idade; 
    public static float resultDiv, nota1, nota2, nota3, media, soma;
   
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        //JOptionPane.showMessageDialog(null,"Seu nome é: " + nome);
        
        //1 - Criem um algoritimo que: tenha que ser digitado 2 números e exiba a soma dos mesmos
        //2 - Com a soma divida ela pelo primeiro numero.
        
        //num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        //num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        //resultSoma = num1 + num2;
        //resultDiv = (float) resultSoma / num1;
        //JOptionPane.showMessageDialog(null, "O valor da soma é: " + resultSoma +"\nO valor da divisão de " + resultSoma + " por " + num1 + " é igual à: " +resultDiv);
        
        //3 - Crie um algoritimo que ira pedir 3 notas e calcular a media
        
        /*nome = JOptionPane.showInputDialog("Digete o nome do Aluno ");
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª Nota do aluno " + nome));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª Nota do aluno " + nome));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3ª Nota do aluno " + nome));
        soma = nota1 + nota2 + nota3;
        media = soma/3;
        statusAluno = "Reprovado";
        
        if (media >= 7){
            statusAluno = "Aprovado";
        }else if(media >= 4){
            statusAluno = "Recuperação";
        }
        
        JOptionPane.showMessageDialog(null,"Aluno: "+ nome + "\n" + "Média: " + media+ "\n O status do aluno é: " + statusAluno);*/
     
        //4 - Adicione os seguinte dados no algoritimo de media:
    
        nome = JOptionPane.showInputDialog("Digete o nome do Aluno ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digete a idade do Aluno "));
        
        textoFinal = "O Aluno " + nome + " que tem a Idade: " + idade;
        
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª Nota do aluno " + nome));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª Nota do aluno " + nome));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3ª Nota do aluno " + nome));
        soma = nota1 + nota2 + nota3;
        media = (soma/3);
        statusAluno = "Reprovado";
        
        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(2);
        strMedia = format.format(media);
        textoFinal += " , teve média: " + strMedia;
        
        if (media >= 7){
            statusAluno = "Aprovado";
        }else if(media >= 4){
            statusAluno = "Recuperação";
        }
        
        textoFinal += " e está: " + statusAluno;
        
        JOptionPane.showMessageDialog(null,textoFinal);
    
    }
}
