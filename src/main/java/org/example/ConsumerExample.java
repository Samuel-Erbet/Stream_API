package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        // metodo que não recebe argumentos e que não retorna nada também

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);

        // metodo mais simples utilizando lambda
        numeros.stream().forEach(n ->{
            if (n %2 ==0){
                System.out.println(n);
            }
        });


        // metodo mais complicadinho e meio desnecessário
        Consumer<Integer> numeroPar = numero ->{
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        //metodo mais simples usando a propria ide


        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer numero) {
                if (numero %2 ==0){
                    System.out.println(numero);
                }
            }
        });
    }
}
