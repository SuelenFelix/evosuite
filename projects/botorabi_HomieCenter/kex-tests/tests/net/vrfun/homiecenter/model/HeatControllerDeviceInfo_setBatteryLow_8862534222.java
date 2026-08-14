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
import java.lang.Boolean;

public class HeatControllerDeviceInfo_setBatteryLow_8862534222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2187;
     Object term2273;

    public HeatControllerDeviceInfo_setBatteryLow_8862534222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2187 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term2187, term2187.getClass(), "batteryLow", true);
        setIntField(term2187, term2187.getClass(), "batteryLevel", -478195677);
        setIntField(term2187, term2187.getClass(), "currentTemperature", 972867650);
        setIntField(term2187, term2187.getClass(), "setTemperature", 1655935355);
        setIntField(term2187, term2187.getClass(), "comfortTemperature", -481533957);
        setIntField(term2187, term2187.getClass(), "economyTemperature", 1240914516);
        setBooleanField(term2187, term2187.getClass(), "windowOpen", true);
        setIntField(term2187, term2187.getClass(), "errorCode", -1465035361);
        setField(term2187, term2187.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term2187, term2187.getClass(), "id", "oVgzLbrsFr");
        setField(term2187, term2187.getClass(), "ain", "vQVyKLdtaz");
        setField(term2187, term2187.getClass(), "name", "OWKQODBLzb");
        setField(term2187, term2187.getClass(), "firmware", "wGmYcqUkgE");
        setField(term2187, term2187.getClass(), "productName", "idgaQsnJpQ");
        setBooleanField(term2187, term2187.getClass(), "present", true);
        term2273 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2273;
        callMethod(klass, "setBatteryLow", argTypes, term2187, args);
    }

};


