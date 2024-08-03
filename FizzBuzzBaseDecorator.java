public class FizzBuzzBaseDecorator extends FizzBuzzDecorator {

    private int mod;
    private String str;

    FizzBuzzBaseDecorator(FizzBuzzable fb, int mod, String str) {
        super(fb);
        this.mod = mod;
        this.str = str;
    }

    @Override
    public String print(int n) {
        return toDecorate.print(n) + (n % mod == 0 ? str : "");
    }
    
}
