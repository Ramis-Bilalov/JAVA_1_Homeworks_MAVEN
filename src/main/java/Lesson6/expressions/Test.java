package Lesson6.expressions;

public class Test {
    public static void main(String[] args) {
        System.out.print(new sum
                (new Constant(5),
                        new sum(new Constant(3),
                                new Constant(4))
                )
        );
        System.out.println("=" + new sum
                (new Constant(5),
                        new sum(new Constant(3),
                                new Constant(4))
                ).apply()
        );
    }
}
