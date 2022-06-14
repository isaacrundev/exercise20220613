package Parents.child;

public class Eel extends Fish {
    private boolean releaseElectricCharge;

    public Eel() {
        super();
        this.releaseElectricCharge = true;
    }

    public Eel(int height, int weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills,
            boolean releaseElectricCharge) {
        super(height, weight, animalType, bloodType, liveInWater, hasGills);
        this.releaseElectricCharge = releaseElectricCharge;
    }

    public boolean isReleaseElectricCharge() {
        return releaseElectricCharge;
    }

    public String showInfo() {
        return "Eel: animalType=" + getAnimalType() + ", bloodType=" + getBloodType() + ", height=" + getHeight()
                + ", weight="
                + getWeight() + ", Live in water=" + isLiveInWater() + ", Has gills=" + isHasGills()
                + ", Release electric charge=" + isReleaseElectricCharge()
                + "]";
    }
}
