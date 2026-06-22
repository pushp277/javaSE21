package packagea.check.b;

public class ClassB{
   int b;

    {   b=23;
        System.out.format("b= %d%n", b);
    }

    public static void main(String... args){
        var classB = new ClassB();
    }
}