package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.CartSteps;
import org.fasttrack.steps.LoginSteps;
import org.fasttrack.steps.RegisterSteps;
import org.fasttrack.steps.SearchSteps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import utils.EnvConstants;


@RunWith(SerenityRunner.class)



    public class BaseTest {

        @Managed(uniqueSession = true)
        private WebDriver driver;


        @Before
    public void maximise (){
            driver.manage().window().maximize();
            driver.get(EnvConstants.BASE_URL);
        }


        @Steps
    protected RegisterSteps registerSteps;

        @Steps
    protected LoginSteps loginSteps;

        @Steps
    protected SearchSteps searchSteps;

        @Steps
    protected CartSteps cartSteps;





}
