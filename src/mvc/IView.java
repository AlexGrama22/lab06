package mvc;

import Desert.*;
import People.Chashier;
import People.Client;

public interface IView {
    public void printDesert(Client client, Muffin muffin, Donut donut, ChocolateDonut chocolateDonut,
                            CherryDonut CherryDonut, Cheesecake cheesecake, int whatDessert);

    public void coffeeOrdered(Client client, int randCoffee);

    public void timeForNextCustomer(int timeNextCustomer);

    public void simulationEnded();

//    public void isSimulationEnded();

    public void statistics(Chashier chashier, int dailyRevenue, int totalRevenue,
                           int day, int coffeeCounter, int desertCounter);

    public void hourlyRevenue(int hourlyRevenue, int hour);

    public void border();

    public void tipQuantity(int tip);

    public void checkPrice(Client client, int check);
}
