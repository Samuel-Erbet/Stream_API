package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //aceita um parametro do tipo t e retorna um valor boolean
        // é usado para filtrar os elementos do stream em uma condição


        List<String> linguagens = Arrays.asList("java","c#","c","kotlin","rust","javascript", "cobool","python","");

        // essa é a condição para retornar o valor
        Predicate<String> maisDe5char =  linguagem -> linguagem.length() > 5;


        //no final ele vai printar tudo o que tem mais de 5 letras
        linguagens.stream()
                .filter(maisDe5char)
                .forEach(System.out::println);



        // esse é o método mais curtinho
        linguagens.stream()
                .filter(linguagen -> linguagen.length()>5)
                .forEach(System.out::println);
    }
}




















