package com.Questions.Brainstorm;

public class pyramidsOfNumber {
    void pyramid(int a) {
        int a1 = 1;
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a1; j++) {
                System.out.print(a1 + " ");
            }
            System.out.println();
            a1++;
        }
        /*
         * .....1
         * ....2 2
         * ...3 3 3
         * ..4 4 4 4
         * .5 5 5 5 5
         */
    }

    void pyramid1(int a) {
        int a1 = 1;
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            a1++;
        }
        /*
         * ......1
         * .....1 2
         * ....1 2 3
         * ...1 2 3 4
         * ..1 2 3 4 5
         */
    }

    void pyramid2(int a) {
        int a1 = 1;
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            a1++;
        }
        /*
         * 
         * ....*
         * ...* *
         * ..* * *
         * .* * * *
         */
    }

    void pyramid3(int a) {
        int a1 = 1;
        for (int i = a; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            a1++;
        }
        /*
         * 
         * .....5
         * ....4 4
         * ...3 3 3
         * ..2 2 2 2
         * .1 1 1 1 1
         */
    }

    void pyramid4(int a) {
        int rowCount = 1;
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount++;
        }

    }

    void pyramid5(int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 0; j <= a - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        pyramidsOfNumber foo = new pyramidsOfNumber();
        foo.pyramid5(5);

    }

}
