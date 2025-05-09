
public class Pet extends Entity{

    public Pet(String name) {
        super(name);
    }

    @Override
    public void play() {
        energy -= 10;
        if (energy < 0) {
            energy = 0;
        }
        hunger -= 5;
        if (hunger < 0) {
            hunger = 0;
        }
        if (energy > 0) {
            happiness += 10;
            if (happiness > 100) {
                happiness = 100;
            }
            message = "Your pet is happy and playing!";
        } else {
            message = "Your pet is too tired to play.";
        }
        status();
    }

    @Override
    public void feed() {
        hunger += 10;
        if (hunger > 100) {
            hunger = 100;
        }
        energy -= 5;
        if (energy < 0) {
            energy = 0;
        }
        if (hunger > 0) {
            happiness += 15;
            if (happiness > 100) {
                happiness = 100;
            }
            message = "Your pet is full.";
        } else {
            happiness -= 15;
            if (happiness < 0) {
                happiness = 0;
            }
            message = "Your pet is starving.";
        }
        status();
    }

    @Override
    public void sleep() {
        energy += 20;
        if (energy > 100) {
            energy = 100;
        }
        hunger -= 5;
        if (hunger < 0) {
            hunger = 0;
        }
        message = "Your pet is sleeping.";
        status();
    }
    public void status(){
        if(energy == 0 && hunger == 0){
            happiness -= 15;
            message = "Pet is starting to feel unhappy";
        }
        if(happiness < 0 ){
            message = "Pet is unhappy with the owner";
        }
    }
}