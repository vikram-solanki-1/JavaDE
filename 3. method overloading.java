package com.vikram_package;
class E1
{

    public int calcu (int a, int b)
    {int x = a + b;
        return x;
    }

    public int calcu (int a, int b, int c)
    {int x = a + b + c;
        return x;
    }


    public static void main (String a[])
    {System.out.println("in E3 class - Program is starting from main");

        E1 Calculator = new E1();   // non-static class so instance created for the class.
        int y = Calculator.calcu(100,200); // method called it will return int
        System.out.println(y); // the returned value was stored in y so print y

        int z = Calculator.calcu(2,2,2);
        System.out.println(z);

    }


}
