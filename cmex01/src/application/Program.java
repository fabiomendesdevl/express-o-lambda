package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 1500.00));
        list.add(new Produto("Tablet", 950.50));
        list.add(new Produto("Celular", 1600.00));

        list.sort((p1, p2)-> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        for(Produto p : list){
            System.out.println(p);
        }

        sc.close();
    }
}
