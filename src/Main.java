import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        double[] Part1 = new double[15];
        Part1[0] = 45;
        Part1[1] = -8;
        Part1[2] = 69;
        Part1[3] = 9;
        Part1[4] = 99;
        Part1[5] = -6;
        Part1[6] = 5;
        Part1[7] = 14;
        Part1[8] = 9;
        Part1[9] = 7;
        Part1[10] = 33;
        Part1[11] = 8;
        Part1[12] = 6;
        Part1[13] = -13;
        Part1[14] = -3;

        int n=0;
        int m=0;
        double sum=0;

        for (double box1 : Part1) {
            if (box1 < 0){
                n++;
            }
            if (n>0 && box1>0){
                sum=sum+box1;
                m++;
            }
        }
        System.out.println(Arrays.toString(Part1) + " = " + (sum/m));
    }
}
