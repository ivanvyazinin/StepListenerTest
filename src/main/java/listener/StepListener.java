package listener;

import io.qameta.allure.listener.StepLifecycleListener;
import io.qameta.allure.model.StepResult;

public class StepListener implements StepLifecycleListener {
    @Override
    public void beforeStepStart(StepResult result) {
        System.out.println("Into StepListener");
    }
}
