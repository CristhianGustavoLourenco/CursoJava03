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
public class ExemploHashMap {
    
    public static void main(String[] args) {

        String txt;
        float soma = 0;
        float media = 0;

        HashMap<String, String> cadastroPessoa = new HashMap<String, String>();

        cadastroPessoa.put("nome", "Cristhian");

        cadastroPessoa.put("sobreNome", "Lourenço");

        JOptionPane.showMessageDialog(null, cadastroPessoa.get("sobreNome"));

        //1 - Criar algoritimo com hashmap que tenhas seguintes dados: nome,
        // serie,Media
        //2 - Adicione 3 notas ao hash e some e calcule a medeia
        // -Interger.parseInt ou Double.parseDouble
        HashMap<String, String> cadastroAluno = new HashMap<String, String>();

        cadastroAluno.put("nomeAluno", "Cristhian");

        txt = "Seu nome é: " + cadastroAluno.get("nomeAluno");

        cadastroAluno.put("serieAluno", "9-B");

        txt += "\nSua Serie é: " + cadastroAluno.get("serieAluno");

        cadastroAluno.put("nota1", "9.5");

        soma += Float.parseFloat(cadastroAluno.get("nota1"));

        cadastroAluno.put("nota2", "9.0");

        soma += Float.parseFloat(cadastroAluno.get("nota2"));

        cadastroAluno.put("nota3", "10");

        soma += Float.parseFloat(cadastroAluno.get("nota3"));

        media = soma / 3;

        //cadastroAluno.put("mediaAluno", "9.5");
        txt += "\nSua Média é: " + media;

        JOptionPane.showMessageDialog(null, txt);

        JOptionPane.showMessageDialog(null, "Nome: "
                + cadastroAluno.get("nomeAluno")
                + "\nSerie: " + cadastroAluno.get("serieAluno")
                + "\nMédia: " + media);
    }    
}
