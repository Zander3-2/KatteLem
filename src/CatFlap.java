import java.util.ArrayList;

public class CatFlap {

    public Mode flapStatus;

    public CatFlap(Mode flapStatus) {
        this.flapStatus = Mode.LUKKET;
    }


    //Getters
    public Mode getFlapStatus() {
        return flapStatus;
    }

    //Setters
    public void setFlapStatus(Mode flapStatus) {
        this.flapStatus = flapStatus;
    }


    //toString (slet måske??)

    @Override
    public String toString() {
        return "flapStatus: " + flapStatus;
    }




    ArrayList<Cat> allCats = new ArrayList<>();

    //tilføj ny cat
    public void addNewCat(Cat cat) {
        allCats.add(Cat);
    }


//registerCat(String chipId)

    public registerExistingCat() {
        try ((for Cat cat : cats) {
            if (cat.isRegistered()) {
                catFlapTestClass.allCats.add(cat);
            }
        }
    }


//clearRegisteredCats()



//isCatRegistered(String chipId)


//canEnter(String chipId)


//canExit(String chipId)


}
