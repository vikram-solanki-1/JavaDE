package com.vikram_package;
 class E2 {
     public void NotStatic_func()
     {System.out.println("Non Static method");
     }
     public static void Static_func()
     {System.out.println("Static Method"); //
     }
     public static void main (String a[])
    {System.out.println("Program is starting from main");
        E2 E2_object = new E2(); // need to create instance for non static method
        E2_object.NotStatic_func(); // called using instance/object and then method name
        Static_func(); // static func can be called directly
    }
}
