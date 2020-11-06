public class Helicopter extends Vehicle{

    private double mpg;

    public Helicopter(double mpg){
        this.mpg = mpg;
        nVehicles = nVehicles + 1;
    }

    public Helicopter(){
        this.mpg = 0.3;
        nVehicles = nVehicles + 1;
    }

    public void movingForward(){
        System.out.println("Helicopter moving forwards.");
    }

    public void movingBackward(){
        System.out.println("Helicopter moving backwards.");
    }

    public void moveUp(){System.out.println("Helicopter moving up.");}

    public void moveDown(){System.out.println("Helicopter moving down.");}

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