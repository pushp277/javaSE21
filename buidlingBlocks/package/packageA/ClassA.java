package packagea.check.a;

public class ClassA{
    int a;
    {
        a=43;
        System.out.format("a= %d%n", a);
    }

    public static void main(String... args){
        var classA = new ClassA();
    }
}