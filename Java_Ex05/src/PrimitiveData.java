/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class PrimitiveData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte min_byte = -128;
        byte max_byte = 127;
        short min_short = -32768;
        short max_short = 32767;
        int min_int = -2147483648;
        int max_int = 2147483647;
        long min_long = -9223372036854775808L;
        long max_long = 9223372036854775807L;
        float min_float = -99999999999999999999999999999999999999.999999f;
        float max_float = 99999999999999999999999999999999999999.999999f;
        double min_double = -99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.999999d;
        double max_double = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.999999d;;
        boolean data_true = true;
        boolean data_false = false;
        char ch1 = 88;
        char ch2 = 'Y';
        System.out.println("Byte min-max  > " + min_byte + " to " + max_byte);
        System.out.println("Short min-max  > " + min_short + " to " + max_short);
        System.out.println("int min-max  > " + min_int + " to " + max_int);
        System.out.println("long min-max  > " + min_long + " to " + max_long);
        System.out.println("float min-max  > " + min_float + " to " + max_float);
        System.out.println("double min-max  > " + min_double + " to " + max_double);
        System.out.println("Boolean  > " + data_true + " AND " + data_false);
        System.out.println("Char  > " + ch1 + "  " + ch2);
    }

}
