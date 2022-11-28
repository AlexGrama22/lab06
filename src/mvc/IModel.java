package mvc;

import Coffee.*;
import Desert.*;
import People.Chashier;
import People.Client;

import java.util.Random;
import java.util.Scanner;

public interface IModel {
    public Chashier getBarista();
    public Espresso getEspresso();

    public int calculateSweet(Muffin muffin, Donut donut, ChocolateDonut chocolateDonut,
                              CherryDonut CherryDonut, Cheesecake cheesecake, int check, int whatDessert);

    public void willTipAndWantDesert(Client client, Random rand);

    public Scanner getScanner();

    public Random getRandom();

    public Client getClient();

    public void randomName(Client client, Random rand);

    public int getPrice(Espresso espresso, Americano americano, Affogato affogato, Cappucino cappucino,
                        Latte latte, IrishCoffee irishCoffee, Macchiato macchiato,
                        Vienacoffe vienacoffe, VietnameseCoffee vietnameseCoffee, int check, int randCoffee);

    public int getTimePassed(Chashier chashier, Espresso espresso, Americano americano, Affogato affogato,
                             Cappucino cappucino, Latte latte, IrishCoffee irishCoffee, Macchiato macchiato,
                             Vienacoffe vienacoffe, VietnameseCoffee vietnameseCoffee, int timePassed, int randCoffee);

    public Cheesecake getCheesecake();

    public CherryDonut getCherryDonut();

    public Donut getDonut();

    public ChocolateDonut getChocolateDonut();

    public Muffin getMuffin();

    public VietnameseCoffee getVietnameseCoffee();

    public Vienacoffe getMochaccino();

    public Macchiato getMacchiato();

    public IrishCoffee getIrishCoffee();

    public Latte getFlatWhite();

    public Cappucino getCappucino();

    public Affogato getAffogato();

    public Americano getAmericano();
}
