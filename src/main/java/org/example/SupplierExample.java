package org.example;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {


        // * É uma function que não tem parâmetro porem retorna um valor
        // * É usada para criar algo ou modificar alguma coisa do tipo T

        //esta passando o que sera retornado
        List<String> listaSaudacao = Stream.generate(() -> "ola seja bem vindo")

                //sera retornado 5 vezes e sera colocado, dentro de uma lista

                .limit(5)
                .toList();

        // vai printar tudo que tiver dento de listaSaudacao
        listaSaudacao.forEach(System.out::println);
    }
}
