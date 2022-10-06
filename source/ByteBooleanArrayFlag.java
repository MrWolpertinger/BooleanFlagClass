//bArray[secondaryIndex] = index(0-7) for secondary index;

public class ByteBooleanArrayFlag {
    
    private byte boolArray;

    public ByteBooleanArrayFlag() { boolArray = 0; }

    public ByteBooleanArrayFlag(boolean[] bs) throws IllegalArgumentException{//bs.length is not looked at
        if (bs.length < 8 || bs.length > 8) {
            throw new IllegalArgumentException("ByteBooleanArrayFlag requires exactly 8 bytes");
        }

        boolArray = 0;
        for (int i = 0; i < 8; i++) {
            if(bs[7-i] == true) {
                boolArray = (byte)((int)(boolArray & 0xff) + Math.pow(2, i));
            }
        }
    }

    public void printByte() {
        System.out.println(boolArray);
    }

    public void printByteAsUnsigned() {
        System.out.println((boolArray & 0xff));
    }

    public void printAsBooleanArray(boolean Flag) {
        byte tB = boolArray;

        System.out.print("{");
        for(int i = 7; i >= 0; i--) {
            if(Math.pow(2, i) <= (tB & 0xff)) {
                tB = (byte)((int)(tB & 0xff) - Math.pow(2, i));
                if(Flag == true) {
                    System.out.print(" true ");
                } else {
                    System.out.print(" 1 ");
                }
            } else {
                if(Flag == true) {
                    System.out.print(" false ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            if(i > 0) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

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
                    if(value == true) {
                        return true;
                    } else {
                        boolArray = (byte)((int)(boolArray & 0xff) - Math.pow(2, i));
                        return true;
                    }
                } else {
                    tB = (byte)((int)(tB & 0xff) - Math.pow(2, i));
                }
            } else {
                if(i == index) {
                    if(value == true) {
                        boolArray = (byte)((int)(boolArray & 0xff) + Math.pow(2, i));
                        return true;
                    } else {
                        return true;
                    }
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