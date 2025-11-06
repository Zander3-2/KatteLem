public class Cat {

    public String chipId;
    public boolean isRegistered;

    public Cat(String chipId, boolean isRegistered) {
        this.chipId = chipId;
        this.isRegistered = isRegistered;
    }

    // getters
    public String getChipId() {
        return chipId;
    }

    public boolean getIsRegistered() {
        return isRegistered;
    }

    // setters
    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    @Override
    public String toString() {
        return "\nchipId = " + chipId + ", (isRegistered = " + isRegistered + ")}";
    }
}
