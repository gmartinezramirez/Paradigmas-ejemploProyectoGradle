package com.paradigmas.shoppingsystem;

import com.paradigmas.shoppingsystem.TDA.Article;
import com.paradigmas.shoppingsystem.TDA.ShoppingList;
import com.paradigmas.shoppingsystem.TDA.ShoppingSystem;
import com.paradigmas.shoppingsystem.TDA.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * Aca deben comentar en javadoc
     *
     * @param args
     */

    public static void main(String[] args) {

        ShoppingList initialShoppingList = crearListaInicial();

        // Creacion de usuarios
        User user1 = new User("username1", "password");
        User user2 = new User("username2", "password");
        List<User> users = Arrays.asList(user1, user2);


        // Creacion ShoppingSystem
        // ShoppingSystem es el contenedor, tal como stackoverflow o redsocial
        ShoppingSystem shoppingSystem = new ShoppingSystem(users);
        System.out.println(shoppingSystem.toString());

        // Login
        user1.login();
        System.out.println(shoppingSystem.toString());

        System.out.println(initialShoppingList.getArticles().get(0).getId());
        System.out.println(initialShoppingList.getArticles().get(1).getId());
        System.out.println(initialShoppingList.getArticles().get(2).getId());

        initialShoppingList.getArticles().add(new Article("articleN", 213.1, 10));


        System.out.println(initialShoppingList.getArticles().get(3).getName());
        System.out.println(initialShoppingList.getArticles().get(3).getId());

        System.out.println(initialShoppingList.getArticles().get(2).getId());

    }

    private static ShoppingList crearListaInicial() {

        List<Article> articles = new ArrayList<>(Arrays.asList(
                new Article("article1", 123.1, 1),
                new Article("article2", 999.9, 6),
                new Article("article3", 941.1, 5)));
        return new ShoppingList("Lista de compras", articles, 0.0);
    }

}
