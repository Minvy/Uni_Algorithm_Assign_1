import java.util.Random;

public class GenerateLithium {
    //Array that holds integers from 1 to 50(exclusive) that represent grades of lithium
    private int tray[][] = new int[5][3];
    //Assigns random integer to each array value
    private Random randomGenerator;

    /**
     * Constructor for objects of class GenerateLithium, it only initialises randomGenerator
     */
    public GenerateLithium() {
        randomGenerator = new Random();
    }

    /**
     * Method that fills tray 2D array with values of 1 to 50(exclusive) by selecting them at random
     */
    public void generateSample() {
        int grading = 0;
        //loops though column
        for (int i = 0; i < 5; i++) {
            //loops though row
            for (int j = 0; j < 3; j++) {
                //keeps generating numbers between 1 to 50(exclusive) until one generated isn't 0
                grading = randomGenerator.nextInt(50);
                while(grading == 0){
                    grading = randomGenerator.nextInt(50);
                }
                //Student to continue coding from here
                tray[i][j] = grading;
            }
        }
    }

    /**
     * Displays current contents of the tray in console
     */
    public void printTray() {
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(tray[i][j]+" || ");
            }
            System.out.println();
        }
    }

    /**
     * Returns the tray if one was generated
     * @return Tray holding integer vales representing lithium grades
     */
    public int[][] getTray() {
        return tray;
    }
}