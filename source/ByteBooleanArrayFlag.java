//bArray[secondaryIndex] = index(0-7) for secondary index;

public class ByteBooleanArrayFlag {
    
    private byte boolArray = (byte)129;

    public ByteBooleanArrayFlag() {}
    public ByteBooleanArrayFlag(boolean[] bs) {}

    public boolean getFlag(int index) {//returns the flag value at the specified index
        //make sure inupt is correct
        if(index < 0 || index > 7) {
            return false;
        }
        
        byte tB = boolArray;
        
        //read indexed boolean value from a byte
        for(int i = 7; i >= 0; i--) {
            if(Math.pow(2, i) <= (tB & 0xff)) {
                if(i == index) {
                    return true;
                } else {
                    tB = (byte)((int)(tB & 0xff) - Math.pow(2, i));
                }
            } else {
                if(i == index) {
                    return false;
                }
            }
        }
        return false;// just to make sure we dont die
    }

    public boolean setFlag(int index, boolean value) {//returns true if flag was set correctly
        //make sure inupt is correct
        if(index < 0 || index > 7) {
            return false;
        }
        
        byte tB = boolArray;
        
        //read indexed boolean value from a byte
        for(int i = 7; i >= 0; i--) {
            if(Math.pow(2, i) <= (tB & 0xff)) {
                if(i == index) {
                    System.out.println(true);//
                    return true;
                } else {
                    tB = (byte)((int)(tB & 0xff) - Math.pow(2, i));
                }
            } else {
                if(i == index) {
                    System.out.println(false);//
                    return false;
                }
            }
        }
        return false;// just to make sure we dont die
    }

    protected void finalize()  
    {
        System.out.println("Object is destroyed by the Garbage Collector");  
    }
} 