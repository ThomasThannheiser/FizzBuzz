import java.util.List;

record Pair(int mod, String str) {}

class Main {
    final static List<Pair> fizzbuzzMap = 
        List.of(new Pair(3, "fizz"), 
                new Pair(5, "buzz"), 
                new Pair(7, "hiss"), 
                new Pair(11, "howl")); 

    public static void main(String[] args) {
        FizzBuzzable fbd = createFBDChain();
        printFB(fbd);    
    }
            
    private static FizzBuzzBaseDecorator createFBD(FizzBuzzable fb, int mod, String str) {
        return new FizzBuzzBaseDecorator(fb , mod, str);
    }

    private static FizzBuzzable createFBDChain() {
        FizzBuzzable fbd = new FizzBuzz();
        for (Pair entry : fizzbuzzMap) 
            fbd = createFBD(fbd, entry.mod(), entry.str());
        return new NumberDecorator(fbd);
    }

    private static void printFB(FizzBuzzable fbd) {
        for (int i = 1; i < 36; i++) 
            System.out.println(fbd.print(i));
    }

}