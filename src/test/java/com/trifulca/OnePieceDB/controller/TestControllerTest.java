package com.trifulca.OnePieceDB.controller;

import lombok.AllArgsConstructor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class TestControllerTest {

    private TestController testController;

    @Test
    public void testControllerTest(){
        testController = new TestController();
        String response = testController.testEndpoint("test");
        Assert.assertEquals(response, "You sent the following word: test");
    }
}
