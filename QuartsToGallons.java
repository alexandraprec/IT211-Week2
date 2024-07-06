//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QuartsToGallons {
    public static void main(String[] args){
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        int extraQuartsNeeded;
        gallonsNeeded = quartsNeeded/ QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " +
                gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts.");
    }
}