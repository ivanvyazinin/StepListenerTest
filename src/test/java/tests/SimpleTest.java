package tests;

import org.testng.annotations.Test;

import static step.SimpleStep.step;

public class SimpleTest {

    @Test
    public void executeStep(){
        System.out.println("Into test");
        step();
    }
}
