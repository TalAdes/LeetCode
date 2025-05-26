class Solution29 {
    public static void main(String[] args) {

        int counter = 0;
        int dividend = 55489645;
        int divisor = 486;
        if (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0) {
            while ((double) (dividend - divisor) == 0) {
                dividend -= divisor;
                counter++;
            }
        } else {
            while ((double) (dividend + divisor) == 0) {
                dividend += divisor;
                counter--;
            }
        }
    }
}