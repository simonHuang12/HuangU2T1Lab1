public class CatRunner {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Bob", 12, 6.2);
        cat1.introduce();

        Cat cat2 = new Cat("Joe", 12412, 0.2);
        cat2.introduce();
        cat2.printCatInfo();
        cat2.chonk();
    }
}
