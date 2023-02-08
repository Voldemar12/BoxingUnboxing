package NPE;

public class NPE {

    public static void main(String[] args) {
        Long longVal = null;
        //long primitiveLong = longVal; //выкинет из NPE
        long unboxed = longVal != null ? longVal : 0;

        long unboxed2;
        if (longVal != null) {
            unboxed2 =longVal;
        } else {
            unboxed2 = 0;
        }
    }
}
