
/**
 * Write a description of class driverProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class driverProgram
{
    public static void main(String args[]){
        ArrayListFunHouse x = new ArrayListFunHouse();
        ArrayList<Integer> hello = new ArrayList<Integer>();
        
        hello = x.getListOfFactors(9);
        x.keepOnlyCompositeNumbers(hello);
        
        
        hello = x.getListOfFactors(23);
        x.keepOnlyCompositeNumbers(hello);
        
        hello = x.getListOfFactors(50);
        x.keepOnlyCompositeNumbers(hello);
        
        hello = x.getListOfFactors(100);
        x.keepOnlyCompositeNumbers(hello);
        
        hello = x.getListOfFactors(762);
        x.keepOnlyCompositeNumbers(hello);
        
    }
}
