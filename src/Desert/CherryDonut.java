package Desert;

public class CherryDonut extends Donut {

    private String topping;

    public CherryDonut(String topping) {
        this.topping = "cherry";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getDesertPrice() {
        return 20;
    }
}
