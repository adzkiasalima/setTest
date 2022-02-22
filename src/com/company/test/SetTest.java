package com.company.test;

import com.company.set.Set;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class SetTest {

    @BeforeEach
    public void initiate(){

    }

    @Test
    public void shouldReturnFalseWhenSetAdded() {
        Set ourSet = new Set();
        ourSet.add("Jore");
        Assert.assertEquals(ourSet.isEmpty(), false);
    }

    @Test
    public void containsTest(){
        Set ourSet = new Set();
        ourSet.delete("ok");
        ourSet.add("Jore");
        ourSet.add("kelly");

        Assert.assertEquals(ourSet.contains("kelly"), true);
        Assert.assertEquals(ourSet.contains("Jore"), true);
        Assert.assertEquals(ourSet.contains("Syantik"), false);
        Assert.assertEquals(ourSet.size(), 2);

        ourSet.delete("kelly");
        Assert.assertEquals(ourSet.contains("kelly"), false);
        Assert.assertEquals(ourSet.size(), 1);

        ourSet.add("nyonke");
        Assert.assertEquals(ourSet.contains("nyonke"),true);
    }

//    @Test void deleteTest(){
//        Set ourSet = new Set();
//        ourSet.add("syantiko");
//    }


}
