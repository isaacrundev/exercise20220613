package Parents.child;

import Parents.Animal;

public class Birds extends Animal {
    private boolean animalWithFeathers;
    private boolean canFly;

    public Birds() {
        super();
        super.setAnimalType("Birds");

    }

    public Birds(int height, int weight, String animalType, String bloodType, boolean animalWithFeathers,
            boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.animalWithFeathers = animalWithFeathers;
        this.canFly = canFly;
    }

    public boolean isAnimalWithFeathers() {
        return animalWithFeathers;
    }

    public void setAnimalWithFeathers(boolean animalWithFeathers) {
        this.animalWithFeathers = animalWithFeathers;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

}
