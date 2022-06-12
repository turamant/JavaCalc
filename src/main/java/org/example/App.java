package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Calculator calculator = new Calculator();
        int res = calculator.add(1,2);
        System.out.println(res);
    }
}
