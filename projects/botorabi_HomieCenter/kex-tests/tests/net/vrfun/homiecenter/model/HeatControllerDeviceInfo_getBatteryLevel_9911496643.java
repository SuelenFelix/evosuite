package net.vrfun.homiecenter.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static net.vrfun.homiecenter.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HeatControllerDeviceInfo_getBatteryLevel_9911496643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2339;

    public HeatControllerDeviceInfo_getBatteryLevel_9911496643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2339 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term2339, term2339.getClass(), "batteryLow", true);
        setIntField(term2339, term2339.getClass(), "batteryLevel", 1090617576);
        setIntField(term2339, term2339.getClass(), "currentTemperature", -1547384488);
        setIntField(term2339, term2339.getClass(), "setTemperature", 1442160736);
        setIntField(term2339, term2339.getClass(), "comfortTemperature", 1114000454);
        setIntField(term2339, term2339.getClass(), "economyTemperature", -556405712);
        setBooleanField(term2339, term2339.getClass(), "windowOpen", true);
        setIntField(term2339, term2339.getClass(), "errorCode", -1772434990);
        setField(term2339, term2339.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term2339, term2339.getClass(), "id", "VgZnGoIFwQ");
        setField(term2339, term2339.getClass(), "ain", "jUbSRrkrYZ");
        setField(term2339, term2339.getClass(), "name", "bWWfajKbEX");
        setField(term2339, term2339.getClass(), "firmware", "cAPeiZHKGJ");
        setField(term2339, term2339.getClass(), "productName", "LvJFtLBaxj");
        setBooleanField(term2339, term2339.getClass(), "present", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBatteryLevel", argTypes, term2339, args);
    }

};


