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

public class HeatControllerDeviceInfo_getComfortTemperature_85136184127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4691;

    public HeatControllerDeviceInfo_getComfortTemperature_85136184127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4691 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term4691, term4691.getClass(), "batteryLow", false);
        setIntField(term4691, term4691.getClass(), "batteryLevel", 0);
        setIntField(term4691, term4691.getClass(), "currentTemperature", 0);
        setIntField(term4691, term4691.getClass(), "setTemperature", 0);
        setIntField(term4691, term4691.getClass(), "comfortTemperature", 0);
        setIntField(term4691, term4691.getClass(), "economyTemperature", 0);
        setBooleanField(term4691, term4691.getClass(), "windowOpen", false);
        setIntField(term4691, term4691.getClass(), "errorCode", 0);
        setField(term4691, term4691.getClass(), "deviceType", null);
        setField(term4691, term4691.getClass(), "id", null);
        setField(term4691, term4691.getClass(), "ain", null);
        setField(term4691, term4691.getClass(), "name", null);
        setField(term4691, term4691.getClass(), "firmware", null);
        setField(term4691, term4691.getClass(), "productName", null);
        setBooleanField(term4691, term4691.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComfortTemperature", argTypes, term4691, args);
    }

};


