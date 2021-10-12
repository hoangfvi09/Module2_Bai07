package TH1.Animal;

import TH1.Edible.Edible;

public class Chicken extends Animal implements Edible {
    public String howToEat(){
        return "could be fried";
    }
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
}
