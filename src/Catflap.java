public class Catflap {
    public String chipID;
    public boolean startMode;
    public boolean isRegistered;

    public Catflap (String chipID, boolean startMode, boolean isRegistered) {
        this.chipID = chipID;
        this.startMode = startMode;
        this.isRegistered = isRegistered;
    }

    public boolean getStartMode() {
        return startMode;
    }

    public void setStartMode(boolean startMode) {
        this.startMode = startMode;
    }

    public boolean getRegisterStatus() {
        return isRegistered;
    }

    public void setRegisterStatus(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    }
    public FlapStatus FlapStatus;

    public Catflap(FlapStatus LUKKET){
        this.FlapStatus = LUKKET;
}

    //getMode() / setMode(Mode mode)


    //registerCat(String chipId)


    //clearRegisteredCats()


    //isCatRegistered(String chipId)


    //canEnter(String chipId)


    //canExit(String chipId)


    }

