package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static int compareProdutos(Produto p1, Produto p2){
        return p1.getPreco().compareTo(p2.getPreco());
    }

    public static void main(String[] args) {

        List<Produto> list= new ArrayList<>();

        list.add(new Produto("TV", 900.00));
        list.add(new Produto("Notebook", 1200.00));
        list.add(new Produto("Tablet", 450.00));

        list.sort(Program::compareProdutos);

        list.forEach(System.out::println);

    }
}
