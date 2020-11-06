public class Boat extends Vehicle{

    private double mpg;

    public Boat(double mpg){
        this.mpg = mpg;
        nVehicles = nVehicles + 1;
    }

    public Boat(){
        this.mpg = 1.5;
        nVehicles = nVehicles + 1;
    }

    public void movingForward(){
        System.out.println("Boat moving forwards.");
    }

    public void movingBackward(){
        System.out.println("Boat moving backwards.");
    }

    public void hoistAnchor(){System.out.println("Boat hoisting anchor.");}

    public void dropAnchor(){System.out.println("Boat dropping anchor");}

    public void start(){System.out.println("Starting Vehicle Engine.");}

    public void stop(){System.out.println("Stopping Vehicle Engine.");}

    public double getMPG(){return mpg;}

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Vehicle v = (Vehicle)o;
            if (getMPG() == v.getMPG()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int compareTo(Vehicle v) {
        if (v.getMPG() > this.getMPG()){
            return -1;
        }
        else if (v.getMPG() < this.getMPG()){
            return 1;
        }
        else{return 0;}
    }

    public String toString(){
        String returnString = "Type: \n" + this.getClass() + "\nMPG: " + this.mpg;
        return returnString;
    }



}