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
import java.lang.Integer;

public class HeatControllerDeviceInfo_setComfortTemperature_138770631728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4701;
     Object term4711;

    public HeatControllerDeviceInfo_setComfortTemperature_138770631728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4701 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term4701, term4701.getClass(), "batteryLow", false);
        setIntField(term4701, term4701.getClass(), "batteryLevel", 0);
        setIntField(term4701, term4701.getClass(), "currentTemperature", 0);
        setIntField(term4701, term4701.getClass(), "setTemperature", 0);
        setIntField(term4701, term4701.getClass(), "comfortTemperature", 0);
        setIntField(term4701, term4701.getClass(), "economyTemperature", 0);
        setBooleanField(term4701, term4701.getClass(), "windowOpen", false);
        setIntField(term4701, term4701.getClass(), "errorCode", 0);
        setField(term4701, term4701.getClass(), "deviceType", null);
        setField(term4701, term4701.getClass(), "id", null);
        setField(term4701, term4701.getClass(), "ain", null);
        setField(term4701, term4701.getClass(), "name", null);
        setField(term4701, term4701.getClass(), "firmware", null);
        setField(term4701, term4701.getClass(), "productName", null);
        setBooleanField(term4701, term4701.getClass(), "present", false);
        term4711 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4711;
        callMethod(klass, "setComfortTemperature", argTypes, term4701, args);
    }

};


