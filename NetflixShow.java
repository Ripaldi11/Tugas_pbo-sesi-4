/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3_poliomorfisme;

//Overloading

public class NetflixShow {
    public void displayShowInfo(String showName) {
        System.out.println("Information about the show: " + showName);
    }

    public void displayShowInfo(String showName, int season) {
        System.out.println("Information about the show: " + showName + " - Season " + season);
    }

    public void displayShowInfo(String showName, int season, int episode) {
        System.out.println("Information about the show: " + showName + " - Season " + season + " Episode " + episode);
    }

    public static void main(String[] args) {
        NetflixShow netflix = new NetflixShow();

        netflix.displayShowInfo("Jurasic Park");
        netflix.displayShowInfo("Money Heist", 3);
        netflix.displayShowInfo("The Crown", 4, 2);
    }
}
