public class NumberDecorator extends FizzBuzzDecorator{
    
    public NumberDecorator(FizzBuzzable fb){
        super(fb);
    }

    @Override
    public String print(int n) {
        String str = toDecorate.print(n); 
        return str.isEmpty() ? String.valueOf(n) : str;
    }
    
}