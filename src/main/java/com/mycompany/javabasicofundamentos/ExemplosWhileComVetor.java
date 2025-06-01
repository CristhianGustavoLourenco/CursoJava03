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
public class ExemplosWhileComVetor {
    
    public static void main(String[] args) {
        new ExemplosWhileComVetor().exemplo01();
    }

    public void exemplo01() {
        // Solicitar e armazenar 4 números
        // tipo[] nomeVetor = new tipo[quantidadeElementos];
        int[] numeros = new int[4];

        int indice = 0;
        while (indice < 4) {
            numeros[indice] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
            indice = indice + 1;
        }

//        int soma = numeros[0] + numeros[1] + numeros[2] + numeros[3];
        int soma = 0;
        indice = 0;
        while (indice < 4) {
            soma = soma + numeros[indice];
            indice = indice + 1;
        }
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}
