
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
    public String gerarNomeCompleto(){
        String[] nomes = {"joão", "maria", "matheus", "nataly", "silvio", 
            "pedro", "lucas", "josé", "heloisa", "marisa", "adam", "tania", 
            "cassia", "antonia", "antony", "samara", "hugo", "leticia", "suelen",
        "ana", "osvaldo"};
        int indice = (int) (Math.random()* nomes.length);
        return nomes[indice] + " " + gerarSobrenomes();
    }
    private String gerarSobrenomes(){
        String[] sobrenomes = {"silva", "batista", "butka", "carvalho", "pereira", 
            "peixoto"};
        int indice = (int) (Math.random()* sobrenomes.length);
        return sobrenomes[indice];
    }
    public  String formatarCpf(){
         return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + 
                 "-" + gerarNumero(2);
    }
    public String gerarCnpj(){
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3)+ "/"
                + gerarNumero(4) + "-" + gerarNumero(2);
    }
    public String gerarTfFixo(){
        return "(48)3"+ gerarNumero(3) + "-" + gerarNumero(4);
    }
    public String gerarTfCelular(){
        return "(48)9"+ gerarNumero(4) + "-" + gerarNumero(4);
    }
    public String gerarCep(){
        return gerarNumero(5) + "-" + gerarNumero(3);
    }

    

    //public String gerarCpfAleatorio() {
    //}    
    public static void main(String[] args){
        geradorUtil teste = new geradorUtil();
        
        System.out.println(teste.formatarCpf());
        System.out.println(teste.gerarCnpj());
        System.out.println(teste.gerarTfFixo());
        System.out.println(teste.gerarTfCelular());
        System.out.println(teste.gerarCep());
        System.out.println(teste.gerarNomeCompleto());
    }
}