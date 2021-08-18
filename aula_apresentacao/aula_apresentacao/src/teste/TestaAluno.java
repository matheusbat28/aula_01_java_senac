/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus.batista1
 */
public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
            aluno.setNome(JOptionPane.showInputDialog("insira seu nome :"));
        
        
            aluno.setSobrenome(JOptionPane.showInputDialog("insira seu sobrenome :"));
            aluno.setIdade(JOptionPane.showInputDialog("insira seu idade :"));

        float salario = Float.parseFloat(JOptionPane.
            showInputDialog("insira seu salario :"));
                aluno.setSalario(salario);
        
        long cpf = Long.parseLong(JOptionPane.
            showInputDialog("insira o cpf: "));
                aluno.setCpf(cpf);

    JOptionPane.showMessageDialog(null, "nome completo: " + aluno.getNome()
            + " " + aluno.getSobrenome() + "\nidade: " + aluno.getIdade()
            + "\nsálario: " + aluno.getSalario() + "\ncpf: " + aluno.getCpf());
   }


    }
