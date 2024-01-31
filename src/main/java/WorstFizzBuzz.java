
public class WorstFizzBuzz {

    public static void main(String[] args) {
        int num = 0;
        while(num <= 100){
            num += 1;
            if(MathUtils.isDivisibleBy3And5(num)){
                System.out.print("FizzBuzz, ");
            }else if(MathUtils.isDivisibleBy3(num)){
                System.out.print("Fizz, ");
            }else if(MathUtils.isDivisibleBy5(num)){
                    System.out.print("Buzz, ");
            }else{
                System.out.print(num + ", ");

            }
        }
    }

}

