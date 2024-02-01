//HelloWorld.java
import java.util.Objects;
import java.util.Scanner;
class SkiJump {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What type of ski jump? (Normal or Large)");
        String skiType = input.next();
        System.out.println("What is the speed of the jump?");
        int skiSpeed = input.nextInt();

        int rampHeight;
        int par;
        double pointsPerMeter;

        if (Objects.equals(skiType, "Large") || Objects.equals(skiType, "large")){
             rampHeight = 46;
             par = 120;
             pointsPerMeter = 1.8;
        }
        else{
             rampHeight = 70;
             par = 90;
             pointsPerMeter = 1.8;
        }

        double timeInAir = Math.sqrt((2*rampHeight)/9.8);
        double distanceTraveled = skiSpeed*timeInAir;
        double pointsScored = (double)60 + (distanceTraveled - par)*pointsPerMeter;

        if (pointsScored >= 61){
            System.out.println("Great job for doing better than par!");
        }
        else if (pointsScored < 10){
            System.out.println("What happened??");
        }
        else {
            System.out.println("Sorry you didn't go very far");
        }

        System.out.println("You scored "+pointsScored+" and went a distance of "+distanceTraveled+".");

    }
}
