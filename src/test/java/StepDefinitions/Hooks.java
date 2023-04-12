package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {


    @After
    public void after(Scenario senaryo){
        System.out.println("Senaryo bitti");

        //ExcelUtility.writeExcel("src/test/java/ApachePOI/Resource/ScenarioStatus.xlsx",
             //   senaryo, GWD.threadBrowserGet());

        if (senaryo.isFailed()){
            // extend report da çalışan kısım
//            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
//            final byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
//            senaryo.attach(hafizadakiHali, "image/png","screenshot name");
        }

        GWD.quitDriver();
    }

}
