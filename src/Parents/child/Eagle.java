package Parents.child;

public class Eagle extends Birds {

    public Eagle() {
        super();
    }

    public Eagle(int height, int weight, String animalType, String bloodType, boolean animalWithFeathers,
            boolean canFly) {
        super(height, weight, animalType, bloodType, animalWithFeathers, canFly);
    }

    public String showInfo() {
        return "Eagle: animalType=" + getAnimalType() + ", bloodType=" + getBloodType() + ", height=" + getHeight()
                + ", weight="
                + getWeight() + ", animal with feathers=" + isAnimalWithFeathers() + ", Can fly=" + isCanFly()
                + "]";
    }
}
