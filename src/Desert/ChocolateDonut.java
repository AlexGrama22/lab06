package Desert;
public class ChocolateDonut extends Donut {

    private String filling;

    public ChocolateDonut(String filling) {
        this.filling = "chocolate";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getDesertPrice() {
        return 25;
    }
}
