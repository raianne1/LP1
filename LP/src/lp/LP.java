/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class LP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   /* Construa um programa em java para ler
uma matriz 3 x 2 de números inteiros. Em
seguida crie outra matriz, somando 1 ao
valor da primeira posição da matriz original,
2 ao valor da segunda posição e assim por
diante, até somar 6 à ultima posição,
percorrendo primeiro as linhas. Ao final,
mostrar todos elementos da segunda
matriz, linha por linha. */  
   
   int cont = 0;
   
   int num [][] = new int[3][2];
    
   int soma [][] = new int [3][2];
   
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 2; j++)
            {
                num[i][j] = Integer.parseInt( JOptionPane.showInputDialog("Preencha a matriz"));
        
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 2; j++) 
            {
                soma[i][j] = num[i][j] + cont;
                    
            }
        }
    
    
    
    
    
    
    
    
    
    }
    
}
