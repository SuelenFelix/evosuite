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

public class HeatControllerDeviceInfo_isBatteryLow_1064898921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2037;

    public HeatControllerDeviceInfo_isBatteryLow_1064898921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2037 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term2037, term2037.getClass(), "batteryLow", true);
        setIntField(term2037, term2037.getClass(), "batteryLevel", 1265463001);
        setIntField(term2037, term2037.getClass(), "currentTemperature", 335112684);
        setIntField(term2037, term2037.getClass(), "setTemperature", 1551099402);
        setIntField(term2037, term2037.getClass(), "comfortTemperature", -2027534003);
        setIntField(term2037, term2037.getClass(), "economyTemperature", 1063420942);
        setBooleanField(term2037, term2037.getClass(), "windowOpen", true);
        setIntField(term2037, term2037.getClass(), "errorCode", 1375330971);
        setField(term2037, term2037.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term2037, term2037.getClass(), "id", "IgRJUzaCwW");
        setField(term2037, term2037.getClass(), "ain", "JUmudUmaaV");
        setField(term2037, term2037.getClass(), "name", "KoyGrUJeJW");
        setField(term2037, term2037.getClass(), "firmware", "HqBOwkVqjD");
        setField(term2037, term2037.getClass(), "productName", "MAcUBcBckh");
        setBooleanField(term2037, term2037.getClass(), "present", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBatteryLow", argTypes, term2037, args);
    }

};


