package example2;

public class Example2 {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        @SuppressWarnings(value = "all")
        Integer number = new Integer("10012");
        @SuppressWarnings(value = "all")
        Float f = new Float("0.03");
        @SuppressWarnings(value = "all")
        Long longNumber = new Long("1000000000");
        @SuppressWarnings(value = "all")
        Boolean boolVal = new Boolean("true");

        Long longVal = Long.parseLong("100000000000");

        Long l1 = Long.valueOf("2000");
        Long l2 = Long.valueOf("2000");
        System.out.println(l1 == l2);  //false
        System.out.println(l1.equals(l2));  //true (equals)
    }
}
