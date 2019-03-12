package step;

import io.qameta.allure.Step;

public class SimpleStep {

    @Step("simple step")
    public static void step(){
        System.out.println("Into Step");
    }
}
