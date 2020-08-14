import java.lang.reflect.Array;
import java.util.Arrays;

class Triangle {

    private double a,b,c;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        double[] s = {side1,side2,side3};
        Arrays.sort(s);
        if(side1>0 && side2>0 && side3 >0 &&
                s[0] + s[1] > s[2]
        ) {
            this.a = side1;
            this.b = side2;
            this.c = side3;
        }else throw new TriangleException();
    }

    boolean isEquilateral() {
        return (this.a==this.b && this.a == this.c);
    }

    boolean isIsosceles() {
        return (this.a==this.b || this.a ==this.c || this.b ==this.c);
    }

    boolean isScalene() {
        return (this.a!=this.b && this.a !=this.c && this.b !=this.c);
    }

}