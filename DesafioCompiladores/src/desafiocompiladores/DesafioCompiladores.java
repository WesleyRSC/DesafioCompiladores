/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiocompiladores;


import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author fh139
 */
public class DesafioCompiladores {

    public static void main(String[] args) {
        
        Resposta resp = new Resposta();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite aqui sua linha de caracteres contendo <{[()]}>");
        System.out.println();
        String entrada = input.next();

        if(resp.validaEntrada(entrada))
            System.out.println(entrada + " - Válido");
        else
            System.out.println(entrada + " - Inválido");
    }
}
