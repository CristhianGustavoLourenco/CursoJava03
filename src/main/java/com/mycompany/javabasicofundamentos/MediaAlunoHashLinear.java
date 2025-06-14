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
public class MediaAlunoHashLinear {

    public static void main(String[] args) {

        HashMap<String, HashMap<String, Float>> cadAluno = new HashMap<String, HashMap<String, Float>>();

        String txt = "";

        for (int i = 0; i < 1; i++)
        {
            cadAluno = cadastroALuno();

        }

        for (String nome : cadAluno.keySet())
        {
            txt += "Nome: " + nome;

            for (String status : cadAluno.get(nome).keySet())
            {

                txt += " media: " + cadAluno.get(nome).get(status);
                txt += " status: " + status + "\n";

            }
        }

        JOptionPane.showMessageDialog(null, txt);

    }

    public static HashMap<String, HashMap<String, Float>> cadastroALuno() {

        String nome;
        int idade;
        float nota1, nota2, nota3;
        HashMap<String, HashMap<String, Float>> cadAluno = new HashMap<String, HashMap<String, Float>>();
        HashMap<String, Float> dadosAluno = new HashMap<String, Float>();

        nome = JOptionPane.showInputDialog("DIgite o Nome do Aluno");
        idade = Integer.parseInt(JOptionPane.showInputDialog("DIgite a Idade do Aluno"));

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 1"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 2"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 3"));

        float media = cauculaMedia(nota1, nota2, nota3);

        String status = verificaStatus(media);

        dadosAluno.put(status, media);
        cadAluno.put(nome, dadosAluno);

        return cadAluno;

    }

    public static float cauculaMedia(float nota1, float nota2, float nota3) {

        float media = (nota1 + nota2 + nota3) / 3;

        return media;

    }

    public static String verificaStatus(float media) {

        String status = "Reprovado";

        if (media >= 7)
        {

            status = "Aprovado";
        } else if (media >= 4)
        {
            status = "Recuperação";
        }

        return status;

    }
}
