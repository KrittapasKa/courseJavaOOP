/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class AllOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1 Unary Operator ทำเสร็จด้วยตัวมันเอง
        System.out.println("1) Unary Operator");
        int x = 17;
        System.out.println("x++ = " + x++); //เอาx 17 มาโชว์แล้ว  +1 = 18
        System.out.println("++x = " + ++x);//xตอนนี้ 18 แล้ว+1 ก่อนโชว์(19)
        System.out.println("x-- = " + x--); //เอาx 19 มาโชว์แล้ว  -1 = 18
        System.out.println("--x = " + --x);//xตอนนี้ 18 แล้ว-1 ก่อนโชว์(17)
        int a = 10;
        int b = 10;
        System.out.println("a++ + ++a = " + (a++ + ++a)); //เอาA=10 มาบวกแล้วบวก 1 ตอนนี้ a = 11 แล้วเอา  ++a = 12 มาบวกกับตัวก่อน = (10 + 12) = 22
        System.out.println("a-- - --a = " + (a-- - --a)); //เอาA=10 มาลบแล้วลบ 1 ตอนนี้ a = 9 แล้วเอา  --a = 8 มาบวกกับตัวก่อน = (10 - 8) = 2
        System.out.println("b++ + b++ = " + (b++ + b++)); //เอาB=10 มาบวกแล้วบวก 1 ตอนนี้ b = 11 แล้วเอา  b++ = 11 มาบวกกับตัวก่อน แล้วบวก 1 ตอนนี้ b = 12 = (10 + 11) = 21
        System.out.println("b-- + b-- = " + (b-- - b--)); //เอาB=10 มาลบแล้วลบ 1 ตอนนี้ b = 9 แล้วเอา  b-- = 9 มาลบกับตัวก่อน แล้วลบ 1 ตอนนี้ b = 8 = (10 - 9) = 1
        int c = 30;
        int d = -60;
        System.out.println("~c = " + ~c); //กลับลบเป็นบวก บวกเป็นลบ แล้วลบ1 (opposit)
        System.out.println("~d = " + ~d); //59
        boolean e = true;
        boolean f = false;
        System.out.println("!e = " + !e); //กลับ 1 เป็น 0 0 เป็น 1 จริงเป็นเท็จ 1 = จริง 0=เท็จ
        System.out.println("!f = " + !f);
        //2) Arithmetic Operator
        System.out.println("2) Arithmetic Operator");
        int num1 = 10;
        int num2 = 5;
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - +num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
        System.out.println(10 * 80 / 6 + 3 - 1 * 9 / 3); //133ลำดับความสำคัญ
        System.out.println(10 % 3 + 3 * 9 / 4); //27 ซ้ายไปขวาถ้าลำดับความสำคัญเท่ากัน
        //3) Shift Operator
        System.out.println("3) Shift Operator");
        //Left Shit Operator
        System.out.println("10<<2 = " + (10 << 2)); // 10*4(2ยกกำลัง2) = 40
        System.out.println("10<<3 = " + (10 << 3)); // 10*8 (2ยกกำลัง3) = 80
        System.out.println("20<<2 = " + (20 << 2)); // 20*4 (2ยกกำลัง4) = 80
        //Right Shit Operator
        System.out.println("10>>2 = " + (10 >> 2)); // 10/4(2ยกกำลัง2) = 2.5
        System.out.println("10>>3 = " + (10 >> 3)); // 10/8 (2ยกกำลัง3) = 1
        System.out.println("20>>2 = " + (20 >> 2)); // 20/4 (2ยกกำลัง4) = 5
        //4) Logical Operator and 5) Bitwise Operator
        System.out.println("4) Logical Operator (&& or ||) and 5) Bitwise Operator (& or |)");
        int a1 = 10;
        int b1 = 5;
        int c1 = 20;
        //AND --> && and &
        System.out.println("a1<b1 && a1++<c1 = " + (a1 < b1 && a1++ < c1)); // false && true = false (Logical)
        System.out.println("a1 = " + a1); //10 ถ้าใช้Logical ถ้าตัวแรกไม่เป็นจริงจะคิดตัวต่อไป แต่ถ้าตัวแรกเป็นจริง จะไม่คิดตัวต่อไป
        System.out.println("a1<b1 & a1++<c1 = " + (a1 < b1 & a1++ < c1)); // false && true = false (Bitwise)
        System.out.println("a1 = " + a1); //11 ถ้าใ้ช้Bitwise ตัวไหนตัวนึง true ก็คิด
        int a2 = 30;
        int b2 = 9;
        int c2 = 20;
        //OR --> || or |
        System.out.println("a2>b2 || a2++<c2 = " + (a2 > b2 || a2++ < c2)); // true || false = true (Logical)
        System.out.println("a2 = " + a2); //30 ถ้าใช้Logical ถ้าตัวแรกไม่เป็นจริงจะคิดตัวต่อไป แต่ถ้าตัวแรกเป็นจริง จะไม่คิดตัวต่อไป
        System.out.println("a2>b2 | a2++<c2 = " + (a2 > b2 | a2++ < c2)); // false | true = true (Bitwise)
        System.out.println("a2 = " + a2); //31 ถ้าใ้ช้Bitwise คิดหมด
        //6) Ternary Operator
        System.out.println("6) Ternary Operator");
        int a3 = 10;
        int b3 = 5;
        int result = (a3 < b3) ? a3 : b3;
        System.out.println("a3<b3 = " + result);
        //Same if else
//        if(a3<b3){
//            result = a3;
//        }else{
//            result = b3;
//        }
        //7) Assigment Operator
        System.out.println("7) Assigment Operator");
        int n = 10;
        int m = 20;
        int o = 30;
        int p = 40;
        n += 4; // n = n+4 --< 10+4 = 14
        m -= 4; // m = m-4 --> 20-4 = 16
        o *= 4; // o = o*4 --> 30*4 = 120
        p /= 4; // p = p/4 --> 40/4 = 110
        System.out.println("n+=4 = " + n);
        System.out.println("m-=4 = " + m);
        System.out.println("o*=4 = " + o);
        System.out.println("p/=4 = " + p);
        System.out.println("n : " + n + " m : " + m + " o : " + o + " p : " + p);
        System.out.format("%d %d %d %d",m,n,o,p);
    }

}
