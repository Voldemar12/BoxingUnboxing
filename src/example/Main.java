package example;

public class Main {
    public static void main(String[] args) {
        //boxing
        int primitive = 100;
        Integer reference = Integer.valueOf(primitive);
        //unboxing
        int anotherPrimitive = reference.intValue();

        //autoboxing
        double primitiveDouble = 10.0;
        Double wrapperDouble = primitiveDouble; //autoboxing
        double anotherPrimitiveDouble = wrapperDouble; //autounboxing


        Long n1 = 10L;
        Integer n2 = 10;
        Long n3 = 10L;
        Integer n4 = 10;
    }
}