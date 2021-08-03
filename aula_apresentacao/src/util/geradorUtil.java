
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author matheus.batista1
 */
public class geradorUtil {

    public double gerarSalario() {
        int salaroAleatorio = (int) (Math.random() * 100000);
        return salaroAleatorio;
    }

    public String gerarNumero(int quantidade) {
        String senha = "";
        int numero;
        for (int i = 0; i < quantidade; i++) {
            numero = (int) (Math.random() * 10);
            senha += numero;
        }
        return senha;
    }
    public  String formatarCpf(){
         return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + 
                 "-" + gerarNumero(2);
    }

    //public String gerarCpfAleatorio() {
    //}    
    public static void main(String[] args) {
        geradorUtil util = new geradorUtil();
        System.out.println(util.formatarCpf());
    }
}
