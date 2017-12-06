public class NeedMathDriver {
    public static void main(String[] args){
        double [] num = new double[10];
        num[0] = 15.0;
        num[1] = 12.0;
        num[2] = 13.4;
        num[3] = 12.4;
        num[4] = 14.4;
        num[5] = 19.0;
        num[6] = 28.0;
        num[7] = 17.4;
        num[8] = 12.9;
        num[9] = 10.4;
        System.out.println(NeedMath.sort(num));
        JOptionPane input = new JOptionPane(NeedMath.sort(num));
    }
}