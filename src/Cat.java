public class Cat {

    public String chipId;

    public Cat(String chipId) {
        this.chipId = chipId;
    }

    // getters
    public String getChipId() {
        return chipId;
    }


    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    @Override
    public String toString() {
        return "\nchipId = " + chipId + "}";
    }
}
