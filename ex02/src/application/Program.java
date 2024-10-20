package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Notebook", 1200.00));
        list.add(new Produto("Tablet", 450.00));

        //comp vai ser uma função que recebe 2 argumentos p1 e p2
        //Comparator<Produto> comp = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        // e a implementação da função vai ser oque tiver entre chaves{}

        list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        for (Produto p : list) {
            System.out.println(p);
        }
    }
}