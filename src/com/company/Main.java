package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Let's play some Roulette");
        System.out.println("Enter the type of bet you would like to place (red|black|even|odd|high|low): ");
        String typeBet = scanner.nextLine();
        System.out.println("Enter in you bet amount:");
        int betAmount = scanner.nextInt();



        String Red = "Betting that the next roll will come up red";
        String Black = " Betting that the next roll will come up black";

        int randomGen = random.nextInt(36) + 1;
        int Even = random.nextInt(36) + 1;
        int Odd = random.nextInt(36) + 1;

        int Low = random.nextInt(18) + 1;
        int High = random.nextInt(36) + 19;


        if(typeBet == "red"){
            System.out.println("Your machine will turn red");
        }else if (typeBet == Black){
            System.out.println("You'are betting the next roll will come up black");
        }else if (typeBet.equals(Even)){

        }





    }
}
