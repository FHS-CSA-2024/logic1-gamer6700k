package src.test.java;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class String1Test. Dont edit or it will mess up your grade :)
 *
 * @author Mr. Johnson
 * @version 8/26/24 v1 (a version number or a date)
 */
public class TestLogic1{
    private Logic1 testLogic = new Logic1();

    @Test
    public void old35Test(){
        assertEquals(true, testLogic.old35(3));
		assertEquals(true, testLogic.old35(10));
		assertEquals(false, testLogic.old35(15));
    }

    @Test
    public void specialElevenTest(){
        assertEquals(true, testLogic.specialEleven(22));
		assertEquals(true, testLogic.specialEleven(23));
		assertEquals(false, testLogic.specialEleven(24));
    }
	
		
	@Test
    public void more20Test(){
		assertEquals(false, testLogic.more20(20));
		assertEquals(true, testLogic.more20(21));
		assertEquals(true, testLogic.more20(42));
    }
	
	    @Test
    public void less20Test(){
		assertEquals(true, testLogic.less20(18));
		assertEquals(true, testLogic.less20(59));
		assertEquals(false, testLogic.less20(20));
    }
	
	@Test
    public void nearTenTest(){
		assertEquals(true, testLogic.nearTen(12));
		assertEquals(false, testLogic.nearTen(17));
		assertEquals(true, testLogic.nearTen(19));
    }
	
	@Test
    public void sortaSumTest(){
		assertEquals(7   , testLogic.sortaSum(3, 4));
		assertEquals(20  , testLogic.sortaSum(9, 4));
		assertEquals(21  , testLogic.sortaSum(10, 11));
    }
	
	@Test
    public void in1To10Test(){
		assertEquals(true, testLogic.in1To10(5, false));
		assertEquals(false, testLogic.in1To10(11, false));
		assertEquals(true, testLogic.in1To10(11, true));
    }
	
	@Test
    public void teenSumTest(){
		assertEquals(7   , testLogic.teenSum(3, 4));
		assertEquals(19  , testLogic.teenSum(10, 13));
		assertEquals(19  , testLogic.teenSum(13, 2));
    }

	@Test
    public void love6Test(){
		assertEquals(true, testLogic.love6(6, 4));
		assertEquals(false, testLogic.love6(4, 5));
		assertEquals(true, testLogic.love6(1, 5));
    }
	
	@Test
    public void lastDigitTest(){
		assertEquals(true, testLogic.lastDigit(23, 19, 13));
		assertEquals(false, testLogic.lastDigit(23, 19, 12));
		assertEquals(true, testLogic.lastDigit(23, 19, 3));
    }

	@Test
    public void answerCellTest(){
		assertEquals(true, testLogic.answerCell(false, false, false));
		assertEquals(false, testLogic.answerCell(false, false, true));
		assertEquals(false, testLogic.answerCell(true, false, false));
    }
	
	@Test
    public void alarmClockTest(){
		assertEquals("7:00", testLogic.alarmClock(1, false));
		assertEquals("7:00", testLogic.alarmClock(5, false));
		assertEquals("10:00", testLogic.alarmClock(0, false));
    }

	@Test
    public void teaPartyTest(){
		assertEquals(1   , testLogic.teaParty(6, 8));
		assertEquals(0   , testLogic.teaParty(3, 8));
		assertEquals(2   , testLogic.teaParty(20, 6));
    }
	
	@Test
    public void redTicketTest(){
		assertEquals(10  , testLogic.redTicket(2, 2, 2));
		assertEquals(0   , testLogic.redTicket(2, 2, 1));
		assertEquals(5   , testLogic.redTicket(0, 0, 0));
    }
	
	@Test
    public void greenTicketTest(){
		assertEquals(0   , testLogic.greenTicket(1, 2, 3));
		assertEquals(20  , testLogic.greenTicket(2, 2, 2));
		assertEquals(10  , testLogic.greenTicket(1, 1, 2));
    }
	
	@Test
    public void squirrelPlayTest(){
		assertEquals(true, testLogic.squirrelPlay(70, false));
		assertEquals(false, testLogic.squirrelPlay(95, false));
		assertEquals(true, testLogic.squirrelPlay(95, true));
    }
	
	@Test
    public void caughtSpeedingTest(){
		assertEquals(0   , testLogic.caughtSpeeding(60, false));
		assertEquals(1   , testLogic.caughtSpeeding(65, false));
		assertEquals(0   , testLogic.caughtSpeeding(65, true));
    }
	
	@Test
    public void dateFashionTest(){
		assertEquals(2   , testLogic.dateFashion(5, 10));
		assertEquals(0   , testLogic.dateFashion(5, 2));
		assertEquals(1   , testLogic.dateFashion(5, 5));
    }
	
	@Test
    public void fizzString2Test(){
		assertEquals("1!", testLogic.fizzString2(1));
		assertEquals("Buzz!", testLogic.fizzString2(5));
		assertEquals("Fizz!", testLogic.fizzString2(3));
		assertEquals("FizzBuzz!", testLogic.fizzString2(15));
    }
	
	@Test
    public void sodaPartyTest(){
		assertEquals(false, testLogic.sodaParty(30, false));
		assertEquals(true, testLogic.sodaParty(50, false));
		assertEquals(true, testLogic.sodaParty(70, true));
    }
	
}
