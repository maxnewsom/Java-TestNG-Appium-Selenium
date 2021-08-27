package com.saucelabs.yy.Tests.Appium.Devices.Apple;

import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class DeviceTests extends TestBase {

    @Test(dataProvider = "RDCDataProvider")
    public void checkForSignedInAppleID(String platform, String deviceName, String platformVersion, Method methodName) throws MalformedURLException {
        createDriver(platform, deviceName, platformVersion, methodName.getName());

        driver.get().activateApp("com.apple.Preferences");
        String result = ocr.get().getText(driver.get().getScreenshotAs(OutputType.FILE));

        Assert.assertTrue(result.contains("Sign in to your iPhone") || result.contains("Sign in to your iPad") || result.contains("Sign in to your iPod"));
    }
}
