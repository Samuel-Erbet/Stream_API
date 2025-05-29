package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // usa a função para dobrar todos os números e coloca-los em uma lista
        List<Integer> vezes2 = numeros.stream()
                .map(n -> n * 2)
                .toList();

        // que sera printada depois
        vezes2.forEach(System.out::println);
    }
}
