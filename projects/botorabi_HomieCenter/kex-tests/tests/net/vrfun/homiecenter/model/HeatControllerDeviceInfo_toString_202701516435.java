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

public class HeatControllerDeviceInfo_toString_202701516435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4779;

    public HeatControllerDeviceInfo_toString_202701516435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4779 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term4779, term4779.getClass(), "batteryLow", false);
        setIntField(term4779, term4779.getClass(), "batteryLevel", 0);
        setIntField(term4779, term4779.getClass(), "currentTemperature", 0);
        setIntField(term4779, term4779.getClass(), "setTemperature", 0);
        setIntField(term4779, term4779.getClass(), "comfortTemperature", 0);
        setIntField(term4779, term4779.getClass(), "economyTemperature", 0);
        setBooleanField(term4779, term4779.getClass(), "windowOpen", false);
        setIntField(term4779, term4779.getClass(), "errorCode", 0);
        setField(term4779, term4779.getClass(), "deviceType", null);
        setField(term4779, term4779.getClass(), "id", null);
        setField(term4779, term4779.getClass(), "ain", null);
        setField(term4779, term4779.getClass(), "name", null);
        setField(term4779, term4779.getClass(), "firmware", null);
        setField(term4779, term4779.getClass(), "productName", null);
        setBooleanField(term4779, term4779.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4779, args);
    }

};


