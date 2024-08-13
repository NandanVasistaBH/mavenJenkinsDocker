package com.telstra.app;
import src.main.java.com.telstra.app.App;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTest {
    @Test
    public void testGreating(){
        App app = new App();
        assertEquals("Good Morning",app.greetings());
    }
}
