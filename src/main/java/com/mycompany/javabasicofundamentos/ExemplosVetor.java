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
public class ExemplosVetor {
    public static void main(String[] args) {
        new ExemplosVetor().exemplo01();
    }

    public void exemplo01() {
        String nome1 = "Francisco";
        String nome2 = "Jão";
        String nome3 = "Maria";

        // Vetor de string com 3 posições, sendo a 1ª posição o indice 0
        String[] nomes = new String[3];
        nomes[0] = "Francisco"; // Primeira posição
        nomes[1] = "Jão"; // Segunda posição
        nomes[2] = "Maria"; // Terceira posição

        nomes[1] = "João";

        System.out.println("Primeira posição: " + nomes[0]);
        System.out.println("Segunda posição: " + nomes[1]);
        System.out.println("Terceira posição: " + nomes[2]);
    }

    public void exemplo02() {
        // Vetor de string com 3 posições, sendo a 1ª posição o indice 0
        String[] nomes = new String[3];
        nomes[0] = JOptionPane.showInputDialog("Digite o nome da pessoa"); // Primeira posição
        nomes[1] = JOptionPane.showInputDialog("Digite o nome da pessoa"); // Segunda posição
        nomes[2] = JOptionPane.showInputDialog("Digite o nome da pessoa"); // Terceira posição

        JOptionPane.showMessageDialog(null,
                "Primeira posição: " + nomes[0]
                + "\nSegunda posição: " + nomes[1]
                + "\nTerceira posição: " + nomes[2]);
    }
    
        public void exemplo03(){
        // Solicitar e armazenar 4 números
        // tipo[] nomeVetor = new tipo[quantidadeElementos];
        int[] numeros = new int[4];
        
        numeros[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        numeros[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        numeros[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        numeros[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        
        int soma = numeros[0] + numeros[1] + numeros[2] + numeros[3];
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}
