package com.vikram_package;
class E3 {
     void NotStatic_func()
    {System.out.println("in E3 class - Non Static method");
    }
    public static void Static_func()
    {System.out.println("in E3 class- Static Method"); //
    }
    public static void main (String a[])
    {System.out.println("in E3 class - Program is starting from main");
        E2 E2_object = new E2(); // need to create instance for non static method
        E2_object.NotStatic_func(); // called using instance/object and then method name
        Static_func();// static func can be called directly
        Static_int();
    }

    public static int Static_int() //only the code inside main gets executed.
            // since its called inside main, it does give print output
    {System.out.println("in int class- Static Method");//
        return 1232;
    }
}


