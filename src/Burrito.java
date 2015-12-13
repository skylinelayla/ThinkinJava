/**
 * Created by ShiKun on 2015/12/13.
 */
public class Burrito {
    public enum Spiciness{
        NOT,MILD,MEDIUM,HOT,FLAMING
    }
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree=degree;
    }

    public void describe() {
        System.out.println("This buttito is");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot");
                break;
            case HOT:
            case FLAMING:
            default:System.out.println("maybe too hot");

        }

    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT);
        plain.describe();

    }
}

