/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3_poliomorfisme;

//Overriding

class Movie {
    void watch() {
        System.out.println("Watching a movie on Netflix");
    }
}

class HorrorMovie extends Movie {
    @Override
    void watch() {
        System.out.println("Watching a horror movie on Netflix");
    }
}

class ComedyMovie extends Movie {
    @Override
    void watch() {
        System.out.println("Watching a comedy movie on Netflix");
    }
}

public class Watching {
    public static void main(String[] args) {
        Movie movie1 = new HorrorMovie();
        Movie movie2 = new ComedyMovie();

        movie1.watch(); // Output: Watching a horror movie on Netflix
        movie2.watch(); // Output: Watching a comedy movie on Netflix
    }
}

