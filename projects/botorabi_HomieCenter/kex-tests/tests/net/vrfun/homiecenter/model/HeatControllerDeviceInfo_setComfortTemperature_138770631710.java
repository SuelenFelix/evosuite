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

public class HeatControllerDeviceInfo_setComfortTemperature_138770631710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3395;
     Object term3481;

    public HeatControllerDeviceInfo_setComfortTemperature_138770631710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3395 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term3395, term3395.getClass(), "batteryLow", false);
        setIntField(term3395, term3395.getClass(), "batteryLevel", -2015854073);
        setIntField(term3395, term3395.getClass(), "currentTemperature", 538259104);
        setIntField(term3395, term3395.getClass(), "setTemperature", 96566506);
        setIntField(term3395, term3395.getClass(), "comfortTemperature", -343325701);
        setIntField(term3395, term3395.getClass(), "economyTemperature", 107945604);
        setBooleanField(term3395, term3395.getClass(), "windowOpen", true);
        setIntField(term3395, term3395.getClass(), "errorCode", -1963464809);
        setField(term3395, term3395.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term3395, term3395.getClass(), "id", "iNwOJRBEjp");
        setField(term3395, term3395.getClass(), "ain", "XylxrMBraH");
        setField(term3395, term3395.getClass(), "name", "pORebkoRdD");
        setField(term3395, term3395.getClass(), "firmware", "mXGCWJDOqA");
        setField(term3395, term3395.getClass(), "productName", "dpNsDgfPso");
        setBooleanField(term3395, term3395.getClass(), "present", false);
        term3481 = new Integer(71190297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3481;
        callMethod(klass, "setComfortTemperature", argTypes, term3395, args);
    }

};


