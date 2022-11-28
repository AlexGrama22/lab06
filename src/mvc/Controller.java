package mvc;

import Coffee.*;
import Desert.*;
import People.Chashier;
import People.Client;

import java.util.Random;
import java.util.Scanner;

public class Controller implements IController {
    View view = new View();
    Model model = new Model();

    @Override
    public void display() {
        Chashier chashier = model.getBarista(); //  Beginner, Intermediate, Expert.
        Client client = model.getClient();
        Random rand = model.getRandom();
        Scanner scanner = model.getScanner();
        Espresso espresso = model.getEspresso();
        Americano americano = model.getAmericano();
        Affogato affogato = model.getAffogato();
        Cappucino cappucino = model.getCappucino();
        Latte latte = model.getFlatWhite();
        IrishCoffee irishCoffee = model.getIrishCoffee();
        Macchiato macchiato = model.getMacchiato();
        Vienacoffe vienacoffe = model.getMochaccino();
        VietnameseCoffee vietnameseCoffee = model.getVietnameseCoffee();
        Muffin muffin = model.getMuffin();
        Donut donut = model.getDonut();
        ChocolateDonut chocolateDonut = model.getChocolateDonut();
        CherryDonut CherryDonut = model.getCherryDonut();
        Cheesecake cheesecake = model.getCheesecake();

        int timePassed = 0;
        int hourlyRevenue = 0;
        int dailyRevenue = 0;
        int totalRevenue = 0;
        int hour = 8;
        int day = 0;
        int simulation = 1;
        int coffeeCounter = 0;
        int desertCounter = 0;
        int xy= 1;

        while (true ) {

            int check = 0;
            int timeNextCustomer = client.timeBetweenCustomers(hour);
            timePassed += timeNextCustomer;
            view.timeForNextCustomer(timeNextCustomer);
            model.randomName(client, rand);
            model.willTipAndWantDesert(client, rand);


            int randCoffee = rand.nextInt(9) + 1;
            view.coffeeOrdered(client, randCoffee);
            timePassed = model.getTimePassed(chashier, espresso, americano, affogato, cappucino, latte, irishCoffee, macchiato, vienacoffe, vietnameseCoffee, timePassed, randCoffee);
            check = model.getPrice(espresso, americano, affogato, cappucino, latte, irishCoffee, macchiato, vienacoffe, vietnameseCoffee, check, randCoffee);
            coffeeCounter++;
            coffeeCounter++;

            if (client.isWantsDesert()) {
                int whatDessert = rand.nextInt(5) + 1;
                check = model.calculateSweet(muffin, donut, chocolateDonut, CherryDonut, cheesecake, check, whatDessert);
                view.printDesert(client, muffin, donut, chocolateDonut, CherryDonut, cheesecake, whatDessert);
                desertCounter++;
            }
            hourlyRevenue += check;

            view.checkPrice(client, check);

            if (client.isWillTip()) {
                int tip = rand.nextInt(20) + 1;
                view.tipQuantity(tip);
            }
            view.border();

            if (timePassed >= 60) {
                timePassed = 0;

                view.hourlyRevenue(hourlyRevenue, hour);
                hour++;
                dailyRevenue += hourlyRevenue;
                hourlyRevenue = 0;

                if (hour >= 20) {
                    dailyRevenue -= chashier.getSalary() + 500;
                    totalRevenue += dailyRevenue;
                    view.statistics(chashier, dailyRevenue, totalRevenue, day, coffeeCounter, desertCounter);
                    day++;
                    xy++;
                    hour = 8;
                    dailyRevenue = 0;
                    coffeeCounter = 0;
                    desertCounter = 0;

                }

//                view.isSimulationEnded();
//                simulation = scanner.nextInt();
//                if (simulation == 0) {
//                    view.simulationEnded();
//                    System.exit(0);
                }
            }
        }
    }
//}
