import java.util.ArrayList;

public class LithiumGrading {
    //ArrayList that houses low grade lithium samples
    private ArrayList<Integer> lowGrade;
    //ArrayList that houses high grade lithium samples
    private ArrayList<Integer> highGrade;

    /**
     * Constructor initialises both Array lists
     */
    public LithiumGrading(){
        lowGrade = new ArrayList<>();
        highGrade = new ArrayList<>();
    }

    /**
     * Splits tray into two categories:
     * grades over 25 = high grade,
     * grades under 26 = low grade.
     * @param generateLithium Object that holds tray of generated lithium
     */
    public void generateGrades(GenerateLithium generateLithium){
        int[][] tray = generateLithium.getTray();
        for(int i = 0; i < 5;i++){
            for(int j = 0; j < 3;j++){
                if(tray[i][j] > 25){
                    highGrade.add(tray[i][j]);
                }else{
                    lowGrade.add(tray[i][j]);
                }
            }
        }
    }
    
    /**
     * Overloaded method generateGrades(), made to fit task criteria of accepting
     * tray as a parameter while preserving UML structure provided in the worksheet
     * @param array with samples to be graded
     */
    public void generateGrades(int[][] tray){
        for(int i = 0; i < 5;i++){
            for(int j = 0; j < 3;j++){
                if(tray[i][j] > 25){
                    highGrade.add(tray[i][j]);
                }else{
                    lowGrade.add(tray[i][j]);
                }
            }
        }
    }


    /**
     * Bubble sort algorithm used to sort lowGrade & highGrade arrays into ascending order
     */
    public void sortingLithium(){
        for(int i = 0; i < lowGrade.size(); i++){
            for(int j = 1 ; j < lowGrade.size(); j++){
                int temp = 0;
                if(lowGrade.get(j-1)>lowGrade.get(j)){
                    temp = lowGrade.get(j);
                    lowGrade.set(j,lowGrade.get(j-1));
                    lowGrade.set(j-1,temp);
                }
            }
        }
        
        for(int i = 0; i < highGrade.size(); i++){
            for(int j = 1 ; j < highGrade.size(); j++){
                int temp = 0;
                if(highGrade.get(j-1)>highGrade.get(j)){
                    temp = highGrade.get(j);
                    highGrade.set(j,highGrade.get(j-1));
                    highGrade.set(j-1,temp);
                }
            }
        }
    }
    /**
     * Prints sorted(or not) grade arrays to console.
     */
    public void print(){
        System.out.println("LOW (<=25)");
        for(int i = 0 ; i < lowGrade.size(); i++){
            System.out.println(lowGrade.get(i));
        }
        System.out.println("HIGH (>25)");
        for(int i = 0; i < highGrade.size(); i++){
            System.out.println(highGrade.get(i));
        }
    }
}
