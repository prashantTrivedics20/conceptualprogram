import java.lang.Math;
import java.text.DecimalFormat;
public class precisionupTotwoDecimalPlaces {
    public static void main(String[] args) {
        double f=2.3456964;
        // i want only two decimal places
        System.out.println(f);
        // first approach
        double f1=Math.round(f*100)/100.0;
        System.out.println(f1);
        // second approach
        System.out.printf("%.2f",f);
        System.out.println();
        // third approach
        DecimalFormat obj=new DecimalFormat("#.##");
        System.out.println(obj.format(f));



    }
}
