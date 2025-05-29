package org.example;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {

        List<String> listaSaudacao = Stream.generate(() -> "ola seja bem vindo")
                .limit(5)
                .toList();


        listaSaudacao.forEach(System.out::println);
    }
}
