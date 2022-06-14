package Parents.child;

public class Crocodile extends Reptile {

    public Crocodile() {
        super();
        setEggType("Hard-shelled eggs");
    }

    public Crocodile(int height, int weight, String animalType, String bloodType, String skinType, String bone,
            String eggType) {
        super(height, weight, animalType, bloodType, skinType, bone, eggType);
    }

    public String showInfo() {
        return "Crocodile: animalType=" + getAnimalType() + ", bloodType=" + getBloodType() + ", height=" + getHeight()
                + ", weight="
                + getWeight() + ", skinType=" + getSkinType() + ", boneType=" + getBone() + ", eggType=" + getEggType()
                + "]";
    }

}
