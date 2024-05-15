package org.learnings;

public class FavoriteFoods {
    public static void main(String[] args) {
        String[] foods = {
                "Pizza",
                "Pasta",
                "Sushi",
                "Hamburger",
                "Tacos",
                "Gelato",
                "Pane",
                "Insalata",
                "Pollo",
                "Frutta"
        };
        System.out.println("Lunghezza della classifica: " + foods.length);
        System.out.println("Cibo in cima alla classifica: " + foods[0]);
        System.out.println("Ultimo cibo della classifica: " + foods[foods.length-1]);
        System.out.println("Cibo a metà della classifica: " + foods[foods.length/2]);
    }
}
