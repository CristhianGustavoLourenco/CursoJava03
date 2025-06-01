/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabasicofundamentos;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ListasExercicios {
// 1 - Solicitar o nome do jogo e preço de 5 jogos sem vetor e sem while
// 2 - Solicitar o nome do jogo e preço de 5 jogos sem vetor e com while
// 3 - Solicitar o nome do jogo e preço de 5 jogos com vetor e sem while
// 4 - Solicitar o nome do jogo, preço e categoria de 5 jogos com vetor e com while, apresentar o nome, categoria e preço dos jogos.
// 5 - Solicitar o nome do jogo e preço de 6 jogos com matriz e com while
// 6 - Solicitar o nome do jogo e preço de 6 jogos com matriz e com for

    float precoJogo;
    String nomeJogo;
    int indiceX, indiceY = 0;
    String[] nomeJogoVetor = new String[5];
    float[] precoJogoVetor = new float[5];
    String[][] nomeJogoMatriz = new String[3][2];
    float[][] precoJogoMatriz = new float[3][2];

    public static void main(String[] args) {

        new ListasExercicios().exercicio05();
         
    }

    public void exercicio01() {

        for (indiceX = 0; indiceX < 5; indiceX++)
        {

            nomeJogo = JOptionPane.showInputDialog("Digite o nome do Jogo que Deseja Comprar");
            precoJogo = Float.parseFloat(JOptionPane.showInputDialog("Digite o Preço do jogo que Deseja Comprar"));

            JOptionPane.showMessageDialog(null, "Nome do Jogo: " + nomeJogo + "\nPreço do Jogo: " + precoJogo);

        }
    }

    public void exercicio02() {

        while (indiceX <= 4)
        {

            nomeJogo = JOptionPane.showInputDialog("Digite o nome do Jogo");
            precoJogo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Jogo"));

            JOptionPane.showMessageDialog(null, "Nome do Jogo: " + nomeJogo + "\nPreço do Jogo: " + precoJogo);

            indiceX = indiceX + 1;
        }
    }

    public void exercicio03() {

        for (indiceX = 0; indiceX != 5; indiceX++)
        {

            nomeJogoVetor[indiceX] = JOptionPane.showInputDialog("Digite o nome do Jogo");
            precoJogoVetor[indiceX] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Jogo"));

        }

        for (indiceX = 0; indiceX != 5; indiceX++)
        {

            JOptionPane.showMessageDialog(null, "Nome do Jogo: " + nomeJogoVetor[indiceX] + "\nPreço do Jogo: " + precoJogoVetor[indiceX]);

        }

    }

    public void exercicio04() {

        while (indiceX < 5)
        {

            nomeJogoVetor[indiceX] = JOptionPane.showInputDialog("Digite o nome do Jogo");
            precoJogoVetor[indiceX] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Jogo"));

            indiceX = indiceX + 1;

        }

        indiceX = 0;

        while (indiceX < 5)
        {

            JOptionPane.showMessageDialog(null, "Nome do Jogo: " + nomeJogoVetor[indiceX] + "\nPreço do Jogo: " + precoJogoVetor[indiceX]);

            indiceX = indiceX + 1;
        }

    }

    public void exercicio05() {

        while (indiceY <= 1)
        {
            while (indiceX <= 2)
            {

                nomeJogoMatriz[indiceX][indiceY] = JOptionPane.showInputDialog("Digite o nome do Jogo" +" ["+indiceX+"]["+indiceY+"]");
                precoJogoMatriz[indiceX][indiceY] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Jogo"+" ["+indiceX+"]["+indiceY+"]"));

                indiceX = indiceX + 1;
            }
            indiceX = 0;
            indiceY = indiceY + 1;
        }
        
        indiceY = 0;
        indiceX = 0;
        
        while (indiceY <= 1)
        {
            while (indiceX <= 2)
            {

                JOptionPane.showMessageDialog(null, "Nome do Jogo: " + nomeJogoMatriz[indiceY][indiceX] + "\nPreço do Jogo: " + precoJogoMatriz[indiceY][indiceX]);

                indiceX = indiceX + 1;
            }
            indiceX = 0;
            indiceY = indiceY + 1;
        }
        indiceY = 0;
    }
    
    public void exercicio06(){
        
        for(indiceX = 0; indiceX < nomeJogoMatriz.length ; indiceX++){
            
            for(indiceY = 0; indiceY < nomeJogoMatriz[indiceX].length; indiceY++){
                
                nomeJogoMatriz[indiceX][indiceY] = JOptionPane.showInputDialog("Digite o Nome do Jogo" + " ["+ indiceX + "]["+ indiceY +"]");
                precoJogoMatriz[indiceX][indiceY] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Jogo"+"["+indiceX+"]["+indiceY+"]"));
            }
        }
        
        
        for(indiceX = 0; indiceX < nomeJogoMatriz.length ; indiceX++){
            
            for(indiceY = 0; indiceY < nomeJogoMatriz[indiceX].length; indiceY++){
                
                JOptionPane.showMessageDialog(null, "Nome do Jogo: " + nomeJogoMatriz[indiceX][indiceY] + "\nPreço do Jogo: " + precoJogoMatriz[indiceX][indiceY]);
                
            }
        }
        
    }
  
}
