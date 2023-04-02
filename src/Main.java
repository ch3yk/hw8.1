import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int [] massiv = new int[3];
        massiv[0]=1;
        massiv[1]=2;
        massiv[2]=3;
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
        double [] massiv2 = {1.57, 7.654, 9.986};
        System.out.print("\n");
        for (int i = 0; i < massiv2.length; i++) {
            System.out.println(massiv2[i]);
        }
            int [] massiv3 = {1,3,6,7,12};
        System.out.print("\n");
        for (int i = 0; i < massiv3.length; i++) {
            System.out.println(massiv3[i]);
        }
        System.out.print("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int [] massiv = new int[3];
        massiv[0]=1;
        massiv[1]=2;
        massiv[2]=3;
        for (int i = 0; i < massiv.length; i++) {
            if (i == massiv.length - 1) {
                System.out.print(massiv[i]);
            } else {
                System.out.print(massiv[i] + " ,");
            }
        }
            double [] massiv2 = {1.57, 7.654, 9.986};
        System.out.print("\n");
        for (int i = 0; i < massiv2.length; i++) {
            if (i == massiv2.length - 1) {
                System.out.print(massiv2[i]);
            } else {
                System.out.print(massiv2[i] + " ,");
            }
        }
        int [] massiv3 = {1,3,6,7,12};
        System.out.print("\n");
        for (int i = 0; i < massiv3.length; i++) {
            if (i == massiv3.length - 1) {
                System.out.print(massiv3[i]);
            } else {
                System.out.print(massiv3[i] + " ,");
            }
        }
        System.out.print("\n");

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int [] massiv = new int[3];
        massiv[0]=1;
        massiv[1]=2;
        massiv[2]=3;
        for (int i = massiv.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(massiv[i]);
            } else {
                System.out.print(massiv[i] + " ,");
            }
        }
        double [] massiv2 = {1.57, 7.654, 9.986};
        System.out.print("\n");
        for (int i = massiv2.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(massiv2[i]);
            } else {
                System.out.print(massiv2[i] + " ,");
            }
        }
        int [] massiv3 = {1,3,6,7,12};
        System.out.print("\n");
        for (int i = massiv3.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(massiv3[i]);
            } else {
                System.out.print(massiv3[i] + " ,");
            }
        }
        System.out.print("\n");

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int [] massiv = new int[3];
        massiv[0]=1;
        massiv[1]=2;
        massiv[2]=3;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]%2!=0){
              massiv[i]=massiv[i]+1;
            }
        }
        System.out.println(Arrays.toString(massiv));
    }
}