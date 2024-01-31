public class MathUtils {
    //The class utils should be in a different package.
    public static Boolean isDivisibleBy5(int num) {
        if (num % 5 == 0) {
            return true;
        }else{
            return false;
        }
    }
    public static Boolean isDivisibleBy3(int num) {
        if (num % 3 == 0) {
            return true;
        }else{
            return false;
        }
    }
    //This function could be reusable with the 2 above functions.
    public static Boolean isDivisibleBy3And5(int num) {
        if (num % 5 == 0 & num % 3 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
