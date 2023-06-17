package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

// 3. Client uses the Facade
        Line lineA = new Line(new Point(2, 4), new Point(5, 7));
        lineA.move(-2, -4);
        System.out.println( "after move:  " + lineA );
        lineA.rotate(45);
        System.out.println( "after rotate: " + lineA );
        Line lineB = new Line( new Point(2, 1), new Point(2.866, 1.5));
        lineB.rotate(30);
        System.out.println("30 degrees to 60 degrees: " + lineB);


        record Person(String firstName, String lastName){};

        ArrayList<String> arrayListString = new ArrayList<String>(Arrays.asList("a","b","c","d"));
        arrayListString.forEach(x-> System.out.println(x));



        ArrayList<String> aList = new ArrayList<>(Arrays.asList("s","f","f","f","f"));
        aList.forEach(x-> System.out.println(x));

        A var = new B();
        var.print();
        boolean bool;
        bool = foo1()||foo2();
        System.out.print(" ");
        bool = foo1()&&foo2();
        System.out.print(" ");
        bool = foo2()||foo1();
        System.out.print(" ");
        bool = foo2()&&foo1();

        float real = 0.0f/0.0f;
        if (real == real)
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        byte num = (byte)127;
        num++;
        System.out.println(num);

        Hello hello = null;
        hello.print();

        Boolean a = 2 + 2 == 5 && 12 / 4 == 3 || 2 == 5 % 3;
        System.out.println(a);



        int[] array3 = new int[]{1,2,3,4,5};

        int[] array5 = new int[5];

        int[] array6 = {1,2,3,4,5};

        System.out.println(array6);

    }
    static boolean foo1()
    {
        System.out.print("foo1()");
        return true;
    }
    static boolean foo2()
    {
        System.out.print("foo2()");
        return false;
    }

    public static int sum(int x, int ...y)
    {
        int s = 0;
        for(int i=0;i<y.length;++i)
        {
            s+=y[i];
        }
        return s+x;
    }
    class Hello
    {
    public static void print()
    {
        System.out.println("Hello world!");
    }
}}
