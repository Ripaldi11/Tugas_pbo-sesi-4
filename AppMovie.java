/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3_poliomorfisme;

//Overloading

class Netflix {
    public void watchContent(String content) {
        System.out.println("Watching " + content);
    }

    public void watchContent(String content, int duration) {
        System.out.println("Watching " + content + " for " + duration + " minutes");
    }
}

public class AppMovie {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        netflix.watchContent("Stranger Things");
        netflix.watchContent("The Crown", 60);
    }
}