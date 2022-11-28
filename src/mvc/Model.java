package mvc;

import Coffee.*;
import Desert.*;
import People.Chashier;
import People.Client;

import java.util.Random;
import java.util.Scanner;

public class Model implements IModel{
    @Override
    public Chashier getBarista() {
        return new Chashier("Beginner");
    }
    @Override
    public Espresso getEspresso() {
        return new Espresso();
    }
    @Override
    public int calculateSweet(Muffin muffin, Donut donut, ChocolateDonut chocolateDonut, CherryDonut CherryDonut, Cheesecake cheesecake, int check, int whatDessert) {
        switch (whatDessert) {
            case 1:
                check += muffin.getDesertPrice();
                break;
            case 2:
                check += donut.getDesertPrice();
                break;
            case 3:
                check += chocolateDonut.getDesertPrice();
                break;
            case 4:
                check += CherryDonut.getDesertPrice();
                break;
            case 5:
                check += cheesecake.getDesertPrice();
                break;
        }
        return check;
    }

    @Override
    public void willTipAndWantDesert(Client client, Random rand) {
        int randomWillTip = rand.nextInt(2) + 1;
        client.setWillTip(randomWillTip != 1);

        int randomWantsDesert = rand.nextInt(2) + 1;
        client.setWantsDesert(randomWantsDesert != 1);
    }
    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    @Override
    public Random getRandom() {
        return new Random();
    }
    @Override
    public Client getClient() {
        return new Client("client");
    }
    @Override
    public void randomName(Client client, Random rand) {
        int randName = rand.nextInt(5) + 1;
        if (randName == 1) {
            client.setName("Sandu");
        } else if (randName == 2) {
            client.setName("Alex");
        } else if (randName == 3) {
            client.setName("Stefan");
        } else if (randName == 4) {
            client.setName("Mike");
        } else {
            client.setName("Rodica");
        }
    }
    @Override
    public int getPrice(Espresso espresso, Americano americano, Affogato affogato, Cappucino cappucino, Latte latte, IrishCoffee irishCoffee, Macchiato macchiato, Vienacoffe vienacoffe, VietnameseCoffee vietnameseCoffee, int check, int randCoffee) {
        switch (randCoffee) {
            case 1:
                check += espresso.getPrice();
                break;
            case 2:
                check += americano.getPrice();
                break;
            case 3:
                check += affogato.getPrice();
                break;
            case 4:
                check += cappucino.getPrice();
                break;
            case 5:
                check += latte.getPrice();
                break;
            case 6:
                check += irishCoffee.getPrice();
                break;
            case 7:
                check += macchiato.getPrice();
                break;
            case 8:
                check += vienacoffe.getPrice();
                break;
            case 9:
                check += vietnameseCoffee.getPrice();
                break;
        }
        return check;
    }
    @Override
    public int getTimePassed(Chashier chashier, Espresso espresso, Americano americano, Affogato affogato, Cappucino cappucino, Latte latte, IrishCoffee irishCoffee, Macchiato macchiato, Vienacoffe vienacoffe, VietnameseCoffee vietnameseCoffee, int timePassed, int randCoffee) {
        switch (randCoffee) {
            case 1:
                timePassed += espresso.getTimeToPrepare() + chashier.skill();
                chashier.setCoffeeMade("Espresso");
                break;
            case 2:
                timePassed += americano.getPrice() + chashier.skill();
                chashier.setCoffeeMade("Americano");
                break;
            case 3:
                timePassed += affogato.getTimeToPrepare() + chashier.skill();
                chashier.setCoffeeMade("Affogato");
                break;
            case 4:
                timePassed += cappucino.getTimeToPrepare() + chashier.skill();
                chashier.setCoffeeMade("Cappucino");
                break;
            case 5:
                timePassed += latte.getTimeToPrepare() + chashier.skill();
                chashier.setCoffeeMade("FlatWhite");
                break;
            case 6:
                timePassed += irishCoffee.getTimeToPrepare() + chashier.skill();
                chashier.setCoffeeMade("IrishCoffee");
                break;
            case 7:
                timePassed += macchiato.getTimeToPrepare() + chashier.skill();
                chashier.setCoffeeMade("Macchiato");
                break;
            case 8:
                timePassed += vienacoffe.getTimeToPrepare() + chashier.skill();
                chashier.setCoffeeMade("Mochaccino");
                break;
            case 9:
                timePassed += vietnameseCoffee.getTimeToPrepare() + chashier.skill();
                chashier.setCoffeeMade("VietnameseCoffee");
                break;
        }
        return timePassed;
    }

    @Override
    public Cheesecake getCheesecake() {
        return new Cheesecake();
    }
    @Override
    public CherryDonut getCherryDonut() {
        return new CherryDonut("cherry");
    }
    @Override
    public Donut getDonut() {
        return new Donut();
    }
    @Override
    public ChocolateDonut getChocolateDonut() {
        return new ChocolateDonut("chocolate");
    }
    @Override
    public Muffin getMuffin() {
        return new Muffin();
    }
    @Override
    public VietnameseCoffee getVietnameseCoffee() {
        return new VietnameseCoffee();
    }
    @Override
    public Vienacoffe getMochaccino() {
        return new Vienacoffe();
    }
    @Override
    public Macchiato getMacchiato() {
        return new Macchiato();
    }
    @Override
    public IrishCoffee getIrishCoffee() {
        return new IrishCoffee();
    }
    @Override
    public Latte getFlatWhite() {
        return new Latte();
    }
    @Override
    public Cappucino getCappucino() {
        return new Cappucino();
    }
    @Override
    public Affogato getAffogato() {
        return new Affogato();
    }
    @Override
    public Americano getAmericano() {
        return new Americano();
    }

}
