public class Catflap {
    public Mode startMode;


    public Mode FlapStatus;
    public Catflap(Mode FlapStatus) {
        this.FlapStatus = LUKKET;
    }



    public Catflap (Mode startMode) {
        this.startMode = startMode;
    }

    public Mode getStartMode() {
        return startMode;
    }

    public void setStartMode(Mode startMode) {
        this.startMode = startMode;
    }
}

    //getMode() / setMode(Mode mode)


    //registerCat(String chipId)


    //clearRegisteredCats()


    //isCatRegistered(String chipId)


    //canEnter(String chipId)


    //canExit(String chipId)



