/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiocompiladores;
import java.util.HashMap;
import java.util.Stack;
/**
 *
 * @author fh139
 */
public class Resposta {
    private HashMap<Character, Character> map;
    
    public Resposta(){
        this.map = new HashMap<Character, Character>();
        this.map.put(')', '(');
        this.map.put('}', '{');
        this.map.put(']', '[');
        this.map.put('>', '<');
    }
    
    public boolean validaEntrada(String entrada) {
        Stack<Character> pilha = new Stack<Character>();

        for (int i = 0; i < entrada.length(); i++) {
            char simbolo = entrada.charAt(i);

            if (this.map.containsKey(simbolo)) {
                char topo = pilha.empty() ? '#' : pilha.pop();
                
                if (topo != this.map.get(simbolo)) {
                    return false;
                }
            } else {
                pilha.push(simbolo);
            }
        }
        return pilha.isEmpty();
    }
}
