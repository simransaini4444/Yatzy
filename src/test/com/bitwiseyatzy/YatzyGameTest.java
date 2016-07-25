package com.bitwiseyatzy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Simran on 7/23/2016.
 */
public class YatzyGameTest {
        @Test
        public void yatzyScoreWhenAllDiceShowSameNumber_50()
        {
            //given
            Yatzy yatzy=new Yatzy(1,1,1,1,1);
            //when
            int actual=yatzy.scoreYatzyCondition();
            //then
            int expected=50;
            Assert.assertEquals(expected,actual);
        }
        @Test
    public void yatzyScoreWhenAllDiceDoNotShowSameNumber_0()
    {
        //given
        Yatzy yatzy=new Yatzy(1,1,1,1,2);
        //when
        int actual=yatzy.scoreYatzyCondition();
        //then
        int expected=0;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void yatzyScoreSumOfAllDicesOnChanceCondition()
    {
        //given
        Yatzy yatzy=new Yatzy(1,4,6,2,3);
        //when
        int actual=yatzy.scoreWhenChanceCondition();
        //then
        int expected=16;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void yatzyScoreWhenThreeOfKind()
    {
        //given
        Yatzy yatzy=new Yatzy(4,4,5,5,5);
        Yatzy yatzy1=new Yatzy(1,5,5,5,5);
        Yatzy yatzy2=new Yatzy(1,4,3,5,5);
        //when
        int actual=yatzy.threeOfKind();
        //then
        int expected=15;
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(15,yatzy1.threeOfKind());
        Assert.assertEquals(0,yatzy2.threeOfKind());
    }
    @Test
    public void yatzyScoreWhenFourOfKind()
    {
        //given
        Yatzy yatzy=new Yatzy(1,5,5,5,5);
        Yatzy yatzy1=new Yatzy(4,4,5,5,5);
        Yatzy yatzy2=new Yatzy(3,4,3,3,3);
        //when
        int actual=yatzy.fourOfKind();
        //then
        int expected=20;
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(0,yatzy1.fourOfKind());
        Assert.assertEquals(12,yatzy2.fourOfKind());
    }
    @Test
    public void yatzyScoreWhenOnes()
    {
        //given
        Yatzy yatzy=new Yatzy(1,2,1,1,5);
        Yatzy yatzy1=new Yatzy(1,1,1,5,1);
        //when
        int actual=yatzy.ones();
        int actual1=yatzy1.ones();
        //then
        int expected=3;
        int expected1=4;
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected1,actual1);
    }
    @Test
    public void yatzyScoreWhenTwos()
    {
        //given
        Yatzy yatzy=new Yatzy(1,2,1,2,5);
        Yatzy yatzy1=new Yatzy(1,2,2,2,1);
        //when
        //then
        Assert.assertEquals(4,yatzy.twos());
        Assert.assertEquals(6,yatzy1.twos());
    }
    @Test
    public void yatzyScoreWhenThrees()
    {
        //given
        Yatzy yatzy=new Yatzy(1,3,1,3,5);
        Yatzy yatzy1=new Yatzy(1,3,2,2,1);
        //when
        //then
        Assert.assertEquals(6,yatzy.threes());
        Assert.assertEquals(3,yatzy1.threes());
    }
    @Test
    public void yatzyScoreWhenFours()
    {
        //given
        Yatzy yatzy=new Yatzy(1,4,1,4,4);
        Yatzy yatzy1=new Yatzy(1,4,2,4,1);
        //when
        //then
        Assert.assertEquals(12,yatzy.fours());
        Assert.assertEquals(8,yatzy1.fours());
    }
    @Test
    public void yatzyScoreWhenFives()
    {
        //given
        Yatzy yatzy=new Yatzy(1,5,5,5,5);
        Yatzy yatzy1=new Yatzy(1,5,5,4,1);
        //when
        //then
        Assert.assertEquals(20,yatzy.fives());
        Assert.assertEquals(10,yatzy1.fives());
    }
    @Test
    public void yatzyScoreWhenSixes()
    {
        //given
        Yatzy yatzy=new Yatzy(1,6,2,6,6);
        Yatzy yatzy1=new Yatzy(1,6,2,6,1);
        //when
        //then
        Assert.assertEquals(18,yatzy.sixes());
        Assert.assertEquals(12,yatzy1.sixes());
    }
    @Test
    public void yatzyScoreWhenSmallStraight()
    {
        //given
        Yatzy yatzy=new Yatzy(5,2,4,1,3);
        Yatzy yatzy1=new Yatzy(1,2,3,4,5);
        Yatzy yatzy2=new Yatzy(1,6,2,6,1);
        //when
        //then
        Assert.assertEquals(15,yatzy.smallStraight());
        Assert.assertEquals(15,yatzy1.smallStraight());
        Assert.assertEquals(0,yatzy2.smallStraight());
    }


    @Test
    public void yatzyScoreWhenLargeStraight()
    {
        //given
        Yatzy yatzy=new Yatzy(5,2,4,6,3);
        Yatzy yatzy1=new Yatzy(2,3,4,5,6);
        Yatzy yatzy2=new Yatzy(1,6,2,6,1);
        //when
        //then
        Assert.assertEquals(20,yatzy.largeStraight());
        Assert.assertEquals(20,yatzy1.largeStraight());
        Assert.assertEquals(0,yatzy2.largeStraight());
    }
    @Test
    public void yatzyScoreWhenFullHouse()
    {
        //given
        Yatzy yatzy=new Yatzy(5,5,4,4,4);
        //when
        int actual=yatzy.fullHouse();
        //then
        int expected=22;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void yatzyScoreWhenPair()
    {
        //given
        Yatzy yatzy=new Yatzy(3,5,3,5,4);
        //when
        int actual=yatzy.pair();
        //then
        int expected=10;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void yatzyScoreWhenTwoPair()
    {
        //given
        Yatzy yatzy=new Yatzy(3,5,3,5,4);
        //when
        int actual=yatzy.twoPair();
        //then
        int expected=16;
        Assert.assertEquals(expected,actual);
    }
}


