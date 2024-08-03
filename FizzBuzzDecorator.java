public class FizzBuzzDecorator implements FizzBuzzable {

    final FizzBuzzable toDecorate;

    FizzBuzzDecorator (FizzBuzzable fb) {
        toDecorate = fb;
    }

    @Override
    public String print(int n) {
        return "";
    }

}