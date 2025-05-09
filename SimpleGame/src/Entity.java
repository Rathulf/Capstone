public abstract  class Entity {
    protected String name;
    protected int happiness;
    protected int hunger;
    protected int energy;
    protected String message = "";

    public Entity(String name){
        this.name = name;
        this.happiness = 100;
        this.hunger = 100;
        this.energy = 100;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public String getMessage() {
        return message;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public abstract void play();
    public abstract void feed();
    public abstract void sleep();

}
