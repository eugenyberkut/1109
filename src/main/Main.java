package main;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
//        int i=0;
//        while (i<100) {
//            System.out.println(i);
////            i = i+1;
////            i += 1;
//            i++;
//        }
        for (int j=0; j<=100; j++) {
            double x = j * 0.1;
            double y = f(x);
            System.out.printf("%7.3f%n", x);
        }
    }

    public double f(double t) {
        return Math.sin(t);
    }

    public void print(double x, double y) {
        System.out.printf("%f %f%n", x,y);
    }
}
