import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Calculator add=(a,b) ->a+b;
    Calculator substract=(a,b) ->a-b;
    Calculator multiply=(a,b) -> a*b;
    Calculator seperate=(a,b) -> {
        if(b==0){
            b=1;
        }
        return a/b;
        };

    System.out.println(add.calculate(10,2));
    System.out.println(substract.calculate(10,2));
    System.out.println(multiply.calculate(10,2));
    System.out.println(seperate.calculate(10,2));

        }


    }

