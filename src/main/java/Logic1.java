package main.java;


public class Logic1
{
    public static void main(String[] args){
        Logic1 logicDriver = new Logic1();
        //All test cases;
        System.out.println(logicDriver.old35(3));
        System.out.println(logicDriver.old35(10));
        System.out.println(logicDriver.old35(15));
        System.out.println(logicDriver.specialEleven(22));
        System.out.println(logicDriver.specialEleven(23));
        System.out.println(logicDriver.specialEleven(24));
        System.out.println(logicDriver.more20(20));
        System.out.println(logicDriver.more20(21));
        System.out.println(logicDriver.more20(42));
        System.out.println(logicDriver.less20(18));
        System.out.println(logicDriver.less20(59));
        System.out.println(logicDriver.less20(20));
        System.out.println(logicDriver.nearTen(12));
        System.out.println(logicDriver.nearTen(17));
        System.out.println(logicDriver.nearTen(19));
        System.out.println(logicDriver.sortaSum(3, 4));
        System.out.println(logicDriver.sortaSum(9, 4));
        System.out.println(logicDriver.sortaSum(10, 11));
        System.out.println(logicDriver.in1To10(5, false));
        System.out.println(logicDriver.in1To10(11, false));
        System.out.println(logicDriver.in1To10(11, true));
        System.out.println(logicDriver.teenSum(3, 4));
        System.out.println(logicDriver.teenSum(10, 13));
        System.out.println(logicDriver.teenSum(13, 2));
        System.out.println(logicDriver.love6(6, 4));
        System.out.println(logicDriver.love6(4, 5));
        System.out.println(logicDriver.love6(1, 5));
        System.out.println(logicDriver.lastDigit(23, 19, 13));
        System.out.println(logicDriver.lastDigit(23, 19, 12));
        System.out.println(logicDriver.lastDigit(23, 19, 3));
        System.out.println(logicDriver.answerCell(false, false, false));
        System.out.println(logicDriver.answerCell(false, false, true));
        System.out.println(logicDriver.answerCell(true, false, false));
      
    }

    public Logic1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    /*Return true if the given non-negative number is a multiple of 3 or 5, but not both. 
    Use the % "mod" operator


    old35(3) --> true
    old35(10) --> true
    old35(15) --> false */
    public boolean old35(int n) {
        if ((n%3 ==0 ) || (n%5 == 0 )){
            return true; 
        }
        
        else return false; 
    }


    /*We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
    Return true if the given non-negative number is special. Use the % "mod" operator


    specialEleven(22) --> true
    specialEleven(23) --> true
    specialEleven(24) --> false */
    public boolean specialEleven(int n) {
          if ((n%11 == 0)||((n-1)%11 == 0)) {
                return true; 
            }
        else return false; 
    }


    /*Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

    more20(20) --> false
    more20(21) --> true
    more20(42) --> true */
    public boolean more20(int n) {
          if ( ((n+1)%20 == 0) || ((n+2)%20 == 0) ) {
                return true;
            }
        else return false;
    }


    /*Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
    So for example 38 and 39 return true, but 40 returns false.


    less20(18) --> true
    less20(59) --> true
    less20(20) --> false */
    public boolean less20(int n) {
      if ( ((n-1)%20 == 0) || ((n-2)%20 == 0) ) {
                return true;
            }
        else return false;
    }

    /*Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.


    nearTen(12) --> true
    nearTen(17) --> false
    nearTen(19) --> true */
    public boolean nearTen(int num) {
      if ( ((num+1)%10 == 0) || ((num+2)%10 == 0) ) {
            return true;
            }
      if (((num-1)%10 == 0) || ((num-2)%10 == 0)) {
            return true; 
        }
      else return false; 
    }


    /*Given 2 ints, a and b, return their sum. 
    However, sums in the range 10..19 inclusive, are forbidden, 
        so in that case just return 20.


    sortaSum(3, 4) --> 7
    sortaSum(9, 4) --> 20
    sortaSum(10, 11) --> 21*/
    public int sortaSum(int a, int b) {
      int sortaSumm = a + b; 
        if ( (sortaSumm >= 10) && (sortaSumm <= 19)) {
            sortaSumm = 20;           
        }
        return sortaSumm; 
    }


    /*Given a number n, return true if n is in the range 1..10, inclusive. 
    Unless outsideMode is true, in which case return 
        true if the number is less or equal to 1, or greater or equal to 10.


    in1To10(5, false) --> true
    in1To10(11, false) --> false
    in1To10(11, true) --> true */
    public boolean in1To10(int n, boolean outsideMode) {
      boolean in1 = false; 
        if(outsideMode == true) {
            
          if (n <= 10 || n>=1) {
                in1 = true; 
            }
            if (n >= 10 || n<=1) {
                in1= true; 
            }
        }
          else {
           if (n <= 10 && n>=1) {
                in1 = true; 
            }
            if (n >= 10 && n<=1) {
                in1 =  false; 
            } 
        }
        
        return in1;
    }


    /*Given 2 ints, a and b, return their sum. However, "teen" values in the range 
    13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.


    teenSum(3, 4) --> 7
    teenSum(10, 13) --> 19
    teenSum(13, 2) --> 19 */
    public int teenSum(int a, int b) {
        int teenS; 
        if (a >= 13 && a <= 19 ) {
            teenS = 19; 
        }
        if (b >= 13 && b <= 19 ) {
            teenS = 19; 
        }
        else {
         teenS = a+b; 
        }
        return teenS; 
    }


    /*The number 6 is a truly great number. Given two int values, a and b, 
        return true if either one is 6. Or if their sum or difference is 6. 
    Note: the function Math.abs(num) computes the absolute value of a number.


    love6(6, 4) --> true
    love6(4, 5) --> false
    love6(1, 5) --> true */
    public boolean love6(int a, int b) {
        boolean lve6;
        if (a == 6 || b == 6) {
            lve6 = true; 
        }
        if (a+b == 6 || a-b == 6) {
            lve6 = true; 
        }
        else{
            lve6 = false; 
        
        }
        return lve6; 
    }


    /*Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
    The ints are non-negative. 
        Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


    lastDigit(23, 19, 13) --> true
    lastDigit(23, 19, 12) --> false
    lastDigit(23, 19, 3) --> true */
    public boolean lastDigit(int a, int b, int c) {
      int calcA = a%10;
      int calcB = b%10;
      int calcC = c%10;
      boolean lastd = false; 
      if(calcA == calcB || calcA == calcC) {
            lastd = true; 
        }
      else {
        lastd = false;     
        } 
        return lastd; 
    }


    /*Your cell phone rings. Return true if you should answer it. 
    Normally you answer, except in the morning you only answer if it is your mom calling. 
    In all cases, if you are asleep, you do not answer.


    answerCell(false, false, false) --> true
    answerCell(false, false, true) --> false
    answerCell(true, false, false) --> false */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
      boolean answerC = true; 
      if (isAsleep == true) {
        answerC = false; 
        return answerC; 
    }
    else if (isMorning == true && isMom == true && isAsleep == false) {
            answerC = true;
            return answerC; 
        }
    else if (isMorning == false && isMom == false && isAsleep == false) {
        answerC = true; 
        return answerC; 
    }
    return answerC;     
    }
}
