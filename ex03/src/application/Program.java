package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 950.00));
        list.add(new Produto("Tv", 1200.00));
        list.add(new Produto("Tablet", 450.00));
        list.add(new Produto("Bala", 10.00));

        list.removeIf(p -> p.getPreco() >= 100.00); // remove produtos acima de 100 reais

        for(Produto p : list){
            System.out.println(p);
        }
    }
}
