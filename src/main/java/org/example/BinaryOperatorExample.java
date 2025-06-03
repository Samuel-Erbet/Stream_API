package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        /*
        basicamente serve para somar ou combinar elementos do mesmo tipo T e retornar um resultado do tipo T
        é utilizada para operações de redução de elementos como soma ou combinações
        */


        // a lista dos numeros que serão somados
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        // o modo que será somado em lambda
        BinaryOperator<Integer> soma = (num1 , num2) -> num1 + num2;

        // o resultado da soma será armazenado dentro de uma váriavel
        int resultado = numeros.stream()
                .reduce(0,soma);

        System.out.println("o resultado foi "+resultado);


        // mesmo procedimento acima, porém com string e usando lambda para o metodo
        List<String> palavras = Arrays.asList(" Bless" ," me" ," with", " the\n", " Leaf" ," of" ," the"," tree\n", " On" ," it" ," I ","see\n"," The"," freedom"," reign\n");

        String resposta = palavras.stream()
                .reduce(String.valueOf(0), (p1,p2)-> p1 +p2);

        System.out.println("the eyes can see\n"+resposta);
    }
}
