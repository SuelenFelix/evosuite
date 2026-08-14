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

public class HeatControllerDeviceInfo_getCurrentTemperature_181905245223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4647;

    public HeatControllerDeviceInfo_getCurrentTemperature_181905245223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4647 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term4647, term4647.getClass(), "batteryLow", false);
        setIntField(term4647, term4647.getClass(), "batteryLevel", 0);
        setIntField(term4647, term4647.getClass(), "currentTemperature", 0);
        setIntField(term4647, term4647.getClass(), "setTemperature", 0);
        setIntField(term4647, term4647.getClass(), "comfortTemperature", 0);
        setIntField(term4647, term4647.getClass(), "economyTemperature", 0);
        setBooleanField(term4647, term4647.getClass(), "windowOpen", false);
        setIntField(term4647, term4647.getClass(), "errorCode", 0);
        setField(term4647, term4647.getClass(), "deviceType", null);
        setField(term4647, term4647.getClass(), "id", null);
        setField(term4647, term4647.getClass(), "ain", null);
        setField(term4647, term4647.getClass(), "name", null);
        setField(term4647, term4647.getClass(), "firmware", null);
        setField(term4647, term4647.getClass(), "productName", null);
        setBooleanField(term4647, term4647.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentTemperature", argTypes, term4647, args);
    }

};


