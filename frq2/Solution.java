public class Bottle {
    private double currentAmount;
    private double capacity;

    public Bottle(double c) {
        currentAmount = c;
        capacity = c;
    }

    public double updateAmount(double amount) {
        currentAmount -= amount;
        if (currentAmount < 0.25*capacity) {
            currentAmount = capacity;
        }
        return currentAmount;
    }
}
