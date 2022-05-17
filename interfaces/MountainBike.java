package interfaces;

public class MountainBike implements  Bicycle{

    private  int seatHeight;
    private int gear;
    private int speed;

    public MountainBike(int startHeight,
                        int startSpeed,
                        int startGear){
        seatHeight = startHeight;
        speed = startSpeed;
        gear = startGear;
    }

    @Override
    public  void applyBrake(int decrement){
        speed = speed-decrement;
    }



    @Override
    public  void speedUp(int increment){
        speed = speed+increment;
    }



}
