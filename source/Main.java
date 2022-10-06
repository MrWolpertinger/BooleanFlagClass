
public class Main {
    public static void main(String[] args) {
        boolean argsForTest[] = {true, false, false, false, true, true, false, false};

        ByteBooleanArrayFlag b = new ByteBooleanArrayFlag(argsForTest);



        
        b.printByte();
        b.printByteAsUnsigned();
        b.printAsBooleanArray(false);
        b.printAsBooleanArray(true);
    }
}
