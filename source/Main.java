
public class Main {
    public static void main(String[] args) {
        byte b = (byte)129;
        byte tB = b;
        //retrieve index 6
        int x = 6;

        //read indexed boolean value from a byte
        for(int i = 7; i >= 0; i--) {
            if(Math.pow(2, i) <= (tB & 0xff)) {
                if(i == x) {
                    System.out.println(true);
                    return;
                } else {
                    tB = (byte)((int)(tB & 0xff) - Math.pow(2, i));
                }
            } else {
                if(i == x) {
                    System.out.println(false);
                    return;
                }
            }
        }


        System.out.println(Math.pow(2, 7));
    }
}
