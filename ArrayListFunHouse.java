import java.util.ArrayList;

public class ArrayListFunHouse {

    public ArrayList<Integer> getListOfFactors(int number){

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int testCompNum = 2; testCompNum <= number/2; testCompNum++){
            if (number % testCompNum == 0)
                nums.add(testCompNum);
        }
        return nums;

    }

    public void keepOnlyCompositeNumbers(ArrayList<Integer> nums) {
        System.out.println("Original list: " + nums);
        for (int z = 0; z < nums.size(); z++){
            int y = nums.get(z);
            if (isPrime(y)){
            nums.remove(z);
            z--;
            }
        }
        System.out.println("New list: " + nums);
    }


    public boolean isPrime(int y){
        for(int x = 2; x <= y/2; x++){
            if (y%x == 0){
                return false;
            }
        }
        return true;
    }
}