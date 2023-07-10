package com.vikram_package;
class E1
{

    public int calcu (int a, int b)
    {int x = a + b;
        return x;
    }

    public static int valcu (int a, int b)
    {
        int x = a + b;
        return x;
    }

    public static void main (String a[])
    {System.out.println("in E3 class - Program is starting from main");

        E1 Calculator = new E1();   // non-static class so instance created for the class.
        int y = Calculator.calcu(100,200); // method called it will return int
        System.out.println(y); // the returned value was stored in y so print y

        int z = valcu(88, 44);  // class instance not required for static method. 
        System.out.println(z);

    }


}
