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
public class ExemplosWhile {
    public static void main(String[] args) {
        new ExemplosWhile().exemploa1();
    }

    public void exemploa1() {
        while (1 == 1) {
            System.out.println("Olá mundo!");
        }
    }

    public void exemplo02() {
        int quantidadePessoas = 0;
        while (quantidadePessoas < 3) {

            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
            quantidadePessoas = quantidadePessoas + 1;
            System.out.println(quantidadePessoas);
        }

    }

    public void exemplo03() {
        // Solicitar o nome, idade, peso, empregado para a qtd de pessoas desejadas
        // String => texto
        // int => números inteiros
        // float => números reais
        // boolean => lógico => true ou false
        // char => 1 caracter
        int indice = 0;
        int quantidadeDesejada = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a quantidade desejada para cadastrar"));

        // Repete enquanto que não solicitou os dados para quantidade de pessoas desejadas
        while (indice <= quantidadeDesejada - 1) {
            // Solicita o nome
            String nome = JOptionPane.showInputDialog("Digite o nome");
            // Solicita a idade
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o idade"));
            // Repete enquanto a idade for menor que 18 anos
            while (idade < 18) {
                // Apresenta mensagem informando que a idade mínima é 18 anos
                JOptionPane.showMessageDialog(null, "Idade mínima 18 anos");
                // Solicita a idade
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o idade"));
            }
            // Solicita o peso
            float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));
            // Solicita se está ou n empregado
            boolean empregado = Boolean.parseBoolean(JOptionPane.showInputDialog("Empregado => true, Desempregado => false"));

            // Calcula o ano de nascimento
            int anoAtual = 2024;
            int anoNascimento = anoAtual - idade;

            // Cria uma variável para armazenar o sim ou não se está empregado
            String empregadoTexto = "";
            if (empregado == true) {
                empregadoTexto = "Sim";
            } else {
                empregadoTexto = "Não";
            }

            // Apresenta uma mensagem informando os dados processados
            JOptionPane.showMessageDialog(null,
                    "Nome: " + nome
                    + "\nIdade: " + idade
                    + "\nAno nascimento: " + anoNascimento
                    + "\nPeso: " + peso
                    + "\nEmpregado: " + empregadoTexto
            );
            // Incrementa a variável indice em 1, ou seja, já solicitou os dados de + 1 pessoa
            indice = indice + 1;
        }
    }

    public void exemplo04() {
        /* Calcular a folha de pagamento solicitando se deseja calcular novamente, solicite:
            - quantidade de horas
            - valor hora
            - possuí Unimed (plano de saúde => desconto de 5%)
            - possuí SulAmerica (plano de saúde => desconto de 5%)
            - faz faculdade (auxílio de R$ 500)
            Calcular o valor bruto e líquido (valor bruto - descontos + acrescimos)
         */
        int respostaDesejaCadastrar = JOptionPane.YES_OPTION;
        String[] opcoesPlanoSaude = new String[]{"Unimed", "SulAmérica", "Nenhum"};

        while (respostaDesejaCadastrar == JOptionPane.YES_OPTION) {
            int quantidadeHora = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas"));
            float valorHora = Float.parseFloat(
                    JOptionPane.showInputDialog("Digite o valor hora"));
            int respostaPlanoSaude = JOptionPane.showOptionDialog(
                    null, "Escolha o plano de saúde", "ProWaySis",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    opcoesPlanoSaude, "SulAmérica");
            int respostaFazFaculdade = JOptionPane.showInternalConfirmDialog(
                    null, "Faz faculdade?", "ProWaySis",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            float salarioBruto = valorHora * quantidadeHora;
            float descontos = 0;
            float acrescimos = 0;

            // 0 é o indice da Unimed
            // 1 é o indice da SulAmérica
            if (respostaPlanoSaude == 0 || respostaPlanoSaude == 1) {
                float valorDescontoPlanoSaude = (5 * salarioBruto) / 100;
                descontos = descontos + valorDescontoPlanoSaude;
            }
            if (respostaFazFaculdade == JOptionPane.YES_OPTION) {
                acrescimos = acrescimos + 500;
            }

            double salarioLiquido = salarioBruto - descontos + acrescimos;

            JOptionPane.showMessageDialog(null,
                    "\nSalário Bruto: " + salarioBruto
                    + "\nSalário Líquido: " + salarioLiquido);

            respostaDesejaCadastrar = JOptionPane.showConfirmDialog(
                    null, "Deseja calcular a folha de pagamento novamente?",
                    "ProWaySis", JOptionPane.YES_NO_OPTION);
        }
    }
}
