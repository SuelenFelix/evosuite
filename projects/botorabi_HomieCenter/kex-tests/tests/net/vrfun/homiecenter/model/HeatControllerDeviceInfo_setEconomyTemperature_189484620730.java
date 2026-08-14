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

public class HeatControllerDeviceInfo_setEconomyTemperature_189484620730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4723;
     Object term4733;

    public HeatControllerDeviceInfo_setEconomyTemperature_189484620730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4723 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term4723, term4723.getClass(), "batteryLow", false);
        setIntField(term4723, term4723.getClass(), "batteryLevel", 0);
        setIntField(term4723, term4723.getClass(), "currentTemperature", 0);
        setIntField(term4723, term4723.getClass(), "setTemperature", 0);
        setIntField(term4723, term4723.getClass(), "comfortTemperature", 0);
        setIntField(term4723, term4723.getClass(), "economyTemperature", 0);
        setBooleanField(term4723, term4723.getClass(), "windowOpen", false);
        setIntField(term4723, term4723.getClass(), "errorCode", 0);
        setField(term4723, term4723.getClass(), "deviceType", null);
        setField(term4723, term4723.getClass(), "id", null);
        setField(term4723, term4723.getClass(), "ain", null);
        setField(term4723, term4723.getClass(), "name", null);
        setField(term4723, term4723.getClass(), "firmware", null);
        setField(term4723, term4723.getClass(), "productName", null);
        setBooleanField(term4723, term4723.getClass(), "present", false);
        term4733 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4733;
        callMethod(klass, "setEconomyTemperature", argTypes, term4723, args);
    }

};


