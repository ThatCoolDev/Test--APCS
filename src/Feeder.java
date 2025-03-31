import java.util.Random;

public class Feeder {

    private int currentFood;

    public Feeder(int food) {

        currentFood = food;

    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void simulateOneDay(int numBirds) {
        //precondition numBirds > 0
        if (numBirds > 0) {
            Random rand = new Random();
            int randomNum = rand.nextInt(100);
            if (randomNum < 5) {
                // Bear eating the food
                currentFood = 0;
            }
            else {

                    int randNum2 = (int) ((Math.random() * 40) + 10);
                    currentFood -= currentFood * numBirds;

                    if (currentFood < 0) {
                        currentFood = 0;
                  }

        }

        }

    }

}
