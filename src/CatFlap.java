public class CatFlap {

    public Mode flapStatus;
    public boolean gateOpen;


    public CatFlap(Mode flapStatus, boolean gateOpen) {
        this.flapStatus = Mode.LUKKET;
        this.gateOpen = false;
    }


    //Getters
    public Mode getFlapStatus() {
        return flapStatus;
    }

    public boolean getGateOpen() {
        return gateOpen;
    }


    //Setters
    public void setFlapStatus(Mode flapStatus) {
        this.flapStatus = flapStatus;
    }

    public void setGateOpen(boolean gateOpen) {
        this.gateOpen = gateOpen;
    }

    //toString (slet måske??)

    @Override
    public String toString() {
        return "flapStatus: " + flapStatus + "\nGateOpen: " + gateOpen;
    }

}

//getMode() / setMode(Mode mode)


//registerCat(String chipId)


//clearRegisteredCats()


//isCatRegistered(String chipId)


//canEnter(String chipId)


//canExit(String chipId)




