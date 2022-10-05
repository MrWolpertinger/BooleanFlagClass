//bArray[secondaryIndex] = index(0-7) for secondary index;

public class ByteBooleanArrayFlag {
    private byte[] bArray;
    public ByteBooleanArrayFlag() {}
    public ByteBooleanArrayFlag(boolean[] bs) {}

    public int[] AddFlag(boolean b) {// return index in form of (0-7, 0-Number of bytes)

    }

    public boolean getFlag(int index, int secondaryIndex) {//returns the flag value at the specified index

    }

    public boolean setFlag(int index, int secondaryIndex, boolean value) {//returns true if flag was set correctly

    }

    public boolean removeFlag(int index, int secondaryIndex) {

    }

    protected void finalize()  
    {
        System.out.println("Object is destroyed by the Garbage Collector");  
    }
}