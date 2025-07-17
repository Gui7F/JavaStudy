package utils;

public class CurrentConverter {
    
    public static final  double IOF = 0.035;

    public static double convert(double dollar, double amount, double IOF) {
        return dollar * amount * (1+IOF);
    }

    
}
